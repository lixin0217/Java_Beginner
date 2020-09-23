package Demo08;

/**
 * 【范例12-12】 通过super调用父类的属性和方法（SuperDemo2.Java）。
 */
class Person {
    //声明了一个名为Person的类，并声明了name和age两个属性、一个返回String类型的talk()方法，
    //以及一个无参构造方法Person()，父类的构造方法是个空方法体，它并没有实施初始化。

    String name;
    int age;

    public Person() {
    }

    public String talk() {
        return ("I'm " + this.name + ",I'm " + this.age + " years old.");
    }
}

class Student extends Person {//声明了一个名为Student的类，此类直接继承自Person类。
    String school;

    public Student(String name, int age, String school) {
        //通过“super.属性”的方式调用父类中的name和age属性，并分别赋值。
        super.name = name;
        super.age = age;
        //通过“super.方法名”的方式调用父类中的talk()方法，打印信息。
        System.out.println(super.talk());
        this.school = school;
    }
}

public class SuperDemo02 {
    public static void main(String[] args) {
        Student s = new Student("Alex", 23, "VIP School");
        System.out.println("I'm from " + s.school);
    }
}
