package leetcode;

public class TwoSum_1 {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {

        TwoSum_1 test = new TwoSum_1();

        // 测试1
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = test.twoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);

    }

}

