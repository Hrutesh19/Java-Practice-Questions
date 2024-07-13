package Strings;//1.How to Print duplicate characters from String

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "Engineer";
        int count = 0;
        char[] ch = str.toCharArray();

        System.out.println("Duplicate Characters in String are:");

        // Iterate through each character in the string
        for (int i = 0; i < ch.length; i++) {
            // Check for duplicates only if the character is not already marked as a duplicate
            if (ch[i] != ' ') {
                for (int j = i + 1; j < ch.length; j++) {
                    // If a duplicate is found
                    if (ch[i] == ch[j]) {
                        System.out.println(ch[i]);
                        // Mark the duplicate character to avoid counting it again
                        ch[j] = ' ';
                        count++;
                    }
                }
            }
        }

        System.out.println("Duplicate Characters Count in String are: " + count);
    }
}
