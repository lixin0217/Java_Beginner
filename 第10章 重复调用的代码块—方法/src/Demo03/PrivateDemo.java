package Demo03;

public class PrivateDemo {
    private PrivateDemo() {
        //由于PrivateDemo类的构造方法PrivateDemo()被声明为private（私有访问），
        // 则该构造方法在外类是不可访问的，或者说它在其他类中是不可见的。
    }

    private void print() {
        System.out.println("Hello Java!");
    }
}

class PrivateCallDemo { //java: 类 PrivateCallDemo 是公共的, 应在名为 PrivateCallDemo.java 的文件中声明
    public static void main(String[] args) {
        PrivateDemo demo = null;

//        demo = new PrivateDemo();
        //java: PrivateDemo() 在 Demo03.PrivateDemo 中是 private 访问控制

//        demo.print();
        //java: print() 在 Demo03.PrivateDemo 中是 private 访问控制
    }
}
