package inheritance.exercises.EmployeeInheritance;

/**
 TODO:
 1. Create a superclass Employee with:
      - name (String), salary (double).
      - method work() → prints "<name> is working".
 2. Create subclasses Developer and Manager:
      - Developer overrides work() → prints "<name> is writing code".
      - Manager overrides work() → prints "<name> is managing the team".
 3. Test both in a main class.
*/


public class Employee
{
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working");
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Juserp", 125);
        Developer developer = new Developer("Carles", 999.0);
        Manager manager = new Manager("Rafaela", 1900);

        employee.work();
        developer.work();
        manager.work();
    }
}
