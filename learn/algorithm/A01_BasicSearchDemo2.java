package learn.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A01_BasicSearchDemo2 {

    //课堂练习1:
    //需求：定义一个方法,查询某个元素在数组中的索引
    //要求:不考虑数组中元素是否重复

    //课堂练习2:
    //需求：定义一个方法,查询某个元素在数组中的索引
    //要求:考虑数组中元素是否重复

    public static void main(String[] args) {

        int[] array = {5, 6, 8, 1, 5, 3};
        int target = 5;

        int index1 = basicSearch1(array,target);
        System.out.println("课堂练习一的查找为"+index1);

        int[] index2 = basicSearch2(array,target);
        System.out.println("课堂练习二的查找为"+Arrays.toString(index2));

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

        // 使用ArrayList来动态存储索引
        List<Integer> indices = new ArrayList<>();
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
