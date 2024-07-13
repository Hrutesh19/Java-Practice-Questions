package ExceptionHandling;

import java.util.Scanner;

/***
 * 2. *ArithmeticException Handling:*
 *    Develop a Java program that prompts the user to enter two integers and performs division.
 *    Implement exception handling to catch the ArithmeticException that may occur if the user tries to divide by zero.
 *    Provide appropriate error messages for both successful division and division by zero cases.
 */

public class ArithmaticExceptionHandling {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in); // Specify input source
            System.out.println("Enter first digit: ");
            int a = scanner.nextInt();

            System.out.println("Enter second digit: ");
            int b = scanner.nextInt();

            if (b == 0) {
                throw new ArithmeticException("Error: Division by zero is not allowed.");
            }
            int c = a / b;
            System.out.println("Result of Division: " + c);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        }
    }
}
