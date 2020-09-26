package Demo03;

/**
 * 【范例14-3】 没有覆写Object类中的equals方法（ObjectDemo03.java）。
 * 从程序中可以看到，两个对象的内容完全相等，但为什么比较的结果是不相等呢？
 * 这是因为p1与p2的内容分别在不同的内存空间指向了不同的内存地址。
 * 在用equals对两个对象进行比较时，实际上是比较两个对象的地址。
 */
class Person {//声明了一个Person类，并声明一个构造方法为类的属性初始化。
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ObjectDemo03 {
    public static void main(String[] args) {
        //声明了两个Person对象p1、p2，其内容相等。
        Person p1 = new Person("Alex", 25);
        Person p2 = new Person("Alex", 25);

        //判断P1和P2的内容是否相等
        System.out.println(p1.equals(p2) ? "P1和P2是同一个人" : "P1和P2不是同一个人");
    }
}
