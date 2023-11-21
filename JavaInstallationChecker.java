import java.util.Scanner;

public class AsciiValuePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a character
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        // Get the ASCII value of the character
        int asciiValue = (int) inputChar;

        // Display the result
        System.out.println("ASCII value of '" + inputChar + "' is: " + asciiValue);

        // Close the scanner
        scanner.close();
    }
}
