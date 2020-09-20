/**
 * 3. 编写程序，实现产生（或输入）一随机字母（a-z，A-Z），转为大写形式，并输出。
 * 请分别使用三元运算和位运算实现，运行结果如下图所示。
 * <p>
 * 拓展知识点。
 * ⑴ 大写字母A～Z对应整数65 ～ 90、小写字母a～z对应整数97 ～ 122。
 * ⑵ 可以使用 0x 表示16进制数，如0x10 表示16进制的 10。
 */
public class Exercise6_3 {
    public static void main(String[] args) {
        double rand = Math.random();
        double num = 65 * (1 + rand); //取得[65~130)的double值
        int x = (int) num; //强制类型转换为[65,130)的int值
        char ch = (char) x; //强制类型转换为char值

        if (x >= 97 & x <= 122) {
            System.out.println("转换前是: " + ch);
            System.out.println("转换后是: " + (char) (x - 32));

        } else if (x >= 65 & x <= 90) {
            System.out.println("转换前是: " + ch);
            System.out.println("转换后是: " + ch);
        }
    }
}
