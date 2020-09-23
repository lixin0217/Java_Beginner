package Demo09;

/**
 * 【范例12-14】 子类访问父类的私有成员（RestrictVisit2.Java）。
 */
class Person {//定义了Person类
    private String name;
    private int age;

    public Person(String name, int age) {//定义了构造方法Person()
        this.name = name;
        this.age = age;
    }

    void setVar(String name, int age) {//定义了设置属性值的方法setVar()
        this.name = name;
        this.age = age;
    }

    void print() {
        System.out.println("I'm " + name + ",I'm " + age + " years old.");
    }
}

class Student extends Person {//定义了Student类，该类继承自Person类
    //父类Person中被private修饰的属性成员name和age（03～04行），在子类中不能被直接访问。
    public Student(String name, int age) {
        //在Student类的构造方法中，使用“super(name,age)”调用父类的构造方法
        super(name, age);
    }

/*    void test() {//定义一个test方法,尝试访问父类的私有成员——这违背了类的封装思想，故此无法通过编译，
        //java: name 在 Demo09.Person 中是 private 访问控制
        //java: age 在 Demo09.Person 中是 private 访问控制
        System.out.println("I'm " + name + ",I'm " + age + " years old.");
    }*/
}

public class RestrictVisit {
    public static void main(String[] args) {
        Student s = new Student("Bill Gates", 35);
        s.print();
        s.setVar("Amazon", 23);
        s.print();
//        s.test();
    }
}
