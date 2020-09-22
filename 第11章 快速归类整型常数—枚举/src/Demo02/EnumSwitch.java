package Demo02;

/**
 * 【范例11-3】 在switch中使用枚举（EnumSwitch.java）。
 */
enum MyColor {RED, GREEN, BLUE}
//定义Enum数据类型MyColor，其中设置的枚举值表分别为“红色、绿色、蓝色”

public class EnumSwitch {
    public static void main(String[] args) {

        MyColor c1 = MyColor.RED; //定义了枚举变量c1,并进行赋值。
        switch (c1) { //用switch方式来比较枚举对象
            case RED: {
                System.out.println("I'm RED.");
                break;
            }
            case GREEN: {
                System.out.println("I'm GREEN.");
                break;
            }
            case BLUE: {
                System.out.println("I'm BLUE.");
                break;
            }
        }
    }
}
