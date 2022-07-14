package co.riqui.javacodingproblems.arrays;

import co.riqui.javacodingproblems.arrays.model.Melon;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ricardoquiroga on 13-07-22
 */
public class EqualMismatch {

    public static void main(String[] args) {
        int[] integers1 = {3, 4, 5, 6, 1, 5};
        int[] integers2 = {3, 4, 5, 6, 1, 5};
        int[] integers3 = {3, 4, 5, 6, 1, 3};
        boolean i12 = Arrays.equals(integers1, integers2); // true
        System.out.println("i12 = " + i12);
        boolean i13 = Arrays.equals(integers1, integers3); // false
        System.out.println("i13 = " + i13);

//        check whether two segments (or ranges)of the arrays are equal as well via the boolean
        boolean is13 = Arrays.equals(integers1, 1, 4, integers3, 1, 4);
        System.out.println("is13 = " + is13);

        Melon[] melons1 = {
                new Melon("Horned", 1500), new Melon("Gac", 1000)
        };

        Melon[] melons2 = {
                new Melon("Horned", 1500), new Melon("Gac", 1000)
        };

        Melon[] melons3 = {
                new Melon("Hami", 1500), new Melon("Gac", 1000)
        };

        boolean m12 = Arrays.equals(melons1, melons2); // true
        System.out.println("m12 = " + m12);
        boolean m13 = Arrays.equals(melons1, melons3); // false
        System.out.println("m13 = " + m13);

        boolean ms13 = Arrays.equals(melons1, 0, 1, melons3, 0, 1);
        System.out.println("ms13 = " + ms13);

        Comparator<Melon> byWeight = Comparator.comparing(Melon::getWeight);
        boolean mw13 = Arrays.equals(melons1, melons3, byWeight); // true
        System.out.println("mw13 = " + mw13);

        System.out.println("==================");
//        If two arrays are equal, then a mismatch should return -1. But if two arrays are not equal, then a mismatch
//        should return the index of the first mismatch between the two given arrays
        int mi12 = Arrays.mismatch(integers1, integers2); // -1
        System.out.println("mi12 = " + mi12);

        //we receive the value 5, which is the index of the first mismatch between these two
        int mi13 = Arrays.mismatch(integers1, integers3); // 5
        System.out.println("mi13 = " + mi13);

        int mm12 = Arrays.mismatch(melons1, melons2); // -1
        System.out.println("mm12 = " + mm12);
        int mm13 = Arrays.mismatch(melons1, melons3); // 0
        System.out.println("mm13 = " + mm13);

        // range [1, 2), return -1
        int mms13 = Arrays.mismatch(melons1, 1, 2, melons3, 1, 2);
        System.out.println("mms13 = " + mms13);
        
    }

}
