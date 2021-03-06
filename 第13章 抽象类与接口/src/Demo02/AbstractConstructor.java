package Demo02;

//【范例13-2】 抽象类中构造方法的定义使用（代码AbstractConstructor. java）。
abstract class Person {
    //声明了一个名为Person的抽象类，在Person中声明了3个属性和一个抽象方法——talk()。
    String name;
    int age;
    String occupation;

    public Person(String name, int age, String occupation) {//定义构造函数
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public abstract String talk();//声明一个抽象方法
}

class Student extends Person {

    //声明了一个Student类，此类继承自Person类，
    //因为此类不为抽象类，所以需要覆写Person类中的抽象方法——talk()。
    public Student(String name, int age, String occupation) {
        //这里必须明确调用抽象类中的构造方法
        super(name, age, occupation);
    }

    public String talk() {//覆写抽象方法talk()
        return "学生--》姓名：" + this.name + "；年龄：" + this.age + "；职业：" + this.occupation;
    }
}

class Worker extends Person {

    //声明了一个Worker类，此类继承自Person类，
    //因为此类不为抽象类，所以需要覆写Person类中的抽象方法——talk()。
    public Worker(String name, int age, String occupation) {
        //这里必须明确调用抽象类中的构造方法
        super(name, age, occupation);
    }

    public String talk() {//覆写抽象方法talk()
        return "工人--》姓名：" + this.name + "；年龄：" + this.age + "；职业：" + this.occupation;
    }
}

public class AbstractConstructor {
    public static void main(String[] args) {
        //实例化Student类与Worker类对象，并调用各自的构造方法初始化类属性。
        Student s = new Student("张三", 20, "学生");
        Worker w = new Worker("李四", 30, "工人");
        //分别调用各自类中被覆写的talk()方法。
        System.out.println(s.talk());
        System.out.println(w.talk());
    }
}
