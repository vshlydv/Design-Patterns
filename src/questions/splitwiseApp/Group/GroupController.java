package questions.splitwiseApp.Group;

import questions.splitwiseApp.Expense.Expense;
import questions.splitwiseApp.Member.Member;
import questions.splitwiseApp.Member.MemberController;

import java.util.*;

public class GroupController {

    static Map<String, Group> groups;
    static GroupController groupController;
    static MemberController memberController;
    private final Scanner scanner = new Scanner(System.in);

    private GroupController() {
        groups = new HashMap<>();
    }

    public void setMemberController(MemberController memberController) {
        GroupController.memberController = memberController;
    }

    public static GroupController getGroupController() {
        if (null == groupController) {
            groupController = new GroupController();
        }
        return groupController;
    }

    public void createInBuiltGroup(String name, Member creatorMember, Member... members) {
        Group group = new Group(UUID.randomUUID().toString(), name, this);
        groups.put(group.getName(), group);
        group.addMember(creatorMember);
        for (Member member: members) {
            group.addMember(member);
            member.getPartOfGroups().add(group);
            creatorMember.addMemberAsFriend(member);
        }
    }

    public Group createGroup(Member member) {
        Group group = null;
        String groupName;

        while (true) {
            System.out.println("Enter group name: ");
            groupName = scanner.nextLine();
            if (!groupInList(member.getPartOfGroups(), groupName)) {
                group = new Group(UUID.randomUUID().toString(), groupName, this);
                groups.put(group.getName(), group);
                group.addMember(member);
                break;
            }
            System.out.println("This group already exists for " + member.getName());
        }

        while (true) {
            System.out.println("Enter member name to add in group " + groupName + " (type exit to stop)");
            String name = scanner.nextLine();
            if ("exit".equalsIgnoreCase(name)) {
                break;
            } else {
                Member memberToBeAdded = memberController.findMember(name);
                if (null == memberToBeAdded) {
                    System.out.println("No such member found!");
                } else {
                    group.addMember(memberToBeAdded);
                    memberToBeAdded.getPartOfGroups().add(group);
                    member.addMemberAsFriend(memberToBeAdded);
                }
            }
        }
        return group;
    }

    private boolean groupInList(List<Group> groupList, String groupName) {
        for (Group group : groupList) {
            if (group.getName().equalsIgnoreCase(groupName))
                return true;
        }
        return false;
    }

    public void addExpense(Expense expense, String groupName) {
        Group group = groups.get(groupName);
        group.addExpense(expense);
    }

    public Group getGroup(String groupName) {
        return groups.get(groupName);
    }
}
