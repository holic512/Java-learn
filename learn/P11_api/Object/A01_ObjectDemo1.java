package learn.P11_api.Object;

public class A01_ObjectDemo1 {
    /*
        Object是Java中的项级父类.所有的类都直接或间接的继承于Object类
        Object类中的方法可以被所有子类访问

        public Object()                     空参构造
        public String toString()            返回对象的字符串表示形式
        public boolean equals(Object obj)   比较两个对象是否相等
        protected Object clone(int a)       对象克隆

     */

    public static void main(String[] args) {

        // toString  返回对象的字符串表示形式
        // 结论:
        // 如果我们要查看对象的属性值,需要重写toString方法
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);
        // 输出 java.lang.Object@10f87f48
        // 包名+类名+地址



        // 比较两个对象是否相等
        Student s1 = new Student();
        Student s2 = new Student();
        boolean result = s1.equals(s2);
        System.out.println(result);
        // 默认调用object的equals(比较地址值)
        // 如果要比较其他(成员变量想的)需要重写equals


    }
}
