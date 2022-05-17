package co.riqui.javacodingproblems.objects;

import java.util.Objects;

/**
 * @author ricardoquiroga on 16-05-22
 */
public class CheckingIndex {

    public static void main(String[] args) {


        Function f = new Function(50);
        // IndexOutOfBoundsException puesto que x es mayor que y
        int r = f.yMinusX(30, 20);
    }

    static class Function {

        private static final int N_UPPER_BOUND = 101;
        private final int n;

        public Function(int n) {

            this.n = Objects.checkIndex(n, N_UPPER_BOUND);
        }

        public int yMinusX(int x, int y) {
            Objects.checkFromToIndex(x, y, n);
            return y - x;
        }
    }

}
