package strategyPattern;

public class FlyingWithWings implements FlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}
