package observerPattern.inBuiltObserverPattern;

public class InbuiltObserverPaternMain {
    public static void run() {
        WeatherData weatherData = new WeatherData();

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurement("100 F", "10 Pascal");
        weatherData.setMeasurement("200 F", "20 Pascal");
    }
}
