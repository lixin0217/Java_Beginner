package Demo01;

public class Person {
    String name;
    int age;

    void talk() {
        System.out.println("My name is " + this.name + ", I'm " + this.age + " years' old.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
