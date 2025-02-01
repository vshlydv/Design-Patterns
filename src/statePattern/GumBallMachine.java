package statePattern;

public class GumBallMachine {
    private State state;
    int gumBallsCount = 0;

    public GumBallMachine() {
        this.gumBallsCount = 0;
        this.state = new NoQuarter(this);
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
