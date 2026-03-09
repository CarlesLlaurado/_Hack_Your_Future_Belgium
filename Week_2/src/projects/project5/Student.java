package projects.project5;

import java.util.Arrays;

public class Student {

    String name;
    int age;
    int[] marks;

    Student() {
        name = "name";
        age = 0;
        marks = new int[]{0};
    }

    Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void printInformation() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        if (isPassed()) {
            System.out.println("\nStudent passed this course!");
        } else {
            System.out.println("\nStudent failed this course!!!");
        }
    }

    boolean isPassed() {

        int totalMarks = 0;

        for (int mark : marks) {
            totalMarks += mark;
        }
        return ((totalMarks / marks.length) > 50);
    }

}
