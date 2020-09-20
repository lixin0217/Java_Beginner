import java.util.Scanner;

/**
 * 7.6 实战练习
 * 1. 编写程序，使用循环控制语句计算“1+2+3+…+100”的值。
 * 2. 编写程序，使用程序产生1-12之间的某个整数（包括1和12），然后输出相应月份的天数（2月按28天算）。
 * 3. 编写程序，判断某一年是否是闰年。
 */
public class Exercise7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println(year + "年是闰年.");
        } else
            System.out.println(year + "年不是闰年。");
    }
}
