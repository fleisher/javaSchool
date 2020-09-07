package lesson01.task03;

public abstract class Temperature {
    public float temperature;

    Temperature(float temperature){
        this.temperature = temperature;
    }

    public abstract float convertToFahrenheit();
    public abstract float convertToCelsius();
    public abstract float convertToKеlvin();

}
