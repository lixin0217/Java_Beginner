package Exercise;

/**
 * 13.5 实战练习
 * 1. 设计一个限制子类的访问的抽象类实例，要求在控制台输出如下结果。
 * 教师→姓名：刘三，年龄：50，职业：教师
 * 工人→姓名：赵四，年龄：30，职业：工人
 */

abstract class Person {
    //声明了一个名为Person的抽象类，在Person中声明了3个属性、一个构造函数和一个抽象方法——talk()。
    String name;
    int age;
    String occupation;

    public Person(String name, int age, String occupation) {//构造函数
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public abstract String talk();//抽象方法
}

class Teacher extends Person {
    //声明了一个Teacher类，此类继承自Person类，
    //因为此类不为抽象类，所以需要覆写Person类中的抽象方法——talk()。

    public Teacher(String name, int age, String occupation) {
        super(name, age, occupation);//明确调用抽象类中的构造方法。
    }

    public String talk() {//覆写Person类中的抽象方法——talk()。
        return "Teach--> Name: " + this.name + ", age: " + this.age + ",occupation: " + this.occupation;
    }
}

class Worker extends Person {
    //声明了一个Teacher类，此类继承自Person类，
    //因为此类不为抽象类，所以需要覆写Person类中的抽象方法——talk()。

    public Worker(String name, int age, String occupation) {
        super(name, age, occupation);//明确调用抽象类中的构造方法。
    }

    public String talk() {//覆写Person类中的抽象方法——talk()。
        return "Worker--> Name: " + this.name + ", age: " + this.age + ",occupation: " + this.occupation;
    }
}

public class Exercise13_1 {
    public static void main(String[] args) {
        //实例化Teacher类，建立对象t，并调用父类的构造方法初始化类属性。
        Teacher t = new Teacher("Alex", 23, "Teacher");
        System.out.println(t.talk());//调用类中被覆写的talk()方法。

        //实例化Worker类，建立对象w，并调用父类的构造方法初始化类属性。
        Worker w = new Worker("Bob", 32, "Worker");
        System.out.println(w.talk());//调用类中被覆写的talk()方法。
    }
}
