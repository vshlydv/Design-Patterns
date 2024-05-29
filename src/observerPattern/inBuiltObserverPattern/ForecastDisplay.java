package observerPattern.inBuiltObserverPattern;

import observerPattern.customObserverPattern.Display;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Display, Observer {
    private Observable observable;
    private String temp;
    private String pressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData weatherData) {
            this.temp = weatherData.getTemp();
            this.pressure = weatherData.getPressure();
            display();;
        }
    }

    @Override
    public void display() {
        System.out.println("Forecast Display");
        System.out.println("Temp: " + temp + ", Pressure: " + pressure);
    }
}
