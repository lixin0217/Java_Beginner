/**
 * 3.6 实战练习
 * 1.分析下面程序代码的运行结果，运行程序并查看实际结果，分析产生结果的原因。
 */
public class Execise3_1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        double z = 3.0;

        int a = 14;
        int b = 3;
        double c = 14.0;

        // int / int只能保存int，输出只有商的整数部分。
        System.out.println(x + " / " + y + " = " + x / y);
        System.out.println(x + " / " + z + " = " + x / z);
        System.out.println(a + " / " + b + " = " + a / b);
        System.out.println(c + " / " + b + " = " + c / b);
    }
}
