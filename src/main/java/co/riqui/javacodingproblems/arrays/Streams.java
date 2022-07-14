package co.riqui.javacodingproblems.arrays;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author ricardoquiroga on 13-07-22
 */
public class Streams {

    public static void main(String[] args) {
//        we create a Stream from an array
        String[] arr = {"One", "Two", "Three", "Four", "Five"};
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(System.out::println);
        System.out.println("= ===== =");
        //if we need a stream from a sub-array,
        Stream<String> stream2 = Arrays.stream(arr, 0, 2);
        stream2.forEach(System.out::println);
        System.out.println("= ===== =");
//        passing through a List
        Stream<String> stream3 = Arrays.asList(arr).subList(0, 2).stream();
        stream3.forEach(System.out::println);
        System.out.println("= ===== =");
        //Supplier -> creating a new Stream each time we need one.
        Supplier<Stream<String>> stream4 = () -> Stream.of("One", "Two");
        stream4.get().forEach(System.out::println);
        System.out.println("= ===== =");
//        Creating an array from a Stream can be accomplished via the Stream.toArray() method.
        String[] array = stream4.get().toArray(String[]::new);
        for (String s : array) {
            System.out.println("s = " + s);
        }
        System.out.println("= ===== =");
        int[] integers = {2, 3, 4, 1};
        //IntStream type (this is the int primitive specialization of Stream)
        Supplier<IntStream> intStream = () -> Arrays.stream(integers);
        intStream.get().forEach(System.out::println);
        System.out.println("= ===== =");
        IntStream intStream2 = IntStream.of(integers);
        intStream2.forEach(System.out::println);
        System.out.println("= ===== =");
//        Creating an array from a Stream of integers can be accomplished via the Stream.toArray() method.
        int[] intArray = intStream.get().toArray();
        for (int i : intArray) {
            System.out.println("s = " + i);
        }

    }
}
