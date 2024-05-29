package observerPattern.customObserverPattern;

public interface Subject {
    public void registerObserver(Observer observer, String event);
    public void removeObserver(Observer observer, String event);
    public void notifyObservers();
}
