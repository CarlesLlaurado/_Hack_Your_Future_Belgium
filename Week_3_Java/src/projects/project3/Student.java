package projects.project3;

public class Student {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void introduce() {
        System.out.printf("Hello I am a Student and my grade is %.2f", grade);
    }
}
