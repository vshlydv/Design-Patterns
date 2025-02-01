package observerPattern.customObserverPattern;

import java.util.*;

public class EventManager implements Subject {
    Map<String, List<Observer>> eventVsObservers;

    EventManager (String... events) {
        eventVsObservers = new HashMap<>();
        for(String event: events) {
            eventVsObservers.put(event, new ArrayList<>());
        }
    }

    @Override
    public void registerObserver(Observer observer, String event) {
        eventVsObservers.computeIfAbsent(event, k -> new ArrayList<>());
        if (!eventVsObservers.get(event).contains(observer))
            eventVsObservers.get(event).add(observer);
        else
            System.out.println("Observer is already registered for " + event);
    }

    @Override
    public void removeObserver(Observer observer, String event) {
        List<Observer> observers = eventVsObservers.get(event);
        if (!Objects.isNull(observers)) {
            if (observers.remove(observer))
                System.out.println("observer removed successfully");
            else
                System.out.println("Give observer was not registered with event : " + event);
        } else {
            System.out.println("No such event : " + event);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
