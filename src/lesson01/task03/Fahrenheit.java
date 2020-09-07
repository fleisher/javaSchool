package lesson01.task03;

public class Fahrenheit extends Temperature {

    Fahrenheit(float temperature) {
        super(temperature);
    }

    @Override
    public float convertToFahrenheit() {
        return temperature;
    }

    @Override
    public float convertToCelsius() {
        return ((temperature - 32) * 5f / 9);
    }

    @Override
    public float convertToKеlvin() {
        return ((temperature - 32) * 5f/9 + 273.15f);
    }
}
