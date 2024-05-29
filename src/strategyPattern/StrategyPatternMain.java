package strategyPattern;

public class StrategyPatternMain {

    public static void run() {
        Duck mallardDuck = new MallardDuck(new FlyingWithWings());
        Duck plasticDuck = new PlasticDuck(new NoFly());
        mallardDuck.display();
        plasticDuck.display();

        DuckCallDevice device = new DuckCallDevice(new SqueakSqueak());
        device.quack();
    }
}
