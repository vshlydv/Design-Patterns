package observerPattern.customObserverPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        if (!eventVsObservers.containsKey(event))
            eventVsObservers.put(event, new ArrayList<>());
        if (!eventVsObservers.get(event).contains(observer))
            eventVsObservers.get(event).add(observer);
        else
            System.out.println("Observer is already registered for " + event);
    }

    @Override
    public void removeObserver(Observer observer, String event) {

    }

    @Override
    public void notifyObservers() {

    }
}
