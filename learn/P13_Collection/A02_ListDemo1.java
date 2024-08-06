package learn.P13_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A02_ListDemo1 {
    /*
        List集合的特点
        有序:存和取的元素顺序一致
        有索引:可以通过索引操作元素
        可重复:存储的元素可以重复

        List集合的特有方法
        List 继承了 Collection 的全部方法
        List集合因为有索引,所以多了很多索引操作的方法

        void add(int index,E element)   在此集合中的指定位置,插入指定元素
        E remove(int index)             删除指定索引处的元素,返回被删除的元素
        E set(int index,E element)      修改指定索引处的元素,返回被修改的元素
        E get(int index)                返回指定索引处的元素
     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        // void add(int index,E element)   在此集合中的指定位置,插入指定元素
        list.add(1,"qqq");
        System.out.println(list);

        // E remove(int index)             删除指定索引处的元素,返回被删除的元素
        // 如果存在 list中存储的是int数据,指向remove
        // 会优先调用remove(int index)而不是remove(E)
        // 重载的方法会优先调用实参和形参类型一致的方法
        // 如果需要执行删除,需要手动装箱
        list.remove(3);
        System.out.println(list);

        // E set(int index,E element)      修改指定索引处的元素,返回被修改的元素
        String result = list.set(0,"set");
        System.out.println(result);
        System.out.println(list);

        // E get(int index)                返回指定索引处的元素
        result = list.get(0);
        System.out.println(result);

    }
}
