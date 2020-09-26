package Demo04;

//【范例13-12】 工厂模式（代码Factory.java）。
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

class Factory1 {//定义类Factory1

    public static Fruit getInstance(String className) {
        if ("apple".equals(className)) {
            return new Apple();
        }
        if ("orange".equals(className)) {
            return new Orange();
        }
        return null;
    }
}

public class Factory {
    public static void main(String[] args) {
        Fruit f = Factory1.getInstance("apple"); //子类为接口实例化
        //根据参数args[0]的内容实例化不同的子类，参数内容为“apple”，实例化的是Apple类，
        // 参数内容“orange”，则实例化的是Orange类，即输出内容也不同。
        //也可以在主类中直接设置参数内容“orange”：
        // Fruit f =Factory1.getInstance(“orange”) ;
        f.eat();//调用覆写后的子类eat()方法
    }
}
