package co.riqui.javacodingproblems.strings;

/**
 * @author ricardoquiroga on 22-06-22
 */
public class Palindrome {
    public static void main(String[] args) {
        boolean madam = isPalindrome("madam");
        System.out.println("isPalindrome = " + madam);
    }

    public static boolean isPalindrome(String str) {

        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
