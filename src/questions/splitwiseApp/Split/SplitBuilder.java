package questions.splitwiseApp.Split;

import questions.splitwiseApp.Member.Member;

public class SplitBuilder {
    double amount;
    double percentage;
    double share;
    Member member;

    public SplitBuilder setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public SplitBuilder setPercentage(double percentage) {
        this.percentage = percentage;
        return this;
    }

    public SplitBuilder setMember(Member member) {
        this.member = member;
        return this;
    }

    public SplitBuilder setShare(double share) {
        this.share = share;
        return this;
    }

    public Split build() {
        return new Split(amount, percentage, share, member);
    }
}