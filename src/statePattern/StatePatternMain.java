package statePattern;

public class StatePatternMain {
    public static void run() {
        GumBallMachine machine = new GumBallMachine();
        System.out.println("Machine current state " + machine.getState().getStateName());
        machine.insetQuarter();
        System.out.println("Machine current state " + machine.getState().getStateName());
        machine.ejectQuarter();
        System.out.println("Machine current state " + machine.getState().getStateName());
    }
}
