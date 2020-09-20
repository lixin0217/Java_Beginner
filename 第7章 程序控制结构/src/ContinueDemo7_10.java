/**
 * \
 * 【范例7-10】 continue语句的使用（continueDemo7 10.java）。
 */
public class ContinueDemo7_10 {
    public static void main(String[] args) {
        int i = 0;
        for (i = 1; i < 10; i++) {
            if (i % 3 == 0)
                continue;
            System.out.println("i = " + i);
        }
        System.out.println("循环中断，i = " + i);
    }
}
