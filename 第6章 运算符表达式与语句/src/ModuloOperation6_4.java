/**
 * 【范例6-4】 取余数（也称取模）操作（ModuloOperation6 4.java）。
 * 以下面的程序为例，声明两个整型变量a、b，并分别赋值为5和 3，再输出a%b的运算结果。
 */
public class ModuloOperation6_4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        float c = 2.1f;
        System.out.println(a + " % " + b + " = " + a % b);
        System.out.println(b + " % " + a + " = " + b % a);
        System.out.println(b + " % " + c + " = " + b % c);
    }
}
