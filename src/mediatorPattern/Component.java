package mediatorPattern;

public abstract class Component {
    Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
