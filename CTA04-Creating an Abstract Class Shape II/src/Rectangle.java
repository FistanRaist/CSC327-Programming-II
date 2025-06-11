/**
 * Represents a rectangle with width and length, extending Shape.
 */
public class Rectangle extends Shape {
    /** The width of the rectangle. */
    private double width;
    /** The length of the rectangle. */
    private double length;

    /**
     * Constructs a Rectangle with specified width and length.
     * @param width the width of the rectangle
     * @param length the length of the rectangle
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Calculates the area of the rectangle.
     * @return the area (width * length)
     */
    @Override
    public double area() {
        return width * length;
    }

    /**
     * Calculates the perimeter of the rectangle.
     * @return the perimeter (2 * (width + length))
     */
    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

    /**
     * Returns a string representation of the rectangle's area and perimeter.
     * @return a string in the format "Rectangle: Area = [area], Perimeter = [perimeter]"
     */
    @Override
    public String toString() {
        return "Rectangle: Area = " + area() + ", Perimeter = " + perimeter();
    }
}