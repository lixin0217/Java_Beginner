/**
 * 【范例5-11】 单个英文字符与ASCII(整型值)的转换（CharToInt.java）。
 */

public class CharToInt {
    public static void main(String[] args) {
        char ch = 'A'; // A
        int x = ch; // A 对应的数字为65

        //打印26个大写字母
        for (int i = 1; i < 27; i++) {
            System.out.println((char)x);
            x++;
        }
    }
}
