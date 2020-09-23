package Demo11;

/**
 * 1. 建立一个人类（Person）和学生类（Student），功能要求如下。
 * ⑴ Person中包含4个数据成员name、addr、sex和age，分别表示姓名、地址、类别和年龄。
 * 设计一个输出方法talk()来显示这4种属性。
 * ⑵ Student类继承Person类，并增加成员Math、English存放数学与英语成绩。
 * 用一个6参构造方法、一个两参构造方法、一个无参构造方法和覆写输出方法talk()用于显示6种属性。
 * 对于构造方法参数个数不足以初始化4个数据成员时，在构造方法中采用自己指定默认值来实施初始化。
 */

class Person {//建立一个人类（Person）
    //Person中包含4个数据成员name、addr、sex和age，分别表示姓名、地址、类别和年龄。
    String name;
    String addr;
    String sex;
    int age;

    //设计一个输出方法talk()来显示这4种属性。
    public void talk() {
        System.out.println("I'm " + name + ", I live at " + addr + ",my sex is " + sex);
    }
}

class Student extends Person {//建立一个学生类（Student）继承Person类
    //增加成员Math、English存放数学与英语成绩
    int Math;
    int English;

    //用一个6参构造方法、一个两参构造方法、一个无参构造方法和覆写输出方法talk()用于显示6种属性。
    //对于构造方法参数个数不足以初始化4个数据成员时，在构造方法中采用自己指定默认值来实施初始化。

    //6参构造方法和覆写输出方法talk()用于显示6种属性.
    public Student(String name, String addr, String sex, int age,
                   int math, int english) {
        super.name = name;
        super.addr = addr;
        super.sex = addr;
        super.age = age;
        Math = math;
        English = english;
    }

    //2参构造方法和覆写输出方法talk()用于显示6种属性.
    //对于构造方法参数个数不足以初始化4个数据成员时，在构造方法中采用自己指定默认值来实施初始化。
    public Student(int math, int english) {
        super.name = "帅哥";
        super.addr = "豪宅";
        super.sex = "帅哥";
        super.age = 88;
        Math = math;
        English = english;
    }

    //无参构造方法和覆写输出方法talk()用于显示6种属性.
    //对于构造方法参数个数不足以初始化4个数据成员时，在构造方法中采用自己指定默认值来实施初始化。
    public Student() {
        super.name = "帅哥";
        super.addr = "豪宅";
        super.sex = "帅哥";
        super.age = 88;
        Math = 100;
        English = 100;
    }

    public void talk() {
        super.talk();
        System.out.println("Math score is: " + Math + "; English score is: " + English);
    }
}

public class Exercise12_1 {
    public static void main(String[] args) {
        Student s0 = new Student(); //无参数的实例s0
        System.out.println("这是无参数构造的6个属性");
        s0.talk();
        System.out.println();
        Student s2 = new Student(133, 111);//2参数的实例s2
        System.out.println("这是2个参数构造的6个属性");
        s2.talk();
        System.out.println();
        Student s6 = new Student("Alex", "Mars", "Male", 888, 100, 100);
        System.out.println("这是6个参数构造的6个属性");
        s6.talk();
    }
}
