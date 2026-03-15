package inheritance.exercises.ShapeInheritance;

/**
 TODO:
 1. Create superclass Shape with method getArea().
 2. Create subclasses Circle and Rectangle:
      - Circle has radius.
      - Rectangle has width and height.
 3. Override getArea() in each subclass.
 4. In main(), create both and print their areas.
*/


public class Shape
{
    public double getArea() {
        return 0;
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle(10, 20);
        Circle circle = new Circle(20);

        System.out.println(shape.getArea());
        System.out.println(rectangle.getArea());
        System.out.printf("%.2f\n", circle.getArea());
    }
}
