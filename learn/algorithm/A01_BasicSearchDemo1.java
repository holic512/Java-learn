package learn.algorithm;

public class A01_BasicSearchDemo1 {
    public static void main(String[] args) {
        /*
         基本查找 - 顺序查找
         核心：
         从 0 索引 遍历 查询
        */

        /*
         需求：定义一个方法，利用基本查找，查询某个元素是否存在
         数据： {131，127，147，81，103，23，7，79}
         */

        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        int target = 127;

        boolean result1 = basicSearch(arr, target);
        System.out.println("第一种写法的结果是:" + result1);

        boolean result2 = newBasicSearch(arr, target);
        System.out.println("第二种写法的结果是:" + result2);
    }


    /*
    参数：   数组 查找的元素
    返回值： 元素是否存在
     */
    public static boolean basicSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static boolean newBasicSearch(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
