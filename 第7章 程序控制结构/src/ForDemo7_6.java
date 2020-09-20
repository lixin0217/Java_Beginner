/**
 * 【范例7-7】 for循环嵌套的使用（forDemo7 6 2.java）。
 * 下面以打印九九乘法表为例，练习嵌套循环的用法。
 */
public class ForDemo7_6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " * " + j + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }
}
