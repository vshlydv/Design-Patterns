package questions.splitwiseApp.Member;

import questions.splitwiseApp.Expense.Expense;
import questions.splitwiseApp.Split.Split;

import java.util.*;

public class BalanceSheet {
    Map<Member, Double> balancesWithFriends;
    Member ownerMember;

    public BalanceSheet(Member ownerMember) {
        this.ownerMember = ownerMember;
        this.balancesWithFriends = new HashMap<>();
    }

    public void viewBalanceSheet() {
        System.out.println("-------------------------------------------");
        System.out.println("Balance sheet for user: " + ownerMember.getName());
        balancesWithFriends.forEach((Member member, Double amount) -> {
            if (amount >= 0)
                System.out.println(member.getName() + " owes: " + amount );
            else
                System.out.println(member.getName() + " gets back " + Math.abs(amount));
        });
        System.out.println("-------------------------------------------");
    }

    public void addFriend(Member member) {
        balancesWithFriends.put(member, 0.0);
    }

    public boolean isFriend(Member member) {
        return balancesWithFriends.containsKey(member);
    }

    public void updateBalanceSheet(Expense expense) {
        if (expense.getPaidByMember().equals(ownerMember)) {
            for (Split split: expense.getOwesSplits()) {
                if (!split.getMember().equals(ownerMember)) {
                    // TODO: Enhancement | Considering member involved in expense is already a friend of the owner member
                    balancesWithFriends.replace(split.getMember(), balancesWithFriends.get(split.getMember()) + split.getAmount());
                }
            }
        } else {
            for (Split split: expense.getOwesSplits()) {
                if (split.getMember().equals(ownerMember)) {
                    // TODO: Enhancement | Considering member involved in expense is already a friend of the owner member
                    balancesWithFriends.replace(expense.getPaidByMember(), balancesWithFriends.get(expense.getPaidByMember()) - split.getAmount());
                }
            }
        }
    }

}
