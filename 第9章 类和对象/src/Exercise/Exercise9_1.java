package Exercise;

/**
 * 9.7 实战练习
 * 1. 定义一个包含name、age和like属性的Person类，实例化并给对象赋值，然后输出对象属性。
 */
class Person {
    public Person(String name, int age, boolean like) {
        this.name = name;
        this.age = age;
        this.like = like;
    }

    String name;
    int age;
    boolean like;
}


public class Exercise9_1 {
    public static void main(String[] args) {
        Person[] p = {
                new Person("Alex", 25, true),
                new Person("Bill", 30, false),
                new Person("Candy", 40, true)
        };

        for (int i = 0; i < p.length; i++) {
            System.out.println("Attributes of Person " + (i + 1) + ": "
                    + p[i].name + ", "
                    + p[i].age + ", "
                    + p[i].like + ".");
        }
    }
}
