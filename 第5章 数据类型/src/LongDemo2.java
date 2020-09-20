/**
 * 【范例5-5】 使用long类型解决int类型溢出问题（LongDemo.java）。
 * 为了不丢失数据的精度，低字节类型数据与高字节数据运算，其结果自动转变为高字节数据，
 * 因此，int型与long型运算的结果是 long型数据。
 */
public class LongDemo2 {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("Integer.MAX_VALUE = " + max);
        System.out.println("Integer.MIN_VALUE = " + min);
        System.out.println("MAX + 1 = " + (max + (long)1));
        System.out.println("MAX + 2 = " + (max + 2L));
        System.out.println("MIN - 1 = " + (min - 1l));
    }
}
