package composition.exercises.ComDepartEmplo;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;
    private List<Department> departmentList;

    public Company(String name) {
        this.name = name;
        this.departmentList = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departmentList.add(department);
    }

    public void listDeparments() {
        System.out.println("-".repeat(20));
        for (Department department : departmentList) {
            System.out.println(department.getName());
            department.listEmployees();
            System.out.println("-".repeat(20));
        }
    }
}
