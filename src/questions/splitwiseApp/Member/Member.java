package questions.splitwiseApp.Member;

import questions.splitwiseApp.Expense.Expense;
import questions.splitwiseApp.Group.Group;

import java.util.*;

public class Member {
    String emailId;
    String name;
    BalanceSheet balanceSheet;
    List<Group> partOfGroups;
    List<Expense> nonGroupExpenses;

    MemberController memberController;

    public Member(String emailId, String name, MemberController memberController) {
        this.emailId = emailId;
        this.name = name;
        balanceSheet = new BalanceSheet(this);
        partOfGroups = new ArrayList<>();
        nonGroupExpenses = new ArrayList<>();
        this.memberController = memberController;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getName() {
        return name;
    }

    public List<Group> getPartOfGroups() {
        return partOfGroups;
    }

    public List<Expense> getNonGroupExpenses() {
        return nonGroupExpenses;
    }

    // TODO: change notification system
//    @Override
//    public void update(Observable o, Object arg) {
//        if (o instanceof Group) {
//            if (arg instanceof Expense expense) {
//                balanceSheet.updateBalanceSheet(expense, this);
//                System.out.println("Updated balance sheet for " + this.name);
//                balanceSheet.viewBalanceSheet();
//            } else {
//                System.out.println("Invalid object expected Expense");
//            }
//        } else {
//            System.out.println("Invalid object expected Group");
//        }
//    }

    public void createGroup() {
        // TODO: Enhancement | exception handling
        partOfGroups.add(memberController.createGroup(this));
    }

    public void addGroupExpense(String groupName) {
        memberController.addGroupExpense(groupName);
    }

    public void viewBalanceSheet() {
        balanceSheet.viewBalanceSheet();
    }

    public void updateBalanceSheet(Expense expense) {
        balanceSheet.updateBalanceSheet(expense);
    }

    public void addMemberAsFriend(Member member) {
        if (balanceSheet.isFriend(member)) return;
        this.balanceSheet.addFriend(member);
        member.addMemberAsFriend(this);
    }

    @Override
    public boolean equals(Object obj) {
        Member member;
        if (obj instanceof Member)
            member = (Member) obj;
        else
            return false;
        return Objects.equals(member.getEmailId(), emailId);
    }
}
