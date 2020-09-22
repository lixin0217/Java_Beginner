package Demo01;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("张三");
        p1.age = 35;
        p1.talk();
        p1.setAge(38);
        p1.talk();
    }
}
