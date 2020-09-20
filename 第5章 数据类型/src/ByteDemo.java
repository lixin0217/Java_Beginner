/**
 * 【范例5-1】 byte类型数据的使用（代码bytedemo.java）。
 */
public class ByteDemo {
    public static void main(String[] args) {
        byte byte_max = Byte.MAX_VALUE;
        byte byte_min = Byte.MIN_VALUE;
        byte byte_size = Byte.SIZE;
        String byte_type = String.valueOf(Byte.TYPE);
        System.out.println("Byte.MAX_VALUE = " + byte_max);
        System.out.println("Byte.MIN_VALUE = " + byte_min);
        System.out.println("Byte.SIZE = " + byte_size);
        System.out.println("Byte.TYPE = " + byte_type);
    }
}
