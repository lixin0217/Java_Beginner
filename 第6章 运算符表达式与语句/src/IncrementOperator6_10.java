/**
 * 【范例6-10】 “++”运算符的两种使用方法（IncrementOperator6 10.java）。
 * a++：先用后加
 * 输出a++及运算后的a的值，后缀加1的意思是先执行对该数的操作，再执行加1操作，
 * 因此先执行a输出操作，再将其值自加1，最后输出，所以第一次输出3，第二次输出4。
 * ++b：先加后用
 * 输出++b运算后b的值，先执行自加操作，再执行输出操作，所以两次都输出4。
 */
public class IncrementOperator6_10 {
    public static void main(String[] args) {
        int a = 3, b = 3;
        System.out.println("a = " + a);
        System.out.println("a++ = " + (a++) + ", a = " + a); //先用后加

        System.out.println("b = " + b);
        System.out.println("++b = " + (++b) + ", b = " + b); //先加后用
    }
}
