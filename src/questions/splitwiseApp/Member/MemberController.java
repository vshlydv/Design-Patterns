package questions.splitwiseApp.Member;

import questions.splitwiseApp.Expense.Expense;
import questions.splitwiseApp.Expense.ExpenseController;
import questions.splitwiseApp.Group.Group;
import questions.splitwiseApp.Group.GroupController;
import questions.splitwiseApp.Split.Split;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberController {
    static Map<String, Member> members;

    static MemberController memberController;

    static GroupController groupController;

    static ExpenseController expenseController;

    private final Scanner scanner = new Scanner(System.in);

    private MemberController() {
        members = new HashMap<>();
    }

    public void setControllers(GroupController groupController, ExpenseController expenseController) {
        MemberController.groupController = groupController;
        MemberController.expenseController = expenseController;
    }

    public static MemberController getMemberController() {
        if (null == memberController) {
            memberController = new MemberController();
        }
        return memberController;
    }

    public void createMember() {
        String email, name;
        System.out.println("Enter member email: ");
        email = scanner.nextLine();
        System.out.println("Enter member name: ");
        name = scanner.nextLine();
        Member member = new Member(email, name, this);
        members.put(name, member);
    }

    public Member createMember(String email, String name) {
        Member member = new Member(email, name, this);
        members.put(name, member);
        return member;
    }

    public Member findMember(String name) {
        return members.get(name);
    }

    public boolean findMember(Member member) {
        return null != members.get(member.getName());
    }

    public Group createGroup(Member member) {
        return groupController.createGroup(member);
    }

    public void addGroupExpense(String groupName) {
        Expense expense = expenseController.createExpense();
        groupController.addExpense(expense, groupName);
        for(Split split: expense.getOwesSplits()) {
            split.getMember().updateBalanceSheet(expense);
        }
    }
}
