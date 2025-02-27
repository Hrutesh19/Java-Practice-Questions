package Strings;//2. How to program to print first non repeated character from String

import java.util.Scanner;

class NonRepeatingChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input a String:");
        String word = s.nextLine();
        boolean flag = true;

        for (char i : word.toCharArray()) {
            if (word.indexOf(i) == word.lastIndexOf(i)) {
                System.out.println("The first character which is non repeating is: " + i);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("There is no non-repeating character in the input string");
        }
    }
}
