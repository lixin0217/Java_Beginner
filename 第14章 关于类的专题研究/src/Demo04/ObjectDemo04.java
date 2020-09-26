package Demo04;

import java.util.Objects;

/**
 * 【范例14-4】 equals方法的覆写（ObjectDemo04.java）。
 */
class Person {//声明了一个Person类，并声明一个构造方法为类的属性初始化。
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override //覆写父类（Object类）的equals方法，IDE自动补全该方法
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }
}

public class ObjectDemo04 {
    public static void main(String[] args) {
        //声明了两个Person对象p1、p2，其内容相等。
        Person p1 = new Person("Alex", 25);
        Person p2 = new Person("Alex", 25);

        //判断P1和P2的内容是否相等
        System.out.println(p1.equals(p2) ? "P1和P2是同一个人" : "P1和P2不是同一个人");
    }
}
