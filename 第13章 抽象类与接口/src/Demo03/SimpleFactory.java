package Demo03;

//【范例13-11】 接口的作用（代码SimpleFactory.java）。
interface Fruit {//定义一个水果标准Fruit，其中定义一个抽象方法eat( )。

    public void eat();
}

class Apple implements Fruit {//定义一个Apple类实现接口Fruit，覆写抽象方法eat( )。

    public void eat() {
        System.out.println("吃苹果");
    }
}

class Orange implements Fruit {//定义一个Orange类实现接口Fruit，覆写抽象方法eat( )。

    public void eat() {
        System.out.println("吃橘子");
    }
}

public class SimpleFactory {
    public static void main(String[] args) {
        Fruit f = new Apple();//子类为接口实例化
        f.eat();//调用覆写后的子类eat()方法
    }
}
