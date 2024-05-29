package observerPattern.customObserverPattern;

public class ObserverPatternMain {

    public static void run() {
        WeatherData weatherData = new WeatherData();

        CurrentMeasurementDisplay1 curr1 = new CurrentMeasurementDisplay1(weatherData);
        CurrentMeasurementDisplay2 curr2 = new CurrentMeasurementDisplay2(weatherData);

        weatherData.setState(new State("100 F", "50 Pascal", "10"));
        weatherData.setState(new State("200 F", "100 Pascal", "20"));
    }
}
