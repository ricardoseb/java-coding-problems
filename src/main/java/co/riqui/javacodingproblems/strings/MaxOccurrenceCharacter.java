package co.riqui.javacodingproblems.strings;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * @author ricardoquiroga on 01-07-22
 * Finding the character with the most appearances
 */
public class MaxOccurrenceCharacter {

    public static void main(String[] args) {

        Pair<Character, Long> ricki = maxOccurrenceCharacter("ricki");
        System.out.println("character with the most appearances:" + "'" + ricki.getKey() + "'"
                + " count:" + ricki.getValue());
    }

    public static Pair<Character, Long> maxOccurrenceCharacter(String str) {

        return str.chars()
                .filter(c -> Character.isWhitespace(c) == false) // ignoring space
                .mapToObj(c -> (char) c)
                .collect(groupingBy(c -> c, counting()))
                .entrySet()
                .stream()
                .max(comparingByValue())
                .map(p -> new Pair(p.getKey(), p.getValue()))
                .orElse(new Pair(Character.MIN_VALUE, -1L));
    }
}
