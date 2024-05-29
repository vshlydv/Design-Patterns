package questions.snakeAndLadder.model.jump;

public class Snake extends Jump {
    public Snake(int start, int end) {
        super(start, end);
    }

    @Override
    String getType() {
        return "Snake";
    }
}
