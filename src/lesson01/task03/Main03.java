package lesson01.task03;

public class Main03 {
    public static void main (String[] args) {
        Celsius t1 = new Celsius(23.5f);
        System.out.println(t1.temperature + "°C = " + t1.convertToFahrenheit() + "°F");
        System.out.println(t1.temperature + "°C = " + t1.convertToCelsius() + "°C");
        System.out.println(t1.temperature + "°C = " + t1.convertToKеlvin() + "K");

        Fahrenheit t2 = new Fahrenheit(100f);
        System.out.println(t2.temperature + "°F = " + t2.convertToFahrenheit() + "°F");
        System.out.println(t2.temperature + "°F = " + t2.convertToCelsius() + "°C");
        System.out.println(t2.temperature + "°F = " + t2.convertToKеlvin() + "K");

        Kelvin t3 = new Kelvin(300.5f);
        System.out.println(t3.temperature + "K = " + t3.convertToFahrenheit() + "°F");
        System.out.println(t3.temperature + "K = " + t3.convertToCelsius() + "°C");
        System.out.println(t3.temperature + "K = " + t3.convertToKеlvin() + "K");
    }
}
