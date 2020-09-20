/**
 * 【范例5-14】 自动转换和强制转换的使用方法（AutoConvert.java）。
 */
public class AutoConvert {
    public static void main(String[] args) {
        int a = 55;
        int b = 9;
        float g, h;
        System.out.println("a = " + a + ", b = " + b);
        g = a / b;
        System.out.println("a / b =" + g + "\n");
        System.out.println("a = " + a + ", b = " + b);
        h = (float) a / b;
        System.out.println("a / b =" + h);
    }
}
