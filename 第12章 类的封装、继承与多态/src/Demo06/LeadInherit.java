package Demo06;

/**
 * 【范例12-7】 继承的引出（LeadInherit.Java）。
 */
class Person {//定义了Person类
    String name;
    int age;

    public Person(String name, int age) {//Person类的构造方法
        this.name = name;
        this.age = age;
    }

    void speak() {
        System.out.println("My name is " + this.name + ",I'm " + this.age + " years' old.");
    }
}

class Student {//定义了Student类
    String name;
    int age;
    String school;

    public Student(String name, int age, String school) {//Student类的构造方法
        this.name = name;
        this.age = age;
        this.school = school;
    }

    void speak() {
        System.out.println("My name is " + this.name + ",I'm " + this.age + " years' old.");
    }

    void study() {
        System.out.println("I'm studying at " + this.school + ".");
    }
}

public class LeadInherit {
    public static void main(String[] args) {//实例Person类和Student类，并调用方法
        Person p = new Person("Alex", 25);
        p.speak();

        Student s = new Student("Ada", 13, "Good school");
        s.speak();
        s.study();
    }
}
