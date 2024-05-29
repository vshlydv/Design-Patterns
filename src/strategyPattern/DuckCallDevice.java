package strategyPattern;

public class DuckCallDevice {

    private final QuackBehaviour quackBehaviour;

    DuckCallDevice(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void quack() {
        quackBehaviour.performQuack();
    }
}
