package learn.P12_algorithm.B02_sort;

import java.util.Arrays;

public class A03_InsertDemo1 {
    /*
        插入排序:
            将0索引的元素到N索引的元素看作是有序的,把N+1索引的元素到最后一个当成是无需的
            遍历无序的数据,将遍历到的元素插入有序序列中适当的位置,如遇到相同数据,插在后面
            N的范围:0-最大索引
     */
    public static void main(String[] args) {
        // 定义被排序的数组
        int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 2, 19, 50, 48};

        // 找到无序序列的开始索引
        int startIndex = getStartIndex(array);

        // 执行插入排序方法
        int[] result = insertSort(array, startIndex);

        System.out.println(Arrays.toString(result));

    }

    private static int getStartIndex(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i + 1]) {
                return i + 1;
            }
        }

        return 1;
    }

    private static int[] insertSort(int[] array, int startIndex) {

        for (int i = startIndex; i < array.length; i++) {
            int j = i - 1;
            int current = array[i];

            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;

        }
        return array;
    }
}
