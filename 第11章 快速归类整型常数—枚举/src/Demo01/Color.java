/**
 * 【范例11-1】 在未出现枚举关键字前如何使用枚举功能(Color.java)。
 */
package Demo01;

public class Color {

    private String name;
    //使用publicstatic final这三个关键字来作为所创建对象的修饰符，
    // 表明这三个对象是“公有的、静态的、不可更改的”常量对象。
    public static final Color RED = new Color("红色");
    public static final Color GREEN = new Color("绿色");
    public static final Color BLUE = new Color("蓝色");

    //为了区分setName()方法中形参name和类中的同名数据成员name，
    // 用this对象引用来表明赋值运算符（=）左侧的name是来自类中。
    public Color(String name) {
        //对Color类中构造方法的声明，其内部通过调用setName()方法，对新对象取值进行初始化赋值。
        setName(name);
    }

    public void setName(String name) {//使用setName()方法对类中的私有属性成员name进行赋值。
        this.name = name;
    }

    public String getName() { //使用getName()方法来获得私有属性成员name。
        return name;
    }

    //设置静态方法getInstance()。
    //通过此方法，可以通过设置不同的数值（如0，1, 2），调用得到相应的颜色（如“红色”、“绿色”和“蓝色”）
    public static Color getInstance(int i) {
        if (i == 0) {
            return RED;
        }
        if (i == 1) {
            return GREEN;
        }
        if (i == 2) {
            return BLUE;
        }
        //如果用户输入的值在0-2之外的值，那么就会返回一个空引用（null），
        // 这本质上是一个容错性的语句，提供程序的健壮性。
        return null;
    }

    public static void main(String[] args) {
        Color c1 = Color.getInstance(0);
        System.out.println(c1.getName());

        Color c2 = Color.getInstance(1);
        System.out.println(c2.getName());

        Color c3 = Color.getInstance(2);
        System.out.println(c3.getName());
    }
}
