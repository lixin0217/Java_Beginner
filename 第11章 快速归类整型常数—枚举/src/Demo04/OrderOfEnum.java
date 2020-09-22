package Demo04;

/**
 * 【范例11-5】 通过调用Enum类中的ordinal()方法，输出枚举类型中每一个对象的编号（OrderOfEnum.java）。
 */
enum MyColor {RED, GREEN, BLUE} //声明了一个enum类型的对象MyColor。

public class OrderOfEnum {
    public static void main(String[] args) {

        //声明一个enum类型的数组allColor,通过values()方法来获得MyColor的各个枚举值“红色, 绿色, 蓝色”。
        MyColor[] allColor = MyColor.values();

        for (MyColor aColor : allColor) {
            //下面引入了在Enum类中包含的两种方法：name()和ordinal()，分别获得不同对象的名称及编号。
            System.out.println(aColor.name() + "-->" + aColor.ordinal());
        }
    }
}
