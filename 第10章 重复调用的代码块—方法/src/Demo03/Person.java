package Demo03;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int age) {
        name = "Bigname";
        this.age = age;
    }

    public void talk() {
        System.out.println("I'm " + this.name + ", I'm " + this.age + " years' old.");
    }
}

