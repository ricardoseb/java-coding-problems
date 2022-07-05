package co.riqui.javacodingproblems.strings;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author ricardoquiroga on 04-07-22
 */
public class SortArray {

    public static void main(String[] args) {
        String[] array1 =  new String[3];
        List.of("hello","hi","good-morning").toArray(array1);
        System.out.println("beforeSort = " + array1[0]);
        String[] ascs = sortArrayByLength(array1, "DESC");
        Arrays.stream(ascs).forEach(words -> System.out.println("words = " + words));

    }

    public static String[] sortArrayByLength(String[] strs,
                                             String direction) {
        if (direction.equals("ASC")) {
            return Arrays.stream(strs)
                    .sorted(Comparator.comparingInt(String::length))
                    .toArray(String[]::new);
        } else {
            return Arrays.stream(strs)
                    .sorted(Comparator.comparingInt(String::length).reversed())
                    .toArray(String[]::new);
        }
    }



}
