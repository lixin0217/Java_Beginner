package Demo04;

//【范例14-6】 使用Object接收数组（ObjectArray05.java）。
public class ObjectArray05 {
    public static void main(String[] args) {
        int[] temp = {1, 3, 5, 7, 9};//定义了一个数组temp，并给数组赋值。
        Object obj = temp;//使用Object接收数组。
        print(obj);//调用print方法打印输出数组元素
    }

    public static void print(Object o) {//定义一个方法循环输出obj中的数字。
        if (o instanceof int[]) {//判断是否是整型数组
            int[] x = (int[]) o;
            for (int i = 0; i < x.length; i++) {
                System.out.print(x[i] + "\t");
            }
        }
    }
}
