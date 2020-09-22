package Demo05;

public class ConsCodeBlock {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("===============");
        Person p2 = new Person("Zhang");
    }
}

class Person {
    private String name;
    private int x;

    //构造代码块
    {
        System.out.println("构造代码块执行......");
        x = 100; //对类的数据成员x进行初始化。
    }

    //构造方法的代码块
    Person() { //定义了一个无参的构造方法。
        System.out.println("构造方法执行......");
        name = "Guangzi"; //对name数据成员变量赋初值“Guangzi”
        show(); //调用了show()方法来输出name的值和x的值（x的初始值已经在构造代码块中初始化）。
    }

    //构造方法的代码块
    Person(String name) { //定义了一个有参构造方法。
        System.out.println("构造方法执行......");
        this.name = name;
        show();
    }

    void show() {
        System.out.println("Welcome!" + name);
        System.out.println("x = " + x);
    }


}