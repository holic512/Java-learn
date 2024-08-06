package learn.P13_Collection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo3 {
    /*
         增强for遍历
         增强for的底层就是迭代器,为了简化迭代器的代码书写的
         他是 JDK5之后出现的,其内部原理就是一个Iterator迭代器
         所有的单列集合和数组才能用增强 for 进行遍历

         注意点:
         此时 a 为第三方变量,表示集合中的每一个数据
         修改增强for中的变量,不会改变集合中原本的数据
    */
    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

        for (String a : list) {
            System.out.println(a);
        }


    }

}
