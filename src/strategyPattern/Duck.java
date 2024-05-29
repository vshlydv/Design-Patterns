package strategyPattern;

public abstract class Duck {

    private final FlyingBehaviour flyingBehaviour;
    public abstract void display();

    Duck(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }
    public void swim() {
        System.out.println("compositionOverInheritanceEg.Duck swimming");
    }

    public void performFly() {
        flyingBehaviour.fly();
    }
}
