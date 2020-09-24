package Demo02;

/**
 * 【范例11-6】 调用Enum类中的valueof()方法（Demo02.ValueOfEnum2.java）。
 */

enum Color {RED,GREEN,BLUE};
public class ValueOfEnum2 {
    public static void main(String[] args) {
        //定义Color枚举类型对象a,Color枚举类型调用在Enum类中方法valueof()，
        // 这是一个静态方法，用于返回指定枚举类中指定名称的枚举值。
        //方法valueof()的第一个参数“Demo02.Color.class”，用来返回Color的类型——枚举类型，
        // 第二个参数是字符串常量“红色”。
        Color a = Color.valueOf(Color.class, "RED");
        System.out.println(a);
    }
}
