package Demo02;

public class MethodOverload {
    public int add(int a, int b) { // add two int
        return a + b;
    }

    public float add(float a, float b) {//add two float
        return a + b;
    }

    public int add(int a, int b, int c) {//add three int
        return a + b + c;
    }

    public static void main(String[] args) {
        int result;
        float result_f;
        MethodOverload test = new MethodOverload();

        result = test.add(1, 2);
        System.out.println("add计算1+2的值是" + result);

        result_f = test.add(1.3f, 2.4f);
        System.out.println("add计算1.3+2.4的值是" + result_f);

        result = test.add(1, 2, 3);
        System.out.println("add计算1+2+3的值是" + result);

    }
}
