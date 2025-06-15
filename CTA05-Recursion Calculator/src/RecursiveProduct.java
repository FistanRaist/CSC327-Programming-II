/**
 * This program calculates the product of five user-input numbers using recursion.
 * It includes input validation and recursive multiplication.
 * Designed for a Programming II course, using only basic concepts.
 *
 * @author Jeremy Carney, CSC372: Programming II, June 15th, 2025
 */
import java.util.Scanner;

public class RecursiveProduct {
    /**
     * Main method to execute the program.
     * Prompts user for input and calculates product.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] numbers = new double[5];
            
            // Prompt user for five numbers
            System.out.println("Enter five numbers:");
            for (int i = 0; i < 5; i++) {
                numbers[i] = getValidInput(scanner, i + 1);
            }
            
            // Calculate and display product
            double product = calculateProduct(numbers, 0);
            System.out.printf("Product of the numbers: %.2f%n", product);
        }
    }
    
    /**
     * Validates user input to ensure it's a valid number.
     *
     * @param scanner Scanner object for input
     * @param position Position of the number (1-5)
     * @return Valid double input from user
     */
    private static double getValidInput(Scanner scanner, int position) {
        while (true) {
            System.out.printf("Enter number %d: ", position);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }
    }
    
    /**
     * Recursively calculates the product of numbers in the array.
     *
     * @param numbers Array of numbers
     * @param index Current index in the array
     * @return Product of numbers from index to end
     */
    private static double calculateProduct(double[] numbers, int index) {
        // Base case: if index is the last element
        if (index == numbers.length - 1) {
            return numbers[index];
        }
        // Recursive case: current number * product of remaining numbers
        return numbers[index] * calculateProduct(numbers, index + 1);
    }
}