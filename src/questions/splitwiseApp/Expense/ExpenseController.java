package questions.splitwiseApp.Expense;

import questions.splitwiseApp.Member.Member;
import questions.splitwiseApp.Member.MemberController;
import questions.splitwiseApp.Split.Split;
import questions.splitwiseApp.Split.SplitBuilder;
import questions.splitwiseApp.Split.Strategy.SplitStrategyFactory;
import questions.splitwiseApp.Split.Strategy.SplitStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpenseController {

    static ExpenseController expenseController;
    static MemberController memberController;
    private static final Scanner scanner = new Scanner(System.in);

    private ExpenseController() {}

    public static ExpenseController getExpenseController() {
        if (null == expenseController) {
            expenseController = new ExpenseController();
        }
        return expenseController;
    }

    public void setMemberController(MemberController memberController) {
        ExpenseController.memberController = memberController;
    }

    public Expense createExpense() {
        Expense expense;
        while (true) {
            String title, paidByMemberName, splitStrategyName, command = "start";
            double amount;
            List<Split> splits = new ArrayList<>();
            Member paidByMember;
            SplitStrategy splitStrategy;
            SplitBuilder splitBuilder = new SplitBuilder();

            System.out.println("Enter expense title");
            title = scanner.nextLine();

            System.out.println("Enter expense amount");
            amount = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Enter split strategy (equal, unequal): ");
            splitStrategyName = scanner.nextLine();
            splitStrategy = SplitStrategyFactory.getSplitStrategy(splitStrategyName);


            System.out.println("Enter member name who paid the expense: ");
            paidByMemberName = scanner.nextLine(); // TODO: Enhancement | Considering member exists
            paidByMember = memberController.findMember(paidByMemberName);

            System.out.println("Enter splits (type exit to stop)");

            while (true) {
                double shareAmount;
                System.out.println("Enter member name (type exit to stop) ");
                command = scanner.nextLine();

                if ("exit".equalsIgnoreCase(command))
                    break;

                System.out.println("Enter amount for " + command + ": ");
                shareAmount = scanner.nextDouble();
                scanner.nextLine();
                Member member = memberController.findMember(command);
                splits.add(splitBuilder.setAmount(shareAmount).setMember(member).build());
            }
            if (!splitStrategy.validateSplit(amount, splits)) {
                System.out.println("Invalid split entered, try again");
            } else {
                expense = new Expense(title, amount, splits, paidByMember, splitStrategy);
                break;
            }
        }
        return expense;
    }

}
