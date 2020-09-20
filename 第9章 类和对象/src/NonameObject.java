/**
 * 【范例9-5】创建匿名对象
 * 为了更为详细了解匿名对象，请观察下面的代码。
 * 匿名对象有如下两个特点。
 * ⑴ 匿名对象是没有被其他对象所引用，即没有栈内存指向。
 * ⑵ 由于匿名对象没有栈内存指向，所以其只能使用一次，之后就变成无法找寻的垃圾对象，故此会被垃圾回收器收回。
 */
public class NonameObject {
    public void say() {
        System.out.println("面朝大海，春暖花开！");
    }

    public static void main(String[] args) {
        //这是匿名对象，没有被其他对象所引用
        new NonameObject().say();
    }
}
