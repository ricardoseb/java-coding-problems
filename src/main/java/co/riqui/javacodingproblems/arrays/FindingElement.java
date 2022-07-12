package co.riqui.javacodingproblems.arrays;

import co.riqui.javacodingproblems.arrays.model.Melon;

import java.util.Arrays;

/**
 * @author ricardoquiroga on 11-07-22
 */
public class FindingElement {

    public static void main(String[] args) {
        int[] numbers = {4, 5, 1, 3, 7, 4, 1};
        boolean isPresent = containsElement(numbers, 7);
        System.out.println("isPresent = " + isPresent);

        Melon[] melons = new Melon[]{new Melon("Crenshaw", 2000),
                new Melon("Gac", 1200), new Melon("Bitter", 2200)
        };

        boolean isObjectPresent = containsElementObject(melons, new Melon("Gac", 1200));
        System.out.println("isObjectPresent = " + isObjectPresent);


    }

    public static boolean containsElement(int[] arr, int toContain) {

        return Arrays.stream(arr)
                .anyMatch(e -> e == toContain);
    }

    public static <T> boolean containsElementObject(T[] arr, T toContain) {
        return Arrays.asList(arr).contains(toContain);
               
    }
}
