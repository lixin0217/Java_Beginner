/**
 * 【范例5-3】 int类型数据的使用（intdemo.java）。
 * 由于每一种类型毕竟都有其对应范围的最大或最小值，那么如果说在计算的过程之中，超过了此范围（大于最大值或小于最小值），
 * 那么就会产生数据的溢出问题。请参见如下的范例，整型数据的溢出
 */
public class IntDemo2 {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("Integer.MAX_VALUE = " + max);
        System.out.println("Integer.MIN_VALUE = " + min);
        System.out.println("MAX + 1 = " + (max + 1));
        System.out.println("MAX + 2 = " + (max + 2));
        System.out.println("MIN - 1 = " + (min - 1));
    }
}
