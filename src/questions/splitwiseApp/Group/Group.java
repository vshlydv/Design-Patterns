package questions.splitwiseApp.Group;

import questions.splitwiseApp.Expense.Expense;
import questions.splitwiseApp.Member.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Group {
    String id;
    String name;
    List<Member> memberList;
    List<Expense> expenseList;
    GroupController groupController;

    public Group(String id, String name, GroupController groupController) {
        this.id = id;
        this.name = name;
        memberList = new ArrayList<>();
        expenseList = new ArrayList<>();
        this.groupController = groupController;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public List<Expense> getExpenseList() {
        return expenseList;
    }

    public boolean addMember(Member member) {
        if (memberList.contains(member)) {
            System.out.println("Member already part of the " + name + " group");
            return false;
        } else {
            memberList.add(member);
            return true;
        }
    }

    public boolean removeMember(Member member) {
        if (memberList.contains(member)) {
            memberList.remove(member);
            return true;
        } else {
            System.out.println(member.getName() + " is not part of the " + name + " group");
            return false;
        }
    }

    public void addExpense(Expense expense) {
        expenseList.add(expense);
    }

}
