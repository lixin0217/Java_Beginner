/**
 * 【范例6-5】 短路逻辑运算符的使用（ShortCircuitLogical6 5.java）。
 */
public class ShortCircuitLogical6_5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;

        boolean flag = (a < 3) && (b++ < 4); // &&短路，所以b++系统没有运算
        System.out.println("flag = " + flag);
        System.out.println("b = " + b);

        flag = (b++ < 4) && (a < 3);
        System.out.println("flag = " + flag);
        System.out.println("b = " + b);

        System.out.println("==================");

        flag = (a > 3) || (b++ > 4); //||短路，所以b++系统没有运算
        System.out.println("flag = " + flag);
        System.out.println("b = " + b);

        flag = (b++ > 4) || (a > 3);
        System.out.println("flag = " + flag);
        System.out.println("b = " + b);
    }
}
