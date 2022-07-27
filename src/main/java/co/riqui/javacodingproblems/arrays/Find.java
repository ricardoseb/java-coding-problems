package co.riqui.javacodingproblems.arrays;

import co.riqui.javacodingproblems.arrays.model.Melon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * @author ricardoquiroga on 11-07-22
 */
public class Find {

    public static void main(String[] args) {
        int[] numbers = {4, 5, 1, 3, 7, 4, 1};
        boolean isPresent = containsElement(numbers, 7);
        System.out.println("isPresent = " + isPresent);

        Melon[] melons = new Melon[]{new Melon("Crenshaw", 2000),
                new Melon("Gac", 1200), new Melon("Bitter", 2200)
        };

        boolean isObjectPresent = containsElementObject(melons, new Melon("Gac", 1200));
        System.out.println("isObjectPresent = " + isObjectPresent);

        Comparator<Melon> byWeight = Comparator.comparing(Melon::getWeight);// solo compara por weight
        int indexOfElementObject = findIndexOfElementObject(melons, new Melon("Crenshaw", 2000), byWeight);
        System.out.println("indexOfElementObject = " + indexOfElementObject);

        int indexOfElementObject2 = findIndexOfElementObject(melons, new Melon("Crenshaw", 1000), byWeight);
        System.out.println("indexOfElementObject2 = " + indexOfElementObject2); // -1

    }

    public static boolean containsElement(int[] arr, int toContain) {

        return Arrays.stream(arr)
                .anyMatch(e -> e == toContain);
    }

    public static <T> boolean containsElementObject(T[] arr, T toContain) {
        return Arrays.asList(arr).contains(toContain);
               
    }

    public static <T> int findIndexOfElementObject(
            T[] arr, T toFind, Comparator<? super T> c) {

        return IntStream.range(0, arr.length)
                .filter(i -> c.compare(toFind, arr[i]) == 0)
                .findFirst()
                .orElse(-1);
    }
}
