package learn.algorithm;

public class A02_BinarySearchDemo2 {
    // 插值查找-二分查找(优化方案)
    // 核心:
    // 根据 数据 在 数组数据范围内的比例
    // 来确定较准确排查范围

    // 需求:定义一个方法利用二分查找,查询某个数据的索引
    // 数据:{2,3,4,6,8,10,12,14,16}

    public static void main(String[] args) {
        int target = 1;
        int[] nums = {2, 3, 4, 6, 8, 10, 12, 14, 16};
        int index = binarySearch(nums, target);
        System.out.println(index);
    }

    public static int binarySearch(int[] nums, int target) {

        int min = 0;
        int max = nums.length - 1;

        while (min <= max && target >= nums[min] && target <= nums[max]) {

            if (min == max) {
                if (nums[min] == target) {
                    return min;
                }
                return -1;
            }

            // 计算中点
            int mid = min + (target - nums[min]) / (nums[max] - nums[min]) * (max - min);

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }

            System.out.println("当前最小索引:" + min + " 当前最大索引:" + max + " 当前中点:" + mid);

        }
        return -1;
    }
}
