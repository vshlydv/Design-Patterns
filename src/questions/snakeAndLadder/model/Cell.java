package questions.snakeAndLadder.model;

import questions.snakeAndLadder.model.jump.Jump;

public class Cell {
    private Jump jump;

    public Jump getJump() {
        return jump;
    }

    public Cell setJump(Jump jump) {
        this.jump = jump;
        return this;
    }
}
