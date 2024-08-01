package learn.P12_algorithm.B02_sort;

import java.util.Arrays;

public class A01_BubbleDemo1 {
    /*
        冒泡排序:
        核心思想:
        1.相邻的两个元素俩俩交换
        2.第一轮比较完成出现最大值,第二轮可以少循环一次
        3.如果数组中有n个数据,则只需要执行n-1次循环
     */
    public static void main(String[] args) {

        // 定义被排序的数组
        int[] array = {5, 7, 1, 6, 9};

        // 执行冒泡排序方法
        int[] result = bubbleSort(array);

        System.out.println(Arrays.toString(result));
    }

    private static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }


}
