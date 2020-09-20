/**
 * 2. 编写程序，实现生成一随机字母（a-z，A-Z），并输出，运行结果如下图所示。
 * <p>
 * 拓展知识。
 * ⑴ Math.random()返回随机 double 值，该值大于等于 0.0 且小于 1.0。
 * 例如: double rand = Math.random(); // rand 储存着[0,1) 之间的一个小数
 * ⑵ 大写字母A～Z对应整数65 ～ 90、小写字母a～z对应整数97 ～ 122。
 */
public class Exercise6_2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            double rand = Math.random();
            double num = 65 * (1 + rand); //取得[65~130)的double值
            int x = (int) num; //强制类型转换为[65,130)的int值
            char ch = (char) x; //强制类型转换为char值

            if (x >= 65 & x <= 90) {
                System.out.println("Big Character is: " + ch);
            } else if (x >= 97 & x <= 122) {
                System.out.println("Small Character is: " + ch);
            } else System.out.println("There is no character");
        }
    }
}
