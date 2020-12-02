package pattern_observer;

public class OtherConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private Subject weatherData;

    public OtherConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Other conditions: temperature = " + temperature);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        display();
    }
}
