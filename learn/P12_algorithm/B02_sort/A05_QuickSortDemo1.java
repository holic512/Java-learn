package learn.P12_algorithm.B02_sort;

import java.util.Arrays;

public class A05_QuickSortDemo1 {
    /*
        快速排序:
            第一轮:以0索引的数字为基准数,确定基准数在数组中正确的位置.
            比基准数小的全部都在左边,比基准数大的全部都在右边
            后面依次类推
     */

    public static void main(String[] args) {

        int[] array = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        quickSort(array, 0, array.length-1);

        System.out.println(Arrays.toString(array));

    }

    private static void quickSort(int[] array, int left, int right) {
        // 定义两个变量记录要查找的范围
        int start = left;
        int end = right;

        // 如果 start 大于等于 end，说明已经排序完毕
        if (start >= end) {
            return;
        }

        // 选择基准数，这里选择的是第一个元素
        int baseNumber = array[start];

        // 利用循环找到要交换的数字
        while (start < end) {
            // 从右向左找小于基准数的元素
            while (start < end && array[end] >= baseNumber) {
                end--;
            }
            // 从左向右找大于基准数的元素
            while (start < end && array[start] <= baseNumber) {
                start++;
            }
            // 交换 start 和 end 的元素
            if (start < end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
        }

        // 基准数归位
        array[left] = array[start];
        array[start] = baseNumber;

        // 递归对基准数左边的子数组进行排序
        quickSort(array, left, start - 1);
        // 递归对基准数右边的子数组进行排序
        quickSort(array, start + 1, right);
    }

}
