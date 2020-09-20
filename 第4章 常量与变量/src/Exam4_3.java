/**
 * 4.4 实战练习
 * 1. 编写一个程序，定义局部变量sum，并求出1+2+3+…+99+100之和，赋值给sum，并输出sum的值。
 * 2. 纠正下面代码的错误，并给出正确的输出结果。
 * 3. 动手试一试，下面的代码中在编译时哪一行会出错？（Java面试题）
 */
public class Exam4_3 {
    static void TestDemo() {
        int i, j, n;
        i = 100;
        j = i;
        n = 0;
        while (i > 0) {
            System.out.println("The value is " + j); //variable j might not have been initialized
            n += 1; // variable n might not have been initialized
            i--;
            j = i;
        }
    }

    public static void main(String[] args) {
        TestDemo(); //调用静态方法TestDemo（）
    }
}
