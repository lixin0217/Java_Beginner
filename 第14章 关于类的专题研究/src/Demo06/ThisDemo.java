package Demo06;

//【范例14-13】 在构造方法中声明与方法同名参数（Person.java）。
//【范例14-14】 this关键字的使用范例1（Person1.java）。
//【范例14-15】 this关键字的使用范例2（ThisDemo.java）。
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void talk() {
        System.out.println("My name is " + this.name + ",I'm " + this.age + " years old.");
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        Person p = new Person("Alex", 25);
        p.talk();
    }
}
