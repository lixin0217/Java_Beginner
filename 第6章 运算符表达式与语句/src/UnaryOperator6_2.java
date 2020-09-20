/**
 * 【范例6-2】 一元运算符的使用（UnaryOperator6 2.java）。
 * 【范例6-2】的程序声明了byte类型的变量a及boolean类型的变量b，可以看到这两个变量分别进行了“～”与“！”运算。
 */
public class UnaryOperator6_2 {
    public static void main(String[] args) {
        byte a = Byte.MAX_VALUE;
        boolean b = false;
        System.out.println("a = " + a + ", ~a = " + (~a));
        System.out.println("b = " + b + ", !b = " + !b);
    }
}
