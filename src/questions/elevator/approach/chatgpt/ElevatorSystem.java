package questions.elevator.approach.chatgpt;

import java.util.*;

// Direction Enum
enum Direction {
    UP, DOWN, IDLE
}

// Elevator State Enum
enum ElevatorState {
    MOVING, STOPPED, IDLE
}

// ElevatorController Class
class ElevatorController {
    private List<Elevator> elevators;

    public ElevatorController(int numberOfElevators) {
        elevators = new ArrayList<>();
        for (int i = 1; i <= numberOfElevators; i++) {
            elevators.add(new Elevator(i));
        }
    }

    public void sendRequest(Request request) {
        Elevator bestElevator = findBestElevator(request);
        if (bestElevator != null) {
            bestElevator.addRequest(request.floor);
            System.out.println("Request for floor " + request.floor + " assigned to Elevator " + bestElevator.getId());
        }
    }

    private Elevator findBestElevator(Request request) {
        Elevator bestElevator = null;
        int minDistance = Integer.MAX_VALUE;

        for (Elevator elevator : elevators) {
            if (elevator.getState() == ElevatorState.IDLE ||
                        (elevator.getDirection() == request.direction &&
                                 ((request.direction == Direction.UP && elevator.getCurrentFloor() <= request.floor) ||
                                          (request.direction == Direction.DOWN && elevator.getCurrentFloor() >= request.floor)))) {
                int distance = Math.abs(elevator.getCurrentFloor() - request.floor);
                if (distance < minDistance) {
                    minDistance = distance;
                    bestElevator = elevator;
                }
            }
        }
        return bestElevator;
    }

    public void step() {
        for (Elevator elevator : elevators) {
            elevator.move();
        }
    }

    public void displayStatus() {
        for (Elevator elevator : elevators) {
            System.out.println(elevator);
        }
    }
}

// Main Class to Test the System
public class ElevatorSystem {
    public static void main(String[] args) {
        ElevatorController controller = new ElevatorController(3);

        controller.sendRequest(new Request(5, Direction.UP));
        controller.sendRequest(new Request(3, Direction.DOWN));
        controller.sendRequest(new Request(8, Direction.UP));

//        Thread systemStateThread = new Thread(() -> {
//            while (true) {
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                for (int i = 0; i < 10; i++) {
//                    controller.step();
//                    controller.displayStatus();
//                    System.out.println("-----");
//                }
//            }
//        });

        for (int i = 0; i < 10; i++) {
            controller.step();
            controller.displayStatus();
            System.out.println("-----");
        }

//        controller.sendRequest(new Request(5, Direction.UP));
//        controller.sendRequest(new Request(3, Direction.DOWN));
//        controller.sendRequest(new Request(8, Direction.UP));
    }
}
