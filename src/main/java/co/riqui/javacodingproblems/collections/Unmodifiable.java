package co.riqui.javacodingproblems.collections;

import co.riqui.javacodingproblems.collections.model.MutableCar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author ricardoquiroga on 19-07-22
 */
public class Unmodifiable {
    //        In the case of primitives, it is pretty simple. For example, we can create an immutable List of integers
//        as follows:
    private static final List<Integer> LIST
            = Collections.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5));
    private static final List<Integer> LIST2 = List.of(1, 2, 3, 4, 5);

    public static void main(String[] args) {
//        Let's create a list of MutableCar via the Collections.unmodifiableList() method:
        MutableCar mutableCar = new MutableCar("red",4);
        MutableCar mutableCar2 = new MutableCar("blue",5);
        final List<MutableCar> mutableCarList = Collections.unmodifiableList(Arrays.asList(mutableCar, mutableCar2));
        mutableCar.setDoor(3);
        mutableCar2.setDoor(4);
//        So, is list unmodifiable or immutable?  The answer is unmodifiable.
        System.out.println("mutableCarList.get(0).getDoor() = " + mutableCarList.get(0).getDoor());
        System.out.println("mutableCarList.get(1).getDoor() = " + mutableCarList.get(1).getDoor());
    }
}
