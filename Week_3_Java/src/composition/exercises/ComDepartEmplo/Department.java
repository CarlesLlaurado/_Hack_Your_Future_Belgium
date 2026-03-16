package composition.exercises.ComDepartEmplo;

import java.util.ArrayList;
import java.util.List;

/**
 TODO:
 1. Create class Employee with fields: name, role.
 2. Create class Department that HAS-A List<Employee>.
 3. Create class Company that HAS-A List<Department>.
 4. Add methods to:
 - Add employee to a department
 - List employees by department
 5. Test with multiple departments and employees.
 */
public class Department
{
    private String name;
    private List<Employee> employeeList;

    public Department(String name) {
        this.name = name;
        this.employeeList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void listEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + " - " + employee.getRole());
        }
    }
}
