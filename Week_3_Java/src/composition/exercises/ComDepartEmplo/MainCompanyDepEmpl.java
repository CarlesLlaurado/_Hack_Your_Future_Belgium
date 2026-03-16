package composition.exercises.ComDepartEmplo;

public class MainCompanyDepEmpl {
    public static void main(String[] args) {

        Company company = new Company("HYFB");

        // Departments
        Department rrhh = new Department("RRHH");
        Department engineering = new Department("Engineering");
        Department marketing = new Department("Marketing");

        // Employees
        Employee bora = new Employee("Bora", "Teacher");
        Employee carles = new Employee("Carles", "Student");
        Employee alice = new Employee("Alice", "Developer");
        Employee bob = new Employee("Bob", "Designer");

        // Add employees to departments
        rrhh.addEmployee(bora);
        engineering.addEmployee(carles);
        engineering.addEmployee(alice);
        marketing.addEmployee(bob);

        // Add departments to company
        company.addDepartment(rrhh);
        company.addDepartment(engineering);
        company.addDepartment(marketing);

        // Print everything
        company.listDeparments();
    }
}
