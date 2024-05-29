package questions.splitwiseApp.Split.Strategy;

import questions.splitwiseApp.Split.Split;

import java.util.List;

public class EqualSplitStrategy implements SplitStrategy {
    @Override
    public boolean validateSplit(double totalAmount, List<Split> splits) {
        int noOfMembers = splits.size();
        double sharePerMember = totalAmount / noOfMembers;
        for (Split split: splits) {
            if (split.getAmount() != sharePerMember) {
                System.out.println("Invalid split");
                return false;
            }
        }
        return true;
    }
}
