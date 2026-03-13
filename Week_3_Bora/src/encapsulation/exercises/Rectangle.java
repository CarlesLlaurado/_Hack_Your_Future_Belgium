package encapsulation.exercises;

/**
 TODO:
 1. Create private fields width (double), height (double).
 2. Write a constructor to set them.
 3. Add getters and setters (no negative values allowed).
 4. Add methods: getArea() and getPerimeter().
 */
public class Rectangle
{
    // your code here
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width >= 0) {
            this.width = width;
        }
    }
    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        }
    }

    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return (width * 2) + (height * 2);
    }


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);

        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getHeight());

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}

