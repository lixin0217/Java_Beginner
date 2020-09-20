/**
 * 【范例1-1】 编写Hello.java程序。
 * <p>
 * Java程序运行的流程可用如下来说明：
 * 所有的Java源代码（以.java为扩展名），通过Java编译器javac（javac命令中字母c来自于compiler的首字母）编译成字节码，
 * 也就是以.class为扩展名的文件。然后利用命令java将对应的字节码通过Java虚拟机（JVM）解释为特定操作系统（如Windows、Linux等）
 * 能理解的机器码，最终Java程序得以执行。
 **/

//public 是一个关键字，用于声明类的权限，表明这是一个公有类（class），其他任何类都可以直接访问它。
// class 也是Java的一个关键字，用于类的声明，其后紧跟的就是类名，这里的类名称是HelloWorld。

public class HelloWorld {
    //这一对大括号{}标明了类的区域，在这个区域内的所有内容都是类的一部分。
    public static void main(String[] args) {
        //这是一个main方法，它是整个Java程序的入口。
        // 所有的程序都是从public static void main(String args[])开始运行的，该行的代码格式是固定的。

        System.out.println("Hello World!");
        //System.out.println是Java内部的一条输出语句。引号内部的内容"HelloWorld !"会在控制台中打印出来。
    }
}
