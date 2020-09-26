package Exercise;

/**
 * 14.10 实战练习
 * 1. 定义一个包含“name”、“age”和“sex”的对象，使用匿名对象输出对象实例。
 * 2. 完成一个统计Book类产生实例化对象的个数。
 */
class Person {
    String name;
    int age;
    String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String talk() {
        return "My name is " + this.name + ", I'm " + this.age + " years old. I'm " + sex;
    }
}

public class Exercise14_1 {
    public static void main(String[] args) {
        System.out.println(new Person("Alex", 25, "male").talk());
    }
}
