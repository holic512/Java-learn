package learn.P12_algorithm.search;

public class A03_BlockSearchDemo1 {
    /*
        分块查找
        核心思想:
            块内无需,块间有序
        实现步骤:
            1.创建驻足blockArray存放每一个块对象的信息
            2.先查找blockArray去确定要查找的数据属于哪一块
            3.再单独遍历这一块数据即可
     */

    public static void main(String[] args) {

        int[] array = {
                16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66
        };

        // 创建三个块的对象
        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        // 定义数组来管理三个块的对象(索引表)
        Block[] blockArray = {b1, b2, b3};

        // 定义一个变量用来记录要查找的元素
        int target = 6;

        //调用发放,传递索引表,数组,要查找的元素
        int index = getIndex(blockArray, array, target);

        System.out.println(index);

    }

    // 利用分块查找的原理,查询number的索引
    // 1.确定number在索引表的位置

    private static int getIndex(Block[] blockArray, int[] array, int target) {
        // 获取目标所在的块对象
        Block block = findIndexBlock(blockArray, target);

        // 当目标大于块中所有最大值,证明没有
        if (block == null) {
            return -1;
        }

        // 获取目标块的起始索引,结束索引
        int startIndex = block.startIndex;
        int endIndex = block.endIndex;

        //开始遍历位置 i范围是块范围
        for (int i = startIndex; i <= endIndex; i++) {
            if (target == array[i]) {
                return i;
            }
        }

        return -1;
    }

    // 用来确定target在哪一块
    private static Block findIndexBlock(Block[] blockArray, int target) {
        // 从0索引开始遍历,如果target小于max,表示target在这块中

        for (Block block : blockArray) {
            if (target <= block.max) {
                return block;
            }
        }
        return null;

    }

}

class Block {
    public int max;
    public int startIndex;
    public int endIndex;

    Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }
}