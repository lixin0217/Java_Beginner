package Demo04;

//【范例14-7】 使用Object接收接口对象（ObjectInterface06.java）
interface A {//定义一接口interface A

    public String getInfo();
}

class B implements A {//定义类B实现接口A，并覆写接口中的抽象方法getInfo()

    @Override
    public String getInfo() {
        return "Hello World!";
    }
}

public class ObjectInterface06 {
    public static void main(String[] args) {
        A a = new B();//向上转型，实例化接口
        Object obj = a;//创建Object类型的引用obj，把a向上转型为Object类型
        A x = (A) obj;//向下转型，obj强制转换回了A

        System.out.println(x.getInfo());
        //调用了x的getInfo()方法，因为x一直是指向B的实例的，所以调用的就是B的getInfo()方法。
    }
}
