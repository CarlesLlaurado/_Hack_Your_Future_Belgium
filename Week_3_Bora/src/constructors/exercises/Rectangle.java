package constructors.exercises;

/**
 TODO:
 1. Create class Rectangle with width and height.
 2. Add:
      - Constructor(width, height)
      - Constructor(width) → height defaults to width (square)
 3. Add methods getArea() and getPerimeter().
 4. Test both constructors.
*/

public class Rectangle
{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width) {
        this(width, width);
    }

    public void getArea() {
        int area = width * height;
        System.out.println("Area: " + area);
    }

    public void getPerimeter() {
        int perimeter = (width * 2) + (height * 2);
        System.out.println("Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 20);
        Rectangle rectangle2 = new Rectangle(10);

        rectangle1.getArea();
        rectangle1.getPerimeter();

        rectangle2.getArea();
        rectangle2.getPerimeter();
    }

}
