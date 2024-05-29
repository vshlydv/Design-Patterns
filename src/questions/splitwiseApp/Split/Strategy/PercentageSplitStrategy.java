package questions.splitwiseApp.Split.Strategy;

import questions.splitwiseApp.Split.Split;

import java.util.List;

public class PercentageSplitStrategy implements SplitStrategy {
    @Override
    public boolean validateSplit(double totalAmount, List<Split> splits) {
        double computedTotalAmount = 0;
        for (Split split: splits) {
            double amount = totalAmount * split.getPercentage() * 0.01;
            split.setAmount(amount);
            computedTotalAmount += amount;
        }
        if (!(totalAmount == computedTotalAmount)) {
            System.out.println("Invalid split");
            return false;
        }
        return true;
    }
}
