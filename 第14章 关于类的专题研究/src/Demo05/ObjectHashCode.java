package Demo05;

//【范例14-5】 比较两个对象的hashCode（ObjectHashCode.java）。
class Person {//声明一个Person类并覆写了equals方法和hashCode方法。
    int id; //编号
    String name;//姓名

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //在覆写equals()方法的时候也必须覆写hashCode()方法。
    // 这样才能确保相等的两个对象拥有相等的.hashCode。
    @Override
    public boolean equals(Object o) {//覆写equals方法
        Person p = (Person) o;
        return (this.id == p.id) && (this.name.equals(p.name));
    }

    @Override
    public int hashCode() {//覆写hashcode方法
        return id * (name.hashCode());
    }
}

public class ObjectHashCode {
    public static void main(String[] args) {
        //实例化三个对象p1、p2、p3
        Person p1 = new Person(1, "Alex");
        Person p2 = new Person(1, "Alex");
        Person p3 = new Person(2, "Alex");

        //分别输出p1与p2、p3的比较结果
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
    }
}
