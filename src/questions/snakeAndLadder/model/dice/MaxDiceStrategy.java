package questions.snakeAndLadder.model.dice;

import java.util.concurrent.ThreadLocalRandom;

public class MaxDiceStrategy implements DiceStrategy {
    @Override
    public int getResult(Dice dice) {
        int result = Integer.MIN_VALUE;
        for (int i = 1; i <= dice.getDiceCount(); i++)
            result = Math.max(result, ThreadLocalRandom.current().nextInt(dice.getMin(), dice.getMax() + 1));
        return result;
    }
}
