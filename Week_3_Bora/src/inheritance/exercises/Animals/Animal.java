package inheritance.exercises.Animals;

/**
 TODO:
 1. Create a superclass Animal with:
      - method makeSound() → prints "Some sound...".
 2. Create subclasses Dog and Cat that override makeSound().
 3. In main(), create a Dog and Cat and call their makeSound().
*/

public class Animal
{
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public void makeSound() {
        System.out.println(name + " making sound");
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Manel");
        Dog dog = new Dog("Max");
        Cat cat = new Cat("Stich");

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}
