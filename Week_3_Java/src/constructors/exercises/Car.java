package constructors.exercises;

/**
 TODO:
 1. Create class Car with private fields brand and year.
 2. Add:
      - Default constructor → sets brand="Unknown", year=0
      - Parameterized constructor → sets brand and year
 3. Add method printCarInfo().
 4. Test both constructors.
*/

public class Car
{
    private String brand;
    private int year;

    public Car() {
        this("Unknown", 0);
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void printCarInfo() {
        System.out.println("Brand: " + brand + " year: " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 1991);
        Car car2 = new Car();

        car1.printCarInfo();
        car2.printCarInfo();

    }
}
