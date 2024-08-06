package learn.P13_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A01_CollectionDemo2 {
    /*
        迭代器 iterator
        不依赖索引
        迭代器在Java中的类是Iterator,迭代器是集合专用的遍历方式

        Collection集合获取迭代器
        Iterator<E> iterator()  返回迭代器对象,默认指向当前集合0索引

        Iterator中的常用方法
        Boolean hasNext()       判断当前位置是否有元素,有元素返回true,没元素返回false
        E next()                获取当前位置的元素,并将迭代器对象移向下一个位置
        void remove()           删除由next返回的最后一个元素

        细节
        结束会报错 NoSuchElementException
        迭代器遍历完成,指针不会复位
        循环中只能用一次next方法
        迭代器遍历时,不能用集合的方法进行添加或者删除
             只能使用迭代器的 remove进行删除
     */
    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");


        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }




    }
}
