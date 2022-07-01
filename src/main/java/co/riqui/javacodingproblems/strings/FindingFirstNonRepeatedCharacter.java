package co.riqui.javacodingproblems.strings;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author ricardoquiroga on 20-06-22
 */
public class FindingFirstNonRepeatedCharacter {

    public static void main(String[] args) {

        char characterIntegerMap = firstNonRepeatedCharacter("renatar");
        System.out.println("characterIntegerMap = " + characterIntegerMap);
    }

    public static char firstNonRepeatedCharacter(String str) {

        Map<Character, Integer> chars = new LinkedHashMap<>();

        // or use for(char ch: str.toCharArray()) { ... }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            chars.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        for (Map.Entry<Character, Integer> entry: chars.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return Character.MIN_VALUE;
    }
    
}
