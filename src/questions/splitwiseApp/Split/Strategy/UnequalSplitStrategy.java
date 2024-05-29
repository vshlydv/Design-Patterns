package questions.splitwiseApp.Split.Strategy;

import questions.splitwiseApp.Split.Split;

import java.util.List;

public class UnequalSplitStrategy implements SplitStrategy {
    @Override
    public boolean validateSplit(double totalAmount, List<Split> splits) {
        double computedTotalAmount = 0;
        for (Split split: splits) {
            computedTotalAmount += split.getAmount();
        }
        if (!(totalAmount == computedTotalAmount)) {
            System.out.println("Invalid split");
            return false;
        }
        return true;
    }
}
