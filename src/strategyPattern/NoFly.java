package strategyPattern;

public class NoFly implements FlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("I don't fly");
    }
}
