package lesson01;

public class Task03 {
    public static void main (String[] args) {
        System.out.println(convertTemp(23));

    }
    public static float convertTemp(float celsius){
        float result = (float)9 / 5 * celsius + 32;
        return result;
    }

}
