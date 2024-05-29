package strategyPattern;

public class SqueakSqueak implements QuackBehaviour {

    @Override
    public void performQuack() {
        System.out.println("Squeak Squeak");
    }
}
