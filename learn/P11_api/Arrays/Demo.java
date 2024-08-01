package learn.P11_api.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {
    /*
        public static String toString(数组)                          把数组拼接成一个字符串
        public static int binarySearch(数组,查找的元素)                二分法查找元素
        public static int[] copyOf(原数组,新数组长度)                  拷贝数组
        public static int[] copyOfRange(原数组,起始索引,结束索引)       拷贝数组(指定范围)
        public static void fill(数组,元素)                            填充数组
        public static void sort(数组)                                按照默认方法进行数组排序
        public static void sort(数组,排序规则)                        按照指定规则进行数组排序
     */
    public static void main(String[] args) {
        // toString 将数组变成字符串
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr));


        // binarySearch 二分法查找元素
        System.out.println(Arrays.binarySearch(arr, 2));


        // copyOf 拷贝数组
        int[] newArr = Arrays.copyOf(arr, 20);
        System.out.println(Arrays.toString(newArr));


        // copyOfRange 拷贝数组指定范围


        // fill 填充数组
        Arrays.fill(arr, 10);
        System.out.println(Arrays.toString(arr));


        // sort 排序
        int[] arr2 = {4, 8, 6, 3, 2, 1, 4, 8, 5, 5, 17};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));


        // sort 排序 指定规则
        Integer[] arr3 = {4, 8, 6, 3, 2, 1, 4, 8, 5, 5, 17};
        Arrays.sort(arr3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr3));
    }
}
