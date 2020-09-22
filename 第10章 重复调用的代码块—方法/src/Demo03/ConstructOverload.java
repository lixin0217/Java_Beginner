/**
 * 从本程序可以发现，构造方法的基本功能就是对类中的属性初始化，在程序产生类的实例对象时，将需要的参数由构造方法传入，
 * 之后再由构造方法为其内部的属性进行初始化，这是在一般开发中经常使用的技巧。
 * 但是有一个问题是需要读者注意，就是无参构造方法的使用
 */
        package Demo03;

public class ConstructOverload {
    public static void main(String[] args) {
        Person p1 = new Person(25);
        Person p2 = new Person("Alex", 30);
        Person p3 = new Person();
        p1.talk();
        p2.talk();
        p3.talk();
    }
}
