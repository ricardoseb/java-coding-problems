package co.riqui.javacodingproblems.strings;

import org.springframework.util.StringUtils;

/**
 * @author ricardoquiroga on 22-06-22
 */
public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        String stringWithSpaces = "Hello Bro";
        String stringWithSpaces2 = "  ";
        System.out.println("stringWithSpaces.isBlank() = " + stringWithSpaces2.isBlank());
        String str2 = StringUtils.trimAllWhitespace("H E L L O");
        System.out.println("str2 = " + str2);
        String str = stringWithSpaces.replaceAll("\\s", "");
        System.out.println("stringWithSpaces = " + str);
    }
}
