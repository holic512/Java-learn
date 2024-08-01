package learn.P12_algorithm.B02_sort;

public class A04_RecursionDemo1 {
    // 递归求和
    // 需求:利用递归求1-100之间的和
    // 即 1+2+3+...+98+99+100

    public static void main(String[] args) {

        int sum = recursionSum(100);

        System.out.println(sum);

    }

    private static int recursionSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursionSum(n - 1);
    }
}
