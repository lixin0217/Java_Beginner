/**
 * 【范例6-12】 程序的简洁写法2（SimpleWriting6 11 2.java）。
 * 下面举一个实例来说明这些简洁的表达式在程序中该如何应用。以SimpleWriting6_11_2为例，输入两个数，经过运算之后，来看看这两个变量所存放的值有什么变化。
 */
public class SimpleWriting6_11_2 {
    public static void main(String[] args) {
        int a = 10, b = 8;

        System.out.println("改变之前的数是：a = " + a + ",b = " + b);
        a -= b++; // 先计算a-b的值，赋值给a之后，再将b值加1
        System.out.println("改变之后的数是：a = " + a + ",b = " + b);
    }
}
