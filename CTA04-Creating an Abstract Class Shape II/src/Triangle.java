/**
 * Represents a triangle with three sides, extending Shape.
 */
public class Triangle extends Shape {
    /** The length of the first side. */
    private double side1;
    /** The length of the second side. */
    private double side2;
    /** The length of the third side. */
    private double side3;

    /**
     * Constructs a Triangle with specified side lengths.
     * @param side1 the length of the first side
     * @param side2 the length of the second side
     * @param side3 the length of the third side
     */
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * Calculates the area of the triangle using Heron's formula.
     * @return the area
     */
    @Override
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * Calculates the perimeter of the triangle.
     * @return the perimeter (sum of all sides)
     */
    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    /**
     * Returns a string representation of the triangle's area and perimeter.
     * @return a string in the format "Triangle: Area = [area], Perimeter = [perimeter]"
     */
    @Override
    public String toString() {
        return "Triangle: Area = " + area() + ", Perimeter = " + perimeter();
    }
}