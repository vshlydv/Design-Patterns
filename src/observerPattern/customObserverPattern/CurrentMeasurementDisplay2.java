package observerPattern.customObserverPattern;

public class CurrentMeasurementDisplay2 implements Display, Observer{

    private State state;
    private WeatherData weatherData;

    CurrentMeasurementDisplay2(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.eventManager.registerObserver(this, "tempChange");
    }

    @Override
    public void display() {
        System.out.println("CurrentMeasurementDisplay2 showing details");
        System.out.println("Temp: " + state.temp() + ", Pressure: " + state.pressure() +
                ", Humidity: " + state.humidity());
        System.out.println("-------------------------------------------");
    }

    @Override
    public void update(State state) {
        this.state = state;
        this.display();
    }
}
