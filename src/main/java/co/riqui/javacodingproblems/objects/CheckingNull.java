package co.riqui.javacodingproblems.objects;

import java.util.*;

/**
 * @author ricardoquiroga on 16-05-22
 */
public class CheckingNull {

    public static void main(String[] args) {

//        Checking null references in functional style and imperative code
        List<Integer> numbers
                = Arrays.asList(1, 2, null, 4, null, 16, 7, null);


    }

    public static List<Integer> evenIntegers(List<Integer> integers) {

        // integers == null //codigo imperativo
        if (Objects.isNull(integers)) {
            return Collections.EMPTY_LIST;
        }

        List<Integer> evens = new ArrayList<>();
        for (Integer nr : integers) {
//            Objects.nonNull(nr)
            if (Objects.nonNull(nr) && nr % 2 == 0) {
                evens.add(nr);
            }
        }

        return evens;
    }

    public static int sumIntegers(List<Integer> integers) {

        if (integers == null) {
            throw new IllegalArgumentException("List cannot be null");
        }

        return integers.stream()
                //codigo funcional
                .filter(Objects::nonNull) //i -> i != null
                .mapToInt(Integer::intValue).sum();
    }

    public static boolean integersContainsNulls(List<Integer> integers) {

        if (integers == null) {
            return false;
        }

        return integers.stream()
                .anyMatch(Objects::isNull);//i -> i == null
    }

    static class Car {

        private  String name;
        private  String color;

        Car(String name, String color) {

            //imperativo
//            if (name == null) {
//                throw new NullPointerException("Car name cannot be null");
//            }
            this.name = Objects.requireNonNull(name, "Car name cannot be null");
            this.color = Objects.requireNonNull(color, "Car color cannot be null");
        }
        Car(String name){
            //imperativo
//            if (name == null) {
//                this.name = "No name";
//            } else {
//                this.name = name;
//            }

            this.name = Objects.requireNonNullElse(name, "No name");
        }

//         Car(String name, String color) {
//
//            this.name = MyObjects.requireNonNullElseThrow(name,
//                    new UnsupportedOperationException("Name cannot be set as null"));
//            this.color = MyObjects.requireNotNullElseThrow(color, () ->
//                    new UnsupportedOperationException("Color cannot be set as null"));
//        }
    }

}
