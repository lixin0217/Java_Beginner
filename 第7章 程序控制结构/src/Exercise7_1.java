/**
 * 7.6 实战练习
 * 1. 编写程序，使用循环控制语句计算“1+2+3+…+100”的值。
 * 2. 编写程序，使用程序产生1-12之间的某个整数（包括1和12），然后输出相应月份的天数（2月按28天算）。
 * 3. 编写程序，判断某一年是否是闰年。
 */
public class Exercise7_1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            sum += i;
        }
        System.out.println("1 + 2 + 3 + ... + 100 = " + sum);
    }
}
