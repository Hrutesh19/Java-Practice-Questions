package ExceptionHandling;

import java.util.Scanner;

/***
 * 3. *NumberFormatException Handling:*
 *    Write a Java program that prompts the user to enter a number in string format and converts it to an integer.
 *    Implement exception handling to catch the NumberFormatException that may occur
 *    if the input cannot be parsed to an integer.
 *    Provide a suitable error message for this scenario.
 */



public class NumberformatException {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter input in a String Format: ");
        String input = s.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Integer value: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid integer.");
        }

        s.close();
    }
}

