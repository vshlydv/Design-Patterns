package questions.splitwiseApp;

import questions.splitwiseApp.Expense.ExpenseController;
import questions.splitwiseApp.Group.Group;
import questions.splitwiseApp.Group.GroupController;
import questions.splitwiseApp.Member.Member;
import questions.splitwiseApp.Member.MemberController;

import java.util.Scanner;

public class SplitWiseApp {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        MemberController memberController = MemberController.getMemberController();
        GroupController groupController = GroupController.getGroupController();
        ExpenseController expenseController = ExpenseController.getExpenseController();

        memberController.setControllers(groupController, expenseController);
        groupController.setMemberController(memberController);
        expenseController.setMemberController(memberController);

        Member vishal = memberController.createMember("vishal@gmail.com", "vishal");
        Member vedant = memberController.createMember("vedant@gmail.com", "vedant");
        Member vikash = memberController.createMember("vikash@gmail.com", "vikash");

        groupController.createInBuiltGroup("pune", vishal, vedant, vikash);

        while(true) {
            String name;
            System.out.println("Enter name to login: ");
            name = scanner.nextLine();

            Member loggedInmember = memberController.findMember(name);

            if (null == loggedInmember) {
                System.out.println("Oops, member not found");
                continue;
            }

            System.out.println("Hi, " + loggedInmember.getName());

            String command = "start";
            boolean isUserLogedIn = true;

            while(isUserLogedIn) {
                System.out.println("-------------------------------------------");
                System.out.println("Enter following code to perform corresponding action\n" +
                                           "1 -> Create group\n" +
                                           "2 -> Add expense\n" +
                                           "3 -> View balance sheet for " + loggedInmember.getName() + "\n" +
                                           "4 -> View groups\n" +
                                           "5 -> Logout");
                command = scanner.nextLine();
                switch (command) {
                    case "1" -> {
                        loggedInmember.createGroup();
                    }
                    case "2" -> {
                        System.out.println("Enter group in which want to add expense: ");
                        String groupName = scanner.nextLine();
                        loggedInmember.addGroupExpense(groupName);
                        System.out.println("Expense added successfully!");
                    }
                    case "3" -> {
                        loggedInmember.viewBalanceSheet();
                    }
                    case "4" -> {
                        if (loggedInmember.getPartOfGroups().isEmpty()) {
                            System.out.println("No groups found");
                            continue;
                        }
                        for (Group group: loggedInmember.getPartOfGroups()) {
                            System.out.println(group.getName() + " ");
                        }
                    }
                    case "5" -> {
                        System.out.println("Bye " + loggedInmember.getName() + "!");
                        isUserLogedIn = false;
                    }
                    default -> {
                        System.out.println("Unrecognized code");
                    }
                }

            }
        }

    }
}
