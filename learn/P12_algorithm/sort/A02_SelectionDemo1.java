package learn.P12_algorithm.sort;

import java.util.Arrays;

public class A02_SelectionDemo1 {
    /*
        选择排序:
        1.从0索引开始,跟后面的元素一一比较
        2.小的放前面,大的放后面
        3.第一次循环结束后,最小的数据已经确定
        4.第二次循环从1索引开始,以此类推
     */

    public static void main(String[] args) {
        // 定义被排序的数组
        int[] array = {5, 7, 1, 9, 6};

        // 执行选择排序方法
        int[] result = selectionSort(array);

        System.out.println(Arrays.toString(result));
    }

    private static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
