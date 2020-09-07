package lesson01.task03;

public class Celsius extends Temperature{

    Celsius(float temperature) {
        super(temperature);
    }

    @Override
    public float convertToFahrenheit() {
        return 9f / 5 * temperature + 32;
    }

    @Override
    public float convertToCelsius(){
        return temperature;
    }

    @Override
    public float convertToKеlvin(){
        return temperature + 273.15f;
    }
}
