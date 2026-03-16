package inheritance.exercises.EmployeeInheritance;

public class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " is managing the team");
    }
}
