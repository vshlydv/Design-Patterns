package questions.snakeAndLadder.model.dice;

import java.util.concurrent.ThreadLocalRandom;

public class SumDiceStrategy implements DiceStrategy {
    @Override
    public int getResult(Dice dice) {
        int result = 0;
        for (int i = 1; i <= dice.getDiceCount(); i++) {
            result += ThreadLocalRandom.current().nextInt(dice.getMin(), dice.getMax() + 1);
            result %= dice.getMax() + 1;
        }
        return result ;
    }
}
