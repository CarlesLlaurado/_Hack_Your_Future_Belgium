package inheritance.exercises.PersonInheritance;

import java.util.ArrayList;
import java.util.List;

/**
 TODO:
 1. Create a superclass Person with fields name and age.
 2. Create subclasses Student and Teacher.
      - Student has field grade (double).
      - Teacher has field subject (String).
 3. Create a method introduce() in Person that prints a generic introduction.
      - Override introduce() in Student and Teacher with specialized messages.
 4. In main():
      - Create a List<Person>.
      - Add multiple Students and Teachers.
      - Loop through the list and call introduce() on each object.
        (Demonstrates polymorphism + inheritance).
*/

public class Person
{
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age= age;
    }

    public void introduce() {
        System.out.println("Hello my name is " + name);
    }

    public static void main(String[] args) {
        Person person = new Person("Manel", 22);
        Student student = new Student("Carles", 24, 84);
        Teacher teacher = new Teacher("Bora", 30, "Java");

        List<Person> listPerson = new ArrayList<>();
        listPerson.add(person);
        listPerson.add(student);
        listPerson.add(teacher);

        for (Person persona : listPerson) {
            persona.introduce();
        }
    }
}
