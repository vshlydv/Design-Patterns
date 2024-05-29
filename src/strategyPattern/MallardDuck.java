package strategyPattern;

public class MallardDuck extends Duck {
    MallardDuck(FlyingBehaviour flyingBehaviour) {
        super(flyingBehaviour);
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
