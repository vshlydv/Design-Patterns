package questions.splitwiseApp.Split.Strategy;

public class SplitStrategyFactory {
    private static EqualSplitStrategy equalSplitStrategy = new EqualSplitStrategy();
    private static UnequalSplitStrategy unequalSplitStrategy = new UnequalSplitStrategy();
    private static PercentageSplitStrategy percentageSplitStrategy = new PercentageSplitStrategy();
    private static ShareSplitStrategy shareSplitStrategy = new ShareSplitStrategy();

    public static SplitStrategy getSplitStrategy(String type) {
        if ("equal".equalsIgnoreCase(type)) {
            return equalSplitStrategy;
        }
        if ("unequal".equalsIgnoreCase(type)) {
            return unequalSplitStrategy;
        }
        if ("percentage".equalsIgnoreCase(type)) {
            return percentageSplitStrategy;
        }
        if ("share".equalsIgnoreCase(type)) {
            return shareSplitStrategy;
        }
        return null;
    }

}
