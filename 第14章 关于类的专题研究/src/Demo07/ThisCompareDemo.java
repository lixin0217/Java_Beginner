package Demo07;

//【范例14-16】 利用This判断两个对象是否相等（ThisCompareDemo.java）。
class Person {//声明了一个名为Person的类，里面有一个构造方法和一个比较方法。
    String name;
    int age;

    public Person(String name, int age) {//构造方法
        this.name = name;
        this.age = age;
    }

    boolean compare(Person p) {//比较方法
        if (this.name.equals(p.name) && this.age == p.age) {
            return true;
        } else {
            return false;
        }
    }
}

public class ThisCompareDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Alex", 25);
        Person p2 = new Person("Alex", 25);

        //由p1调用compare()方法，将p2传入到compare方法之中，所以this.name就代表p1.name，
        //this.age就代表p1.age，而传入的参数p2则被用compare()方法中的参数p表示。
        System.out.println(p1.compare(p2) ? "相等，是同一个人" : "不相等，不是同一个人");
    }
}
