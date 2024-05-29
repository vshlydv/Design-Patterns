package questions.snakeAndLadder.model.dice;

public class Dice {

    private int min, max, diceCount;

    private DiceStrategy diceStrategy;

    public Dice(int min, int max, int diceCount, DiceStrategy diceStrategy) {
        this.min = min;
        this.max = max;
        this.diceCount = diceCount;
        this.diceStrategy = diceStrategy;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getDiceCount() {
        return diceCount;
    }

    public int rollDice() {
        return diceStrategy.getResult(this);
    }
}

