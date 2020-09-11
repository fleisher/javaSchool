package carPark;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "Sedan");

        Car car2 = new Car("Lada", "Sedan");
        Car car3 = new Car("KIA", "Hatchback");
        Car car4 = new Car("Hyundai", "Hatchback");
        Car car5 = new Car("BMW", "Hatchback");
        Car car6 = new Car("Dodge", "Pickup");


        Car.printCarsByModels() ;

    }
}

