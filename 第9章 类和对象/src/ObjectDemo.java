/**
 * 【范例9-4】 使用Person类的对象调用类中的属性与方法的过程（ObjectDemo.java）。
 */
public class ObjectDemo {
    public static void main(String[] args) {
        //声明了一个Person类的实例对象p1，并通过new操作，调用构造方法Person()，直接实例化此对象。
        Person p1 = new Person();

        //对p1对象中的属性（name和age）进行赋值。
        p1.name = "Alex Li";
        p1.age = 30;

        //调用p1对象中talk()方法，实现在屏幕上输出信息。
        System.out.println(p1.talk());
    }
}
