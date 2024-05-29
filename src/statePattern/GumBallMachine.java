package statePattern;

public class GumBallMachine {
    private State state;
    private State noQuarterState;
    private State hasQuarterState;
    int gumBallsCount = 0;

    public GumBallMachine(int gumBallsCount) {
        this.gumBallsCount = gumBallsCount;
        noQuarterState = new NoQuarter(this);
        hasQuarterState = new HasQuarter(this);
    }

    public void insetQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
