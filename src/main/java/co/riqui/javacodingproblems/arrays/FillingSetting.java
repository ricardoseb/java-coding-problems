package co.riqui.javacodingproblems.arrays;

import java.util.Arrays;

/**
 * @author ricardoquiroga on 18-07-22
 */
public class FillingSetting {

    public static void main(String[] args) {

        int[] arr = new int[10];
//        Arrays.fill() also come with flavors for filling up just a segment / range of an array.For integers,
//        this method is fill( int[] a, int fromIndexInclusive, int toIndexExclusive, int val).
        Arrays.fill(arr, 1);


        Arrays.stream(arr).forEach(System.out::println);

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 1;
            System.out.println("i = " + arr[i]);
        }

        System.out.println(" ===JDK8=== ");
//JDK8
        Arrays.setAll(arr, t -> {
            if (t == 0) {
                return arr[t];
            } else {
                return arr[t - 1] + 1;
            }
        });

        Arrays.stream(arr).forEach(System.out::println);
        System.out.println(" ===JDK8 parallelSetAll=== ");
        //But let's assume that we want to take the preceding array (1, 2, 3, 4, 5, 6, 7, 8, 9, 10) and multiply each
//    even value by itself and decrease each odd value by 1

        Arrays.parallelSetAll(arr, t -> {
            if (arr[t] % 2 == 0) {
                return arr[t] * arr[t];
            } else {
                return arr[t] - 1;
            }
        });
// 0, 4, 2, 16, 4, 36, 6, 64, 8, 100
        Arrays.stream(arr).forEach(System.out::println);


    }


}
