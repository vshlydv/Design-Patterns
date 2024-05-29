package mediatorPattern;

public class ComponentMediator implements Mediator {

    private  Component1 component1;
    private  Component2 component2;
    private  Component3 component3;

    public ComponentMediator(Component1 component1, Component2 component2, Component3 component3) {
        this.component1 = component1;
        this.component2 = component2;
        this.component3 = component3;
    }

    @Override
    public void notify(String event, Component component) {
        if (event == "A") {
            System.out.println("Mediator reacts on A: triggering following operation");
            component2.doB();
            component3.doE();
//            component2.doC(); //Stackoverflow
        }

        if ("C".equals(event)) {
            System.out.println("Mediator reacts on C: triggering following operation");
            component3.doD();
            component1.doA();
        }
    }
}
