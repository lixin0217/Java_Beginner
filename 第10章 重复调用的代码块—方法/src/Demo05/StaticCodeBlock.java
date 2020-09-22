package Demo05;

public class StaticCodeBlock {
    //静态代码块，用static标识，用左右花括号“{}”括起来的区域就是一个静态代码块。
    static {
        System.out.println("静态代码块执行……");
    }

    //构造方法，一个无参的构造方法，方法的名称与类同名，均为StaticCodeBlock。
    public StaticCodeBlock() {
        System.out.println("构造方法执行……");
    }

    //构造代码块，没有任何标识，用左右花括号“{}”括起来的区域就是前面讲到的构造代码块。
    {
        System.out.println("构造代码块执行……");
    }

    public static void main(String[] args) {
        System.out.println("main方法开始执行……");

        //使用new关键字，分别创建了三个无名对象（分别在第22、24、26行）。据此来验证静态代码块执行多少次。
        System.out.println("创建第1个对象……");
        new StaticCodeBlock();
        System.out.println("创建第2个对象……");
        new StaticCodeBlock();
        System.out.println("创建第3个对象……");
        new StaticCodeBlock();
    }
}
