package co.riqui.javacodingproblems.strings;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author ricardoquiroga on 30-06-22
 */
public class RemoveCharacter {

    public static void main(String[] args) {
        String name = "Rick";
        String s = removeCharacter(name, 'c');
        System.out.println("s = " + s);
        String c = removeCharacter(name, "c");
        System.out.println("c = " + c);

    }

    /**
     * @param str
     * @param ch
     * @return String
     */
    //Notice that the regular expression is wrapped in the Pattern.quote() method.
    //This is needed to escape special characters such as <, (, [, {, \, ^, -, =, $, !, |, ], }, ), ?, *, +, ., and >.
    public static String removeCharacter(String str, char ch) {

        return str.replaceAll(Pattern.quote(String.valueOf(ch)), "");
    }

    public static String removeCharacter(String str, String ch) {

        int codePoint = ch.codePointAt(0);

        return str.codePoints()
                .filter(c -> c != codePoint)
                .mapToObj(c -> String.valueOf(Character.toChars(c)))
                .collect(Collectors.joining());
    }
}
