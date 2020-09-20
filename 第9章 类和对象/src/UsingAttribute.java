/**
 * 【范例9-3】 类的属性组使用（usingAttribute.java）。
 * Java类属性和对象属性的初始化顺序如下。
 * ⑴ 类属性 (静态变量) 定义时的初始化，如范例中的 static String a = "string-a"。
 * ⑵ static 块中的初始化代码，如范例中的 static {} 中的 b = "string-b"。
 * ⑶ 对象属性 (非静态变量) 定义时的初始化，如范例中的 String c = "string-c"。
 * ⑷ 构造方法 (函数) 中的初始化代码，如范例构造方法中的 d = "string-d"。
 */
public class UsingAttribute {
    //定义两个String类型的属性a和b，由于它们是静态的，所以它们是属于类的，
    //也就是属于所有这个类定义的对象共有的，所有对象看到的静态属性值是相同的。
    static String a = "string-a";
    static String b;

    //定义两个String类型的属性c和d，由于它们是非静态的，所以它们是属于这个类所定义的对象私有的，
    //每个对象都有这个属性，且它们各自的属性值可不同。
    String c = "string-c";
    String d;

    static { //定义了静态方法块，它没有名称。用来初始化静态成员变量。
        printStatic("before static");
        b = "string-b"; //静态变量b被初始化为"string-b"。
        printStatic("after static");
    }

    public static void printStatic(String title) {
        System.out.println("==========" + title + "=============");
        System.out.println("a=\"" + a + "\"");
        System.out.println("b=\"" + b + "\"");
    }

    public UsingAttribute() {//定义了一个构造方法usingAttribute ()，在这个方法中，
        // 使用了类中的各个属性。构造方法与类同名，且无返回值（包括void），它的主要目的是创建对象。
        print("before constructor");
        d = "string-d";
        print("after constructor");
    }

    public void print(String title) {//定义了公有方法print()，用于打印所有属性值，包括静态成员值。
        System.out.println("==========" + title + "=============");
        System.out.println("a=\"" + a + "\"");
        System.out.println("b=\"" + b + "\"");
        System.out.println("c=\"" + c + "\"");
        System.out.println("d=\"" + d + "\"");
    }

    public static void main(String[] args) { //定义了常见的主方法main()，在这个方法中，
        // 使用关键字new和构造方法usingAttribute ()来创建一个匿名对象。
        System.out.println();
        System.out.println("--------------Creat UsingAttribute-------------");
        System.out.println();
        new UsingAttribute();
    }
}
