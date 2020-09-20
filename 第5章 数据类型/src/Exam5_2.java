/**
 * 5.9 实战练习
 * 1. 编写程序，要求运行后要输出long类型数据的最小数和最大数。
 * 2. 改错题：指出错误之处并对其进行修改（本题改编自2013年巨人网络的Java程序员笔试题）。
 * 程序功能：输出int类型最小值与最大值之间的所有数是否是偶数（能被2整除的数），操作符%为求余操作。
 * 3. 请运行下面一段程序，并分析产生输出结果的原因（改编自网络Java面试题）。
 */
public class Exam5_2 {
    public static void main(String[] args) {
        for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; ++i) {
            boolean isEven = (i % 2 == 0);
            System.out.println(String.format("i%d, isEven = %b", i, isEven));
        }
    }
}
