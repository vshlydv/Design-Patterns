package questions.snakeAndLadder.model.jump;

public class Ladder extends Jump {
    public Ladder(int start, int end) {
        super(start, end);
    }

    @Override
    String getType() {
        return "Ladder";
    }
}
