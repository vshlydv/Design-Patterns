package statePattern;

public class HasQuarter implements State {

    private GumBallMachine machine;

    HasQuarter(GumBallMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter ejected");
        //TODO: set to NoQuarter
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
    }

    @Override
    public void despense() {
        System.out.println("No gumball dispensed");
    }
}
