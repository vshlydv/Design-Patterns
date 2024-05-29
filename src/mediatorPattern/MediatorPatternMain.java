package mediatorPattern;

public class MediatorPatternMain {
    public static void run() {
        Component1 component1 = new Component1();
        Component2 component2 = new Component2();
        Component3 component3 = new Component3();

        Mediator mediator = new ComponentMediator(component1, component2, component3);

        component1.setMediator(mediator);
        component2.setMediator(mediator);
        component3.setMediator(mediator);

        component1.doA();
        System.out.println("---------------------------------");
        component2.doC();
    }
}
