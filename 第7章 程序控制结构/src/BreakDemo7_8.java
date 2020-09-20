/**
 * 以下面的程序为例，利用for循环输出循环变量i的值，当i除以3所取的余数为0时，
 * 即使用break语句的跳离循环，并于程序结束前输出循环变量i的最终值。
 * 【范例7-8】 break语句的使用（breakDemo7 8.java）。
 */
public class BreakDemo7_8 {
    public static void main(String[] args) {
        int i = 0;
        for (i = 1; i < 10; i++) {
            if (i % 3 == 0)
                break;
            System.out.println("i = " + i);
        }
        System.out.println("循环中断，i = " + i);
    }
}
