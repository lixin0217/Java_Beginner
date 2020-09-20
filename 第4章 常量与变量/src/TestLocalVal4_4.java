/**
 * 【范例4-4】 局部变量的使用（TestLocalVar4 4.java）。
 */
public class TestLocalVal4_4 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
        }
    }
}
