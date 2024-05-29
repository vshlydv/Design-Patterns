package questions.snakeAndLadder.model;

public class Player {
    private String name;
    private int currPos;

    Player(String name) {
        this.name = name;
        currPos = 1;
    }

    public String getName() {
        return name;
    }

    public int getCurrPos() {
        return currPos;
    }
}
