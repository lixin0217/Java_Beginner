package Demo10;

//【范例12-22】 实现向下转型（DownCastTest.java）。
class A {
    public void print() {
        System.out.println("******父类A：public void print(){}");
    }
}

class B extends A {
    public void print() {
        System.out.println("++++++++子类B：public void print(){}");
    }

    public void printB() {
        System.out.println("++++++++子类B扩充方法：public void print(){}");
    }
}

public class DownCastTest {
    public static void main(String[] args) {
        A a = new B();//将父类的对象a强制类型转换为子类对象b。
        a.print();

        B b = (B) a;//对象a前面的“(B)”，表明要把a强制转换成B类型。
        b.printB();//将转换后结果赋给一个子类B定义的引用b
    }
}
