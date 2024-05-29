package questions.splitwiseApp.Expense;

import questions.splitwiseApp.Member.Member;
import questions.splitwiseApp.Split.Split;
import questions.splitwiseApp.Split.Strategy.SplitStrategy;

import java.util.List;

public class Expense {
    String title;
    double amount;
    Member paidByMember;
    List<Split> owesSplits;
    SplitStrategy splitStrategy;

    public Expense(String title, double amount, List<Split> owesSplits, Member paidByMember, SplitStrategy splitStrategy) {
        this.title = title;
        this.amount = amount;
        this.paidByMember = paidByMember;
        this.owesSplits = owesSplits;
        this.splitStrategy = splitStrategy;
    }

    public String getTitle() {
        return title;
    }

    public double getAmount() {
        return amount;
    }

    public List<Split> getOwesSplits() {
        return owesSplits;
    }

    public Member getPaidByMember() {
        return paidByMember;
    }

    public SplitStrategy getSplitStrategy() {
        return splitStrategy;
    }

//    public List<Member> getInvolvedMembers() {
//        List<Member> involvedMembers = new ArrayList<>();
//        involvedMembers.addAll(SplitwiseUtility.getMemberFromShareList(paidBySplits));
//        involvedMembers.addAll(SplitwiseUtility.getMemberFromShareList(owesSplits));
//        return involvedMembers;
//    }


}
