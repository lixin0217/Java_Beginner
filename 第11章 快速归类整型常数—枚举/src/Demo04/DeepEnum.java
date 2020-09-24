package Demo04;

/**
 * 【范例11-10】 定义枚举的构造方法 (DeepEnum.java）。
 */
enum NewColor {
    //定义了3个新创建的枚举类型NewColor的枚举值：“RED、GREEN、 BLUE”，
    // 实际上，这三个枚举值是NewColor枚举类的三个实例化对象。
    //注意：
    // ①枚举类定义的对象必须出现在该类有效代码的第1行，如果将第1行代码移至其他行之后，
    // 编译无法通过，因为编译器无法解析 “RED、GREEN、 BLUE”等对象。
    // ②一旦枚举类的构造方法定义之后，那么所有的枚举对象都必须显式调用此构造方法
    RED("RED", 4), GREEN("GREEN", 5), BLUE("BLUE", 6);

    //定义了枚举中的两个私有数据成员name和index。
    private String name;
    private int index;

    //在枚举中可直接定义方法。
    // 在本例中，对枚举类型NewColor定义了1个构造方法NewColor()和4个普通方法，
    // 分别是getName()和setName()、getIndex()和setIndex()。

    //定义了NewColor()这个私有化（private）的构造函数。这样就限制了外部是不能调用枚举的构造方法。
    private NewColor(String name, int index) {
        this.name = name;
        this.index = index;
    }

    //定义了一个普通的方法getName(int index)，通过枚举的索引获得其对应的名称。
    public static String getName(int index) {
        //通过一个for-each循环来来查询满足索引条件的枚举值。
        for (NewColor c : NewColor.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;//如果用户没有输入合法的整数索引，则返回null，这样就提供了程序的健壮性。
    }

    //getName()方法用来返回枚举对象的name值。
    public String getName() {
        return name;
    }

    //setIndex(int index, String name)方法，通过index来定位要修改name的枚举对象，
    // 然后将新的index赋给当前对象。
    public static void setName(int index, String name) {
        for (NewColor c : NewColor.values()) {
            if (c.getIndex() == index) {
                c.name = name;
                return;
            }
        }
    }

    //getIndex()方法用来返回枚举对象的index值。
    public int getIndex() {
        return index;
    }

    //定义了setIndex(int index, String name)方法，
    // 通过枚举对象的name定位枚举对象，然后修改其对应的index值。
    public static void setIndex(int index, String name) {
        for (NewColor c : NewColor.values()) {
            if (c.getName() == name) {
                c.index = index;
                return;
            }
        }
    }
}

public class DeepEnum {
    public static void main(String[] args) {
        System.out.println("----------输出枚举中的元素------------");
        //分别输出枚举对象“RED、GREEN、 BLUE”的各自的index和name。
        System.out.println(NewColor.RED.getIndex() + "---->" + NewColor.RED.getName());
        System.out.println(NewColor.GREEN.getIndex() + "---->" + NewColor.GREEN.getName());
        System.out.println(NewColor.BLUE.getIndex() + "---->" + NewColor.BLUE.getName());

        System.out.println("-------------在自定义编号和属性之后-----------------");
        //分别重新设置了指定枚举对象（通过index或name来确定）的name和index属性值。
        NewColor.setName(4, "BLACK");
        System.out.println("4---->" + NewColor.getName(4));
        NewColor.setIndex(7, "BLACK");
        System.out.println("7---->" + NewColor.getName(7));
    }
}
