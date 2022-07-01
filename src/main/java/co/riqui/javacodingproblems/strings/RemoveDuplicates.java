package co.riqui.javacodingproblems.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author ricardoquiroga on 22-06-22
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        String ricki = removeDuplicates("Ricki");
        System.out.println("rick = " + ricki);
    }
    public static String removeDuplicates(String str) {

        return Arrays.stream(str.split(""))
                .distinct()
                .collect(Collectors.joining());
    }
}
