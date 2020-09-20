/**
 * 6.5 实战练习
 * 1. 编写程序，计算表达式“（（12345679*9）>（97654321*3））? true :false”的值。
 */
public class Exercise6_1 {
    public static void main(String[] args) {
        boolean b = (12345679 * 9) > (97654321 * 3) ?true:false;
        System.out.println("（12345679*9）>（97654321*3））? true :false = " + b);
    }
}
