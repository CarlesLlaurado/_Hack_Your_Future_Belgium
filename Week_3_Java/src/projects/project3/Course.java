package projects.project3;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private List<Student> studentsList;
    private List<Teacher> teacherList;

    public Course() {
        this.studentsList = new ArrayList<>();
        this.teacherList = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        studentsList.add(student);
    }
    public void removeStudent(Student student) {
        studentsList.remove(student);
    }

    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }
    public void removeTeacher(Teacher teacher) {
        teacherList.remove(teacher);
    }

    public void printStudents() {
        for (Student student : studentsList) {
            System.out.println(student.getName());
        }
    }
    public void printTeachers() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher.getName());
        }
    }

    public void printCourse() {
        printStudents();
        printTeachers();
    }


    public static void main(String[] args) {
        Student student1 = new Student("Carles", 84);
        Student student2 = new Student("Rafaela", 94);
        Student student3 = new Student("Riki", 74);
        Teacher teacher1 = new Teacher("Bora", "java");
        Teacher teacher2 = new Teacher("David J.Malan", "CS50");

        Course course = new Course();
        course.enrollStudent(student1);
        course.enrollStudent(student2);
        course.enrollStudent(student3);
        course.addTeacher(teacher1);
        course.addTeacher(teacher2);

        course.printCourse();
        course.removeStudent(student3);
        course.printStudents();

    }
}
