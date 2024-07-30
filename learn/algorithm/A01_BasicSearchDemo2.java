package learn.algorithm;

import java.util.ArrayList;
import java.util.List;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        //课堂练习1:
        //需求：定义一个方法,查询某个元素在数组中的索引
        //要求:不考虑数组中元素是否重复

        //课堂练习1:
        //需求：定义一个方法,查询某个元素在数组中的索引
        //要求:考虑数组中元素是否重复
    }

    public static int basicSearch1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int[] basicSearch2(int[] nums, int target) {
        List<Integer> indices = new ArrayList<>(); // 使用ArrayList来动态存储索引
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                indices.add(i); // 将匹配的索引添加到列表中
            }
        }

        // 如果没有找到任何匹配的索引，返回一个空的数组
        if (indices.isEmpty()) {
            return new int[0];
        }

        // 将列表转换为数组并返回
        int[] result = new int[indices.size()];
        for (int j = 0; j < indices.size(); j++) {
            result[j] = indices.get(j);
        }
        return result;
    }


}
