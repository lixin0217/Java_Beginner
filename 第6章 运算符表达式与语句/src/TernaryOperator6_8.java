/**
 * 【范例6-8】 三元运算符的使用（TernaryOperator6 8.java）。
 * result = x > y ? x : y表示的含义是:如果x的内容大于y，则将x的内容赋值给result,否则将y的值赋值给result。
 */
public class TernaryOperator6_8 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        int result = x > y ? x : y; //能够用Math.max(x,y)来代替实现同样的功能
        System.out.println("1st result = " + result);

        x = 50;
        result = x > y ? x : y;
        System.out.println("2nd result = " + result);
    }
}
