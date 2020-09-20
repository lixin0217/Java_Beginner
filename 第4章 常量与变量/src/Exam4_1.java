/**
 * 4.4 实战练习
 * 1. 编写一个程序，定义局部变量sum，并求出1+2+3+…+99+100之和，赋值给sum，并输出sum的值。
 * 2. 纠正下面代码的错误，并给出正确的输出结果。
 * 3. 动手试一试，下面的代码中在编译时哪一行会出错？（Java面试题）
 */
public class Exam4_1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            sum += i;
        }
        System.out.println("1 + 2 + 3 + ... +99 + 100 = " + sum);
    }
}
