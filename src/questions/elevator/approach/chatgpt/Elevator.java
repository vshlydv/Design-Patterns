package questions.elevator.approach.chatgpt;

import questions.elevator.approach.chatgpt.Direction;
import questions.elevator.approach.chatgpt.ElevatorState;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Elevator {
    private int id;
    private int currentFloor;
    private Direction direction;
    private ElevatorState state;
    private PriorityQueue<Integer> upQueue;
    private PriorityQueue<Integer> downQueue;

    public Elevator(int id) {
        this.id = id;
        this.currentFloor = 0; // Ground floor
        this.direction = Direction.IDLE;
        this.state = ElevatorState.IDLE;
        this.upQueue = new PriorityQueue<>();
        this.downQueue = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public int getId() {
        return id;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void addRequest(int floor) {
        if (floor > currentFloor) {
            upQueue.offer(floor);
        } else {
            downQueue.offer(floor);
        }
        updateState();
    }

    public void move() {
        if (direction == Direction.UP && !upQueue.isEmpty()) {
            currentFloor = upQueue.poll();
        } else if (direction == Direction.DOWN && !downQueue.isEmpty()) {
            currentFloor = downQueue.poll();
        }
        updateState();
    }

    private void updateState() {
        if (!upQueue.isEmpty()) {
            direction = Direction.UP;
            state = ElevatorState.MOVING;
        } else if (!downQueue.isEmpty()) {
            direction = Direction.DOWN;
            state = ElevatorState.MOVING;
        } else {
            direction = Direction.IDLE;
            state = ElevatorState.IDLE;
        }
    }

    public ElevatorState getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Elevator " + id + " at floor " + currentFloor + ", Direction: " + direction + ", State: " + state;
    }
}