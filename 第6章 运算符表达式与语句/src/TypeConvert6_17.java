/**
 * 【范例6-17】 表达式类型的自动转换（TypeConvert6 17.java）。
 */
public class TypeConvert6_17 {
    public static void main(String[] args) {
        char ch = 'a';
        short a = -2;
        int b = 3;
        float c = 5.3f;
        double d = 6.28;

        System.out.print("(ch / a) - (c / d) - (a + b) = ");
        System.out.println((ch / a) - (c / d) - (a + b));
    }
}

