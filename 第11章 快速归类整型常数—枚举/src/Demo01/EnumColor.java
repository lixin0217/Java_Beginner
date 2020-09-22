package Demo01;

/**
 * 【范例11-2】 在Java中使用枚举（EnumColor.java）。
 */
enum MyColor {RED, GREEN, BLUE}
//定义Enum数据类型MyColor，其中设置的枚举值表分别为“红色、绿色、蓝色”

public class EnumColor {
    public static void main(String[] args) {
        MyColor c1 = MyColor.RED; //定义了枚举变量c1,通过“枚举名.枚举值”的方法获得枚举值。
        System.out.println(c1); //打印输出获得的枚举值。

        MyColor c2 = MyColor.GREEN;//定义了枚举变量c2,通过“枚举名.枚举值”的方法获得枚举值。
        System.out.println(c2);//打印输出获得的枚举值。

        MyColor c3 = MyColor.BLUE;//定义了枚举变量c3,通过“枚举名.枚举值”的方法获得枚举值。
        System.out.println(c3);//打印输出获得的枚举值。
    }
}
