package questions.splitwiseApp.Split;

import questions.splitwiseApp.Member.Member;

public class Split {
    double amount;
    double percentage;
    double share;
    Member member;

    public Split(double amount, double percentage, double share, Member member) {
        this.amount = amount;
        this.percentage = percentage;
        this.member = member;
        this.share = share;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Member getMember() {
        return member;
    }

    public double getPercentage() {
        return percentage;
    }

    public double getShare() {
        return share;
    }
}
