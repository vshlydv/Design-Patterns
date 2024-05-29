package questions.snakeAndLadder.model.jump;

public abstract class Jump {
    private int start, end;
    abstract String getType();

    public Jump(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}
