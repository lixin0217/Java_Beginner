import org.w3c.dom.ls.LSOutput;

/**
 * Java中类与方法中变量作用域可以嵌套
 * 在Java中，类与方法之间作用域是可以嵌套的，可以把整个类看做一个大的作用域，
 * 它定义的字段(或称数据成员)可被方法中的同名字段所屏蔽，其行为类似于上表左侧所示的C/C++的作用域嵌套。
 */
public class TestVarScope4_6 {
    static int x = 10;

    public static void main(String[] args) {
        int x = 20;
        System.out.println("x = " + x);
    }
}
