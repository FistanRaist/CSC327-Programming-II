/**
 * Represents a circle with a radius, extending Shape.
 */
public class Circle extends Shape {
    /** The radius of the circle. */
    private double radius;

    /**
     * Constructs a Circle with specified radius.
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     * @return the area (pi * radius^2)
     */
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the perimeter (circumference) of the circle.
     * @return the perimeter (2 * pi * radius)
     */
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Returns a string representation of the circle's area and perimeter.
     * @return a string in the format "Circle: Area = [area], Perimeter = [perimeter]"
     */
    @Override
    public String toString() {
        return "Circle: Area = " + area() + ", Perimeter = " + perimeter();
    }
}