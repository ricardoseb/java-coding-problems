package co.riqui.javacodingproblems.arrays;

import co.riqui.javacodingproblems.arrays.model.Melon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author ricardoquiroga on 11-07-22
 */
public class Sorting {

    public static void main(String[] args) {
        Melon[] melons = new Melon[3];
        melons[0] = new Melon("melon0", 4);
        melons[1] = new Melon("melon1", 3);
        melons[2] = new Melon("melon2", 2);
        for (Melon melon: melons) {
            System.out.println("melon before sort = " + melon);
        }
//        Arrays.sort(melons, new Comparator<Melon>() {
//            @Override
//            public int compare(Melon melon1, Melon melon2) {
//                return Integer.compare(melon1.getWeight(), melon2.getWeight());
//            }
//        });
        //Lambda
//        Arrays.sort(melons, (Melon melon1, Melon melon2)
//                -> Integer.compare(melon1.getWeight(), melon2.getWeight()));
        Arrays.parallelSort(melons, new Comparator<Melon>() {
            @Override
            public int compare(Melon melon1, Melon melon2) {
                return Integer.compare(melon1.getWeight(), melon2.getWeight());
            }
        });
        //Lambda
//        Arrays.parallelSort(melons, (Melon melon1, Melon melon2)
//                -> Integer.compare(melon1.getWeight(), melon2.getWeight()));
        for (Melon melon: melons) {
            System.out.println("melon after sort = " + melon);
        }


        Integer[] integers = new Integer[] {3, 1, 5};

// 1, 3, 5
        Arrays.sort(integers);

// 5, 3, 1
        Arrays.sort(integers, Collections.reverseOrder());
        for (Integer integer: integers) {
            System.out.println("integers reverse order = " + integer);
        }


    }
}
