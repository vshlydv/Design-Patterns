package questions.elevator.approach.javastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

class Elevator {
    private Direction currentDirection = Direction.UP;
    private State currentState = State.IDLE;
    private int currentFloor = 0;

    /**
     * jobs which are being processed
     */
    volatile private TreeSet<Request> currentJobs = new TreeSet<>();
    /**
     * up jobs which cannot be processed now so put in pending queue
     */
    volatile private TreeSet<Request> upPendingJobs = new TreeSet<>();
    /**
     * down jobs which cannot be processed now so put in pending queue
     */
    volatile private TreeSet<Request> downPendingJobs = new TreeSet<>();

    public void startElevator() {
        System.out.println("The Elevator has started functioning");
        while (true) {

            if (checkIfJob()) {

                if (currentDirection == Direction.UP) {
                    Request request = currentJobs.pollFirst();
                    processUpRequest(request);
                    if (currentJobs.isEmpty()) {
                        addPendingDownJobsToCurrentJobs();

                    }

                }
                if (currentDirection == Direction.DOWN) {
                    Request request = currentJobs.pollLast();
                    processDownRequest(request);
                    if (currentJobs.isEmpty()) {
                        addPendingUpJobsToCurrentJobs();
                    }

                }
            }
        }
    }

    public boolean checkIfJob() {

        if (currentJobs.isEmpty()) {
            return false;
        }
        return true;

    }

    private void processUpRequest(Request request) {
        int startFloor = currentFloor;
        if (startFloor < request.getExternalRequest().getSourceFloor()) {
            for (int i = startFloor; i <= request.getExternalRequest().getSourceFloor(); i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("We have reached floor -- " + i);
                currentFloor = i;
            }
        }

        System.out.println("Reached Source Floor--opening door");

        startFloor = currentFloor;

        for (int i = startFloor + 1; i <= request.getInternalRequest().getDestinationFloor(); i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("We have reached floor -- " + i);
            currentFloor = i;
            if (checkIfNewJobCanBeProcessed(request)) {
                break;
            }
        }

    }

    private void processDownRequest(Request request) {

        int startFloor = currentFloor;
        if (startFloor < request.getExternalRequest().getSourceFloor()) {
            for (int i = startFloor; i <= request.getExternalRequest().getSourceFloor(); i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("We have reached floor -- " + i);
                currentFloor = i;
            }
        }

        System.out.println("Reached Source Floor--opening door");

        startFloor = currentFloor;

        for (int i = startFloor - 1; i >= request.getInternalRequest().getDestinationFloor(); i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("We have reached floor -- " + i);
            currentFloor = i;
            if (checkIfNewJobCanBeProcessed(request)) {
                break;
            }
        }

    }

    private boolean checkIfNewJobCanBeProcessed(Request currentRequest) {
        if (checkIfJob()) {
            if (currentDirection == Direction.UP) {
                Request request = currentJobs.pollLast();
                if (request.getInternalRequest().getDestinationFloor() < currentRequest.getInternalRequest()
                                                                                 .getDestinationFloor()) {
                    currentJobs.add(request);
                    currentJobs.add(currentRequest);
                    return true;
                }
                currentJobs.add(request);

            }

            if (currentDirection == Direction.DOWN) {
                Request request = currentJobs.pollFirst();
                if (request.getInternalRequest().getDestinationFloor() > currentRequest.getInternalRequest()
                                                                                 .getDestinationFloor()) {
                    currentJobs.add(request);
                    currentJobs.add(currentRequest);
                    return true;
                }
                currentJobs.add(request);

            }

        }
        return false;

    }

    private void addPendingDownJobsToCurrentJobs() {
        if (!downPendingJobs.isEmpty()) {
            System.out.println("Pick a pending down job and execute it by putting in current job");
            currentJobs = downPendingJobs;
            currentDirection = Direction.DOWN;
        } else {
            currentState = State.IDLE;
            System.out.println("The elevator is in Idle state");
        }

    }

    private void addPendingUpJobsToCurrentJobs() {
        if (!upPendingJobs.isEmpty()) {
            System.out.println("Pick a pending up job and execute it by putting in current job");

            currentJobs = upPendingJobs;
            currentDirection = Direction.UP;
        } else {
            currentState = State.IDLE;
            System.out.println("The elevator is in Idle state");

        }

    }

    public void addJob(Request request) {
        if (currentState == State.IDLE) {
            // check if the elevator is already on the floor on which the user
            // is if yes then we can directly process the destination floor
            if (currentFloor == request.getExternalRequest().getSourceFloor()) {
                System.out.println("Added current queue job -- lift state is - " + currentState + " location is - "
                                           + currentFloor + " to move to floor - " +
                                           request.getInternalRequest().getDestinationFloor());
            }
            // check if the elevator is already on the floor on which the user
            // is if no then elevator first needs to move to source floor
            else {
                System.out.println("Added current queue job -- lift state is - " + currentState + " location is - "
                                           + currentFloor + " to move to floor - " +
                                           request.getExternalRequest().getSourceFloor());
            }
            currentState = State.MOVING;
            currentDirection = request.getExternalRequest().getDirectionToGo();
            currentJobs.add(request);
        } else if (currentState == State.MOVING) {

            if (request.getExternalRequest().getDirectionToGo() != currentDirection) {
                addtoPendingJobs(request);
            } else if (request.getExternalRequest().getDirectionToGo() == currentDirection) {
                if (currentDirection == Direction.UP
                            && request.getInternalRequest().getDestinationFloor() < currentFloor) {
                    addtoPendingJobs(request);
                } else if (currentDirection == Direction.DOWN
                                   && request.getInternalRequest().getDestinationFloor() > currentFloor) {
                    addtoPendingJobs(request);
                } else {
                    currentJobs.add(request);
                }

            }

        }

    }

    public void addtoPendingJobs(Request request) {
        if (request.getExternalRequest().getDirectionToGo() == Direction.UP) {
            System.out.println("Add to pending up jobs");
            upPendingJobs.add(request);
        } else {
            System.out.println("Add to pending down jobs");
            downPendingJobs.add(request);
        }
        List<Integer> ans = new ArrayList<>();

    }

}
