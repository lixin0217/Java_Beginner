/**
 * 【范例9-8】 用静态方式初始化对象数组（ObjectArray.java）。
 */

public class ObjectArray {
    public static void main(String[] args) {

        //用静态声明方式声明了Person类的对象数组p，它包含了3个对象。
        Person p[] = {
                new Person("Alex", 25),
                new Person("Bill", 26),
                new Person("Carol", 30),
        };

        //用for循环输出对象数组p中的所有对象，并分别调用它们talk()方法，打印出个人信息。
        for (int i = 0; i < p.length;
             i++) {
            System.out.println(p[i].talk());
        }
    }
}
