package learn.P12_algorithm.B02_sort;

public class A04_RecursionDemo2 {
    /*
        递归求阶乘
        要求:用递归求5的阶乘
        即 5 * 4 * 3 * 2 * 1
     */

    public static void main(String[] args) {

        int result = recursionFactorial(5);

        System.out.println(result);
    }

    private static int recursionFactorial(int i) {
        if (i == 1) {
            return 1;
        }
        return i * recursionFactorial(i - 1);
    }
}
