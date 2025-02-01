package statePattern;

public class NoQuarter implements State {

    final private GumBallMachine gumBallMachine;
    final private String stateName;

    public NoQuarter(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
        stateName = "NoQuarter";
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumBallMachine.setState(new HasQuarter(gumBallMachine));
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's not quarter");
    }

    @Override
    public void despense() {
        System.out.println("You need to pay first");
    }

    @Override public String getStateName() {
        return this.stateName;
    }
}
