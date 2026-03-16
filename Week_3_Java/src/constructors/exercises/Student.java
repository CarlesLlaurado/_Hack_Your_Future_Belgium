package constructors.exercises;

/**
 TODO:
 1. Create class Student with:
      - private field name
      - private static field studentCount
 2. Each new Student should get a unique ID (increment studentCount).
 3. Add a method getStudentInfo() to print name and ID.
 4. Add a static method getTotalStudents().
*/

public class Student
{
    private String name;
    private int id;
    private static int studentCount;

    public Student(String name) {
        this.name = name;
        this.id = ++studentCount;
    }

    public void getStudentInfo() {
        System.out.println("ID: " + id + " name: " + name);
    }

    public static int getTotalStudents() {
        return studentCount;
    }


    public static void main(String[] args) {
        Student student1 = new Student("Carles");
        Student student2 = new Student("Rafaela");

        student1.getStudentInfo();
        student2.getStudentInfo();

        int totalStudents = Student.getTotalStudents();
        System.out.println(totalStudents);
    }
}
