package learn.api.Runtime;

public class Demo {
    /*
        public static  Runtime getRuntime()    当前系统的运行环境对象
        public void    exit(int status)        停止虚拟机
        public int     availableProcessors()   获得cpu的线程数
        public long    maxMemory()             Jvm能从系统中获取的总内存大小(byte)
        public long    totalMemory()           Jvm已经从系统中获取总内存大小(byte)
        public long    freeMemory()            Jvm剩余内存大小(单位byte)
        public Process exec(String command)    运行cmd命令

     */
    public static void main(String[] args) {

        // 获取Runtime的对象
        Runtime runtime = Runtime.getRuntime();

        // 获得cpu的线程数
        int thread = runtime.availableProcessors();
        System.out.println("当前电脑线程数为" + thread);

        // 停止虚拟机
        runtime.exit(0);

    }
}
