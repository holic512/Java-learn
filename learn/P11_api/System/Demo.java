package learn.P11_api.System;

import java.util.Arrays;

public class Demo {

    /*
        public static void exit(int status)     终止当前运行的Java虚拟机
        public static long currentTimeMillis()  返回当前系统的时间毫秒值形式
        public static void arraycopy(数据源数组,起始索引,目的地数组,起始索引,拷贝个数)   拷贝数组
     */

    public static void main(String[] args) {


        // 终止虚拟机
        // System.exit(0);



        // 返回时间
        long time = System.currentTimeMillis();
        System.out.println("系统的返回时间为" + time);



        // 拷贝数组
        int[] array1 = {1, 5, 6, 2};
        int[] array2 = new int[5];


        System.out.println("此时数组array1为" + Arrays.toString(array1));
        System.out.println("此时数组array2为" + Arrays.toString(array2));

        // 执行拷贝
        System.arraycopy(array1, 0, array2, 1, 3);
        System.out.println("copy后数组array2为" + Arrays.toString(array2));


    }
}
