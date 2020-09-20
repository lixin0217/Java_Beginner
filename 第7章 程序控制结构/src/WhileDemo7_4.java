/**
 * 【范例7-4】 while循环的使用（whileDemo7 4.java）。
 */
public class WhileDemo7_4 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i < 11) {
            sum += i;
            ++i;
        }
        System.out.println("Sum = " + sum);
    }
}
