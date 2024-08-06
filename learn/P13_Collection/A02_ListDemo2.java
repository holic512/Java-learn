package learn.P13_Collection;

import java.util.ArrayList;
import java.util.List;

public class A02_ListDemo2 {
    /*
        List除了collection的三种遍历方式
        还有独有的列表迭代器和普通for循环(有索引)
     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        // 普通for循环
        // 利用collection的size和自身的get方法
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        // 列表迭代器 LIstIterator
        // void add(E e)        将指定的元素插入列表(迭代器方法)
        // boolean hasNext()    正向遍历,如果有元素返回true,反之返回false
        // hasPrevious()        逆向遍历
        // next()
        // nextIndex()
        // previous()           返回列表中的前一个元素
        // previousIndex()
        // remove()
        // set()


    }
}
