/**
 * Driver class to demonstrate Shape subclasses using an array.
 */
public class ShapeArray {
    /**
     * Main method to create and display shapes.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[3];
        shapeArray[0] = new Triangle(3, 4, 5);
        shapeArray[1] = new Circle(2);
        shapeArray[2] = new Rectangle(4, 4); // Square as Rectangle with equal sides

        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}