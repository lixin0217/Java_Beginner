package Demo02;

public class TestConstruct {
    public static void main(String[] args) {
        Demo02.Person p = new Demo02.Person(12);
        p.show("Java构造方法的演示!");
    }
}

class Person {
    private int a;

    public Person(int x) {
        a = x;
        System.out.println("构造方法被调用。");
        System.out.println("a=" + a);
    }

    public void show(String msg) {
        System.out.println(msg);
    }
}

