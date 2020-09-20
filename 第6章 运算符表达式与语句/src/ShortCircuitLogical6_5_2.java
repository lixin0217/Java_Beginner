/**
 * 【范例6-5】 短路逻辑运算符的使用（ShortCircuitLogical6 5.java）。
 * 下面的程序说明了短路逻辑运算符“&&”和非短路逻辑运算符的区别。
 */
public class ShortCircuitLogical6_5_2 {
    public static void main(String[] args) {
        if (1 == 2 && 1 / 0 == 0) {
            System.out.println("1：条件满足！");
        }
//        if (1 == 2 & 1 / 0 == 0) {
//            System.out.println("2：条件满足！");
//        }
        if (1 == 1 || 1 / 0 == 0) {
            System.out.println("3：条件满足");
        }
//        if (1 == 1 | 1 / 0 == 0) {
//            System.out.println("4：条件满足");
//        }
    }
}
