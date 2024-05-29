package observerPattern.customObserverPattern;

import java.util.ArrayList;

public class WeatherData {

    EventManager eventManager;
    private State state;

    public WeatherData() {
        this.eventManager = new EventManager("tempChange", "pressureChange");
    }

    public void setState(State state) {
        this.state = state;
        measurementsChanged();
    }

    public void measurementsChanged() {
        eventManager.notifyObservers();
    }

}
