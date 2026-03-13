package encapsulation.exercises;

/**
 TODO:
 1. Create private fields: name (String), salary (double).
 2. Write a constructor to initialize both.
 3. Add getters for both fields.
 4. Add a setter for salary that does NOT allow negative values.
 5. Create a method giveRaise(double amount) that increases salary.
 */
public class Employee
{
    // your code here
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public void giveRaise(double amount) {
        if (amount >= 0) {
            salary += amount;
        }
    }


    public static void main(String[] args) {
        Employee employee = new Employee("Carles", 987.0);

        System.out.println(employee.getName());
        System.out.println(employee.getSalary());

        employee.setSalary(1250.0);
        System.out.println(employee.getSalary());

        employee.giveRaise(500);
        System.out.println(employee.getSalary());
    }
}
