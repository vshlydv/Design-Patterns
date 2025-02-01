package questions.elevator.approach.chatgpt;

import questions.elevator.approach.chatgpt.Direction;

public class Request {
    int floor;
    Direction direction; // Used for external requests

    public Request(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }
}