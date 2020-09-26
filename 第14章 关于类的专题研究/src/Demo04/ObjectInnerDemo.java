package Demo04;

//【范例14-8】 内部类的使用（ObjectInnerDemo.java）。
class Outer {
    int score;

    void inst() {//声明了一个inst()方法，用于实例化内部类的对象in
        Inner in = new Inner();
        in.display();
    }

    public class Inner {
        //在Outer类的内部声明了一个Inner类，此类中有一个display()方法，用于打印外部类中的score属性。
        String name;

        void display() {//打印外部类中的score属性
            System.out.println("Score = " + score);
        }
    }
}

public class ObjectInnerDemo {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.inst();
    }
}
