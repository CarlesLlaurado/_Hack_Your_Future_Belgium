package projects.project5;

public class StudentMain {
    static void main(String[] args) {

        Student student1 = new Student("Rafaela", 26, new int[]{10, 20, 50, 40});
        student1.printInformation();

        Student student2 = new Student("Carles", 24, new int[]{70, 90, 80, 84});
        student2.printInformation();
    }
}
