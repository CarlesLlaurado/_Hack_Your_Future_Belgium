package inheritance.exercises.PersonInheritance;

public class Student extends Person {
    private double grade;

    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I am a Student and my grade is " + grade);
    }
}
