package strategyPattern;

public class PlasticDuck extends Duck{

    PlasticDuck(FlyingBehaviour flyingBehaviour) {
        super(flyingBehaviour);
    }

    @Override
    public void display() {
        System.out.println("I'm a plastic duck");
    }
}
