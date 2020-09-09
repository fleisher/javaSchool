package lesson02.task01;

import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Car {
    private final String model;
    private final String type;
    private static  Map<String, ArrayList<Car>> carsByModels = new HashMap<>();

    public static void printCarsByModels() {
        for (Map.Entry<String, ArrayList<Car>> entry : carsByModels.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Override
    public String toString() {
        return model;
    }

    public Car(String model, String type) {
        this.model = model;
        this.type = type;

        if (carsByModels.containsKey(type)){
            carsByModels.get(type).add(this);
        } else {
            ArrayList<Car> cars = new ArrayList<Car>();
            cars.add(this);
            carsByModels.put(type, cars);
        }

    }



}
