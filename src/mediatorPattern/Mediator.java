package mediatorPattern;

public interface Mediator {
    public void notify(String event, Component component);
}
