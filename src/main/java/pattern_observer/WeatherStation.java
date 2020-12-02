package pattern_observer;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        OtherConditionsDisplay otherDisplay = new OtherConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 34);
        weatherData.setMeasurements(801, 652, 343);
        weatherData.setMeasurements(8034, 6545, 3456);
    }
}
