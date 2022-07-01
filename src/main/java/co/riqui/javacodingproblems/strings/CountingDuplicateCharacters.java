package co.riqui.javacodingproblems.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author ricardoquiroga on 20-06-22
 */
public class CountingDuplicateCharacters {

    public static void main(String[] args) {

        Map<Character, Integer> characterIntegerMap = countDuplicateCharacters1("renatar");
        System.out.println("args = " + characterIntegerMap);

        Map<Character, Long> characterLongMap = countDuplicateCharacters2("renata");
        System.out.println("characterLongMap = " + characterLongMap);

    }

    public static Map<Character, Integer> countDuplicateCharacters1(String str) {

        Map<Character, Integer> result = new HashMap<>();

        // or use for(char ch: str.toCharArray()) { ... }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        return result;
    }

    public static Map<Character, Long> countDuplicateCharacters2(String str) {
        char r = 114;
        System.out.println("r = " + r);
        return str.chars().peek(e -> System.out.println("1: " + e))//integer value
                .mapToObj(c -> (char) c).peek(e -> System.out.println("2: " + e)) //ASCII value
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}
