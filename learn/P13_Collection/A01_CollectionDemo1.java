package learn.P13_Collection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    /*
        Collection是单列集合的祖宗接口,它的功能是全部单列集合都可以继承使用的

        public boolean add(E e) 把给定的对象添加到当前集合中
        public void clear() 清空集合中所有的元素
        public boolean remove(E e) 把给定的对象在当前集合中删除
        public boolean contains(Object obj) 判断当前集合中是否包含给定的对象
        public boolean isEmpty() 判断当前集合是否为空
        public int size() 返回集合中元素的个数/集合的长度

        注意点:
            Collection是一个接口,不能直接创建他的对象,只能创建实现类的对象
     */

    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();

        // 添加元素
        // 细节1:如果要往List系列集合中添加数据,只会返回true,因为List允许元素重复
        // 细节2:如果要往Set系列集合中添加数据,成功返回true,失败返回false,因为Set不允许元素重复
        coll.add("aaa");
        System.out.println(coll);


        // 清空元素
        coll.clear();
        System.out.println(coll);


        // 删除元素
        // 细节1:因为Collection里定义的是共性的方法,不存在索引
        // 细节2:会返回布尔值,当存在此数据成功删除返回true,不存在失败返回false
        coll.add("aaa");
        coll.add("bbb");
        coll.remove("aaa");
        System.out.println(coll);


        // 判断是否包含此变量
        // 细节:底层是依赖object.equals(根据地址值)方法判断是否存在的
        // 如果集合中存储的是自定变量,也想判断,一定要重写equals
        boolean result = coll.contains("aaa");
        System.out.println(result);
        result = coll.contains("bbb");
        System.out.println(result);

        // 判断集合是否为空
        result = coll.isEmpty();
        System.out.println(result);

        // 获取集合长度(当前元素个数)
        int size = coll.size();
        System.out.println(size);

    }
}
