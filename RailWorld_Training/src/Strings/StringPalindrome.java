package Strings;

//7. How to check if String is Palindrome?
public class StringPalindrome {
    public static void main(String args []){
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str){
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
