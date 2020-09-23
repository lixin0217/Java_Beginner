package Demo07;

/**
 * 【范例12-8】 类的继承演示程序（InheritDemo.Java）。
 */
class Person {//定义了Person类
    String name;
    int age;

    public Person(String name, int age) {//Person类的构造方法
        this.name = name;
        this.age = age;
    }

    void speak() {
        System.out.println("My name is " + this.name + ",I'm " + this.age + " years' old.");
    }
}

class Student extends Person {//定义了Student类,并继承自Person类（使用了extends关键字）。
    String school;

    Student(String name, int age, String school) {//Student类的构造方法
        super(name, age);//使用super关键字加上对应的参数，就是调用父类的构造方法。
        this.school = school;
    }

    //由于Student类直接继承自Person类，Student类中“自动”拥有父类Person类中的方法speak()
    void study() {
        System.out.println("I'm studying at " + this.school + ".");
    }
}

public class LeadInheritDemo {
    public static void main(String[] args) {//实例Person类和Student类，并调用方法
        Student s = new Student("Ada", 23, "VIP school");
        s.speak();
        s.study();
    }
}
