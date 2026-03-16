package inheritance.exercises.PersonInheritance;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I am a teacher, and I teach " + subject);
    }
}
