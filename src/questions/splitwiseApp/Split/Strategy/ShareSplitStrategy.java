package questions.splitwiseApp.Split.Strategy;

import questions.splitwiseApp.Split.Split;

import java.util.List;

public class ShareSplitStrategy implements SplitStrategy {
    @Override
    public boolean validateSplit(double totalAmount, List<Split> splits) {
        double computedTotalAmount = 0;
        int totalParts = splits.size();
        for (Split split: splits) {
            double amount = totalAmount * split.getShare() / totalParts;
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
