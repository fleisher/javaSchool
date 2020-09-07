package lesson01.task03;

public class Kelvin extends Temperature {

    Kelvin(float temperature) {
        super(temperature);
    }

    @Override
    public float convertToFahrenheit() {
        return ((temperature - 273.15f) * 9f / 5 + 32);
    }

    @Override
    public float convertToCelsius() {
        return temperature - 273.15f;
    }

    @Override
    public float convertToKеlvin() {
        return temperature;
    }
}
