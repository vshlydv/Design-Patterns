package questions.splitwiseApp.Split.Strategy;

import questions.splitwiseApp.Split.Split;

import java.util.List;

public interface SplitStrategy {
    public boolean validateSplit(double totalAmount, List<Split> splits);
}
