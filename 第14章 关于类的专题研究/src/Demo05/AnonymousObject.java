package Demo05;

//【范例14-12】 匿名对象的使用（AnonymousObject.java）。
//从程序中可以看到用new Person()声明的对象并没有赋给任何一个Person类对象的引用，
// 所以此对象只使用了一次，之后就会被Java的垃圾收集器回收。
class People {//声明了一个Person类，里面有name和age两个私有属性，并分别赋了初值。
    private String name = "Alex";
    public int age = 25;

    public String talk() {
        return "My name is " + this.name + ",I'm " + this.age + " years old.";
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        //声明了一个Person匿名对象，调用Person类中的talk()方法。
        System.out.println(new People().talk());
    }
}
