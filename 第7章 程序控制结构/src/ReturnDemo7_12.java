/**
 * 【范例7-12】 break语句的使用（returnDemo7 12.java）。
 */
public class ReturnDemo7_12 {
    public static void main(String[] args) {
        int i = 0;
        for (i = 1; i < 10; i++) {
            if (i % 3 == 0)
                return;
            System.out.println("i = " + i);
        }
        System.out.println("循环中断，i = " + i);
    }
}
