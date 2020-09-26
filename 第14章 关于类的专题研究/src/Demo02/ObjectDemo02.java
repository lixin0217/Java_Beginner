package Demo02;

/**
 * 【范例14-1】 Object类的使用（ObjectDemo01.java）。
 * 直接输出对象，与调用toString()方法后再输出其内容完全一样，就可以得出一个结论。
 * 对象输出时，会默认调用Object类的toString()方法，将对象信息变为字符串返回。
 */
class Person extends Object {
    //声明了一个名为Person的类，并明确指出其继承自Object类。
    String name = "Alex";
    int age = 34;

    public String toString() {//覆写object类的toString方法
        return "I'm " + this.name + ",I'm " + this.age + " years old.";
    }
}

public class ObjectDemo02 {
    public static void main(String[] args) {
        Person p = new Person();//声明并实例化了一个Person类的对象p
        System.out.println(p);//调用。
        System.out.println(p.toString());//打印对象，默认为对象地址
    }
}
