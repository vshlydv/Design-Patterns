package statePattern;

public class HasQuarter implements State {

    final private GumBallMachine gumBallMachine;
    final private String stateName;

    HasQuarter(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
        this.stateName = "HasQuarter";
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter ejected");
        gumBallMachine.setState(new NoQuarter(gumBallMachine));
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
    }

    @Override
    public void despense() {
        System.out.println("No gumball dispensed");
    }

    @Override public String getStateName() {
        return this.stateName;
    }
}
