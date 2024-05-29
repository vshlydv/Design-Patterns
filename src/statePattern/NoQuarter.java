package statePattern;

public class NoQuarter implements State {

    GumBallMachine gumBallMachine;

    public NoQuarter(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        //TODO: set ot HasQuarterState gumBallMachine.setState();
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
}
