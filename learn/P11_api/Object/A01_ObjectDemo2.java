package learn.P11_api.Object;

public class A01_ObjectDemo2 {
    public static void main(String[] args) throws CloneNotSupportedException {

        int[] data = {1,2,3,4,5,6,7,8,9,10};
        User u1 = new User(1,"aa","123",data,"aaaa");

        // 对象克隆
        // 把a对象的属性值完全拷贝给b对象,也叫对象拷贝,对象复制
        // 不能直接调用 clone克隆 需要重写

        Object u2 = u1.clone();
        System.out.println(u1);
        int[] data1 = u1.getData();
        data1[0] = 10;
        System.out.println(u2);

        System.out.println(u2);
        // 由上方可知 object的clone是浅克隆 即引用数据类型 克隆其地址
        // 如果要达到深克隆 要 将 数组之类创建新的地址
        // 并将新的地址 分配给克隆对象


    }
}
