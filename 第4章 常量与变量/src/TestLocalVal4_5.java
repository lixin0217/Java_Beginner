/**
 * 【范例4-5】 变量的综合应用（TestLocalVar4 5.java）。
 */
public class TestLocalVal4_5 {
    public static void main(String[] args) {
        int outer = 1;
        {
            int inner = 2;
            System.out.println("inner = " + inner);
            System.out.println("outer = " + outer);
        }
//        System.out.println("inner = " + inner);
        int inner = 3;
        System.out.println("inner = " + inner);
        System.out.println("outer = " + outer);
        System.out.println("In class level, x=" + x);
    }

    static int x = 3;
}
