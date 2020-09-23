package Demo10;

//【范例12-19】 方法多态性的使用（FuncPoly.Java）。
//同一个方法（方法名是相同的）能够接受不同的参数，并完成多个不同类型的运算，因此体现了方法的多态性。
public class FuncPoly {
    private void sum(int i) {
        System.out.println("计算1个整数的和为：" + i);
    }

    private void sum(int i, int j) {
        System.out.println("计算2个整数的和为：" + (i + j));
    }

    private void sum(int i, int j, int k) {
        System.out.println("计算3个整数的和为：" + (i + j + k));
    }

    public static void main(String[] args) {
        FuncPoly demo = new FuncPoly();
        demo.sum(2, 3);
        demo.sum(4, 5, 99);
        demo.sum(1);
    }
}
