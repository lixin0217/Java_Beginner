/**
 * 4.4 实战练习
 * 1. 编写一个程序，定义局部变量sum，并求出1+2+3+…+99+100之和，赋值给sum，并输出sum的值。
 * 2. 纠正下面代码的错误，并给出正确的输出结果。
 * 3. 动手试一试，下面的代码中在编译时哪一行会出错？（Java面试题）
 */
public class Exam4_2 {
    static int x = 10;

    public static void main(String[] args) {
        int outer = 1;
        int inner = 3;
        {
//            int inner = 2;
            int x = 100;
            System.out.println("outer = " + outer);
            System.out.println("inner = " + inner);
            System.out.println("In class level, x = " + x);
        }
        System.out.println("inner = " + inner);
        System.out.println("outer = " + outer);
        System.out.println("In class level, x = " + x);
    }
}
