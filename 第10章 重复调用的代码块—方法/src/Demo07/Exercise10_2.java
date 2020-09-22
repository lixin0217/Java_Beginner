/**
 * 2. 编程实现，要求程序输出某两个整数之间的随机数。
 * 提示：输出随机数需要用到Math.random()方法。
 * 1)成员变量：两个随机整数；
 * 2)方法：返回两个随机整数之间的随机整数
 * 步骤一：取得随机数 rand=*min+(max-min)*Math.random();
 * 步骤二：强制类型转换 intrand = (int)rand;
 * 步骤三：通过打印输出经过转换后的随机整数
 */
package Demo07;

public class Exercise10_2 {
    public static void ReturnIntRandom(int num1, int num2) { //随机取整数的方法定义
        double rand = (num2 - num1) * Math.random() + num1; //取得一个随机数
        int intrand = (int) rand; //强制类型转换
        System.out.println("介于" + num1 + "和" + num2 + "之间的一个随机整数为：" + intrand); //打印输出随机整数
    }

    public static void main(String[] args) {
        int num1 = -333;
        int num2 = 83;
        ReturnIntRandom(num1, num2);
    }
}
