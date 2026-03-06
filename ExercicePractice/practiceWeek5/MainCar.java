package practiceWeek5;

public class MainCar {

    public static void main(String[] args) {

        Engine engine = new Engine();
        Car car = new Car("Toyota", engine);
        car.drive();
    }
}
