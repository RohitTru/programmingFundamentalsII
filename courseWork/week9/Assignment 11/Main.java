import java.util.Scanner;

public class Main {

    // Method to perform division
    public static double performDivision(double numerator, double denominator) throws CustomDivisionException {
        if (denominator == 0) {
            throw new CustomDivisionException(); // Throw custom exception if denominator is zero
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for numerator input
        System.out.print("Enter numerator: ");
        double numerator = scanner.nextDouble();

        // Prompt user for denominator input
        System.out.print("Enter denominator: ");
        double denominator = scanner.nextDouble();

        try {
            // Attempt to perform division and display result
            double result = performDivision(numerator, denominator);
            System.out.println("Division result = " + result);
        } catch (CustomDivisionException e) {
            // Handle division by zero exception
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner to prevent resource leak
        }
    }
}
