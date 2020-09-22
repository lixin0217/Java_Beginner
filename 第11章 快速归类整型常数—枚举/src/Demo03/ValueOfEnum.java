package Demo03;

/**
 * 【范例11-4】 通过values()方法得到对象取值（ValueOfEnum.java）。
 */
enum MyColor {RED, GREEN, BLUE} //声明了一个enum类型的对象MyColor。

public class ValueOfEnum {
    public static void main(String[] args) {

        //声明一个enum类型的数组allColor,通过values()方法来获得MyColor的各个枚举值“红色, 绿色, 蓝色”。
        MyColor[] allColor = MyColor.values();

        //使用for-each循环语句中将数组allColor值依次输出。
        for (MyColor aColor : allColor) {
            System.out.println(aColor);
        }
    }
}
