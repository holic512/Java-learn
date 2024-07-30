package learn.algorithm;

public class A02_BinarySearchDemo1 {
    // 二分查找/折半查找
    // 核心:
    // 每次排除一半的查找范围

    // 需求:定义一个方法利用二分查找,查询某个数据的索引
    // 数据:{7,23,79,81,103,127,131,147}

    public static void main(String[] args) {
        int[] nums = {7, 23, 79, 81, 103, 127, 131, 147};
        int target = 7;

        int index = binarySearch(nums, target);
        System.out.println(index);
    }

    public static int binarySearch(int[] array, int target) {
        int min = 0;
        int max = array.length - 1;

        while (min <= max) {

            int mid = (min + max) / 2;

            if (target == array[mid]) {
                return mid;
            } else if (target < array[mid]) {
                max = mid - 1;

            } else if (target > array[mid]) {
                min = mid + 1;
            }

        }
        return -1;
    }
}
