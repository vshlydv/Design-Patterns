package mediatorPattern;

public class Component1 extends Component {

    public void doA() {
        System.out.println("Component A does 1");
        mediator.notify("A", this);
    }
}
