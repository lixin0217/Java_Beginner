package Demo03;

//【范例13-5】 带default方法接口的实现（代码Interfacedefault.java）。
interface InterfaceA {
    //定义一个接口，其中定义全局变量INFO，抽象方法print()，默认方法otherprint()。
    public static String INFO = "STATIC FINAL";//全局变量

    public void print();//抽象方法

    default public void otherprint() {//带方法体的默认方法
        System.out.println("Print default method InterfaceA");
    }
}

class InterfaceAB implements InterfaceA {
    //子类InterfaceAB实现接口InterfaceA，定义抽象方法print()。

    public void print() {//覆写过的方法
        System.out.println("Print abstract method InterfaceA");
        System.out.println(INFO);
    }
}

public class InterfaceDefault {
    public static void main(String[] args) {
        //实例化子类对象，并调用覆写过的抽象方法和默认方法，输出接口中的常量。
        InterfaceAB ab = new InterfaceAB();//实例化子类对象
        ab.print();//调用覆写过的方法
        ab.otherprint();//调用接口中的默认方法
        System.out.println(InterfaceA.INFO);//输出接口中的常量
    }
}
