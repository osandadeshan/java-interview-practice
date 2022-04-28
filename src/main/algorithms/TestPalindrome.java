package algorithms;

/**
 * Project Name    : java-interview-practice
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/27/2022
 * Time            : 8:43 AM
 * Description     :
 **/

public class TestPalindrome {

    public static void main(String[] args) {
        String original = "wow";
        StringBuilder reverse = new StringBuilder();

        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse.append(original.charAt(i));

        if (original.equals(reverse.toString()))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }
}
