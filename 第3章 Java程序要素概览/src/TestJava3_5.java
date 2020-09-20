/**
 * 【范例3-5】 程序语义错误的检测（TestJava3 5.java）。
 */

public class TestJava3_5 {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        System.out.println("I have " + num1 + " books.");
        System.out.println("You have " + num2 + " books.");

        //打印输出num1-num2的值，本意是求和但用错公式了。
//        System.out.println("We have " + (num1 - num2) + " books.");
        System.out.println("We have " + (num1 + num2) + " books.");
    }
}
