package observerPattern.inBuiltObserverPattern;

import java.util.Observable;

public class WeatherData extends Observable {
    private String temp;
    private String pressure;

    public String getTemp() {
        return temp;
    }

    public String getPressure() {
        return pressure;
    }

    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurement(String temp, String pressure) {
        this.temp = temp;
        this.pressure = pressure;

        measurementChanged();
    }
}
