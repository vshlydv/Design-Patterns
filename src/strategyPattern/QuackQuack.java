package strategyPattern;

public class QuackQuack implements QuackBehaviour{
    @Override
    public void performQuack() {
        System.out.println("Quack Quack");
    }
}
