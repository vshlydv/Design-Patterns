package mediatorPattern;

public class Component2 extends Component {

    public void doB() {
        System.out.println("Component 2 does B");
    }

    public void doC() {
        System.out.println("Component 2 does C");
        mediator.notify("C", this);
    }
}
