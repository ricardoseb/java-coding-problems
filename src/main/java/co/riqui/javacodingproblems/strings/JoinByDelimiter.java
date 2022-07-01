package co.riqui.javacodingproblems.strings;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * @author ricardoquiroga on 22-06-22
 */
public class JoinByDelimiter {

    public static void main(String[] args) {
        String s = joinByDelimiter('-', "H", "EL", "LO");
        System.out.println("s = " + s);

        String result = String.join(" ", "how", "are", "you");
        System.out.println("result = " + result);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        String commaSeparatedNumbers = numbers.stream().map(Object::toString).collect(Collectors.joining(", "));
        System.out.println("commaSeparatedNumbers = " + commaSeparatedNumbers);
    }

    public static String joinByDelimiter(char delimiter, String... args) {
        StringJoiner joiner = new StringJoiner(String.valueOf(delimiter));

        for (String arg : args) {
            joiner.add(arg);
        }

        return joiner.toString();
    }
}
