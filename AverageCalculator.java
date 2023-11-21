import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input five numbers
        System.out.println("Enter five numbers:");

        double sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = scanner.nextDouble();
            sum += num;
        }

        // Calculate the average
        double average = sum / 5;

        // Display the result
        System.out.println("The average of the five numbers is: " + average);

        // Close the scanner
        scanner.close();
    }
}