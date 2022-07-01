package co.riqui.javacodingproblems.strings;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author ricardoquiroga on 20-06-22
 */
public class ReversingWords {

    private static final Pattern PATTERN = Pattern.compile(" +");


    public static void main(String[] args) {
        
        String renata = reverseWords("renata");
        System.out.println("renata = " + renata);

        String r = reverseWords2("rena");
        System.out.println("re = " + r);

    }

    public static String reverseWords(String str) {

        return PATTERN.splitAsStream(str)
                .map(w -> new StringBuilder(w).reverse())
                .collect(Collectors.joining(" "));
    }

    public static String reverseWords2(String str) {

        return new StringBuilder(str).reverse().toString();
    }
}
