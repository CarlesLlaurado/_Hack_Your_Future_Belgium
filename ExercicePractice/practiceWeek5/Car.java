package practiceWeek5;

public class Car {

    String brand;
    Engine engine;

    public Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }
    public void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}
