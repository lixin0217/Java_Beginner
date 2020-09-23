package Demo10;

/**
 * 【范例12-20】 使用多态（ObjectPoly.Java）。
 */
class Animal {//定义了Animal类，其中定义了动物的一个公有的行为move（移动）

    public void move() {
        System.out.println("动物移动！");
    }
}

//子类Fish、Bird、Horse分别继承Animal类，并覆写了Animal类的move方法，
// 实现各自独特的移动方式：Fish （鱼）游；Bird（鸟）跳；Horse（马）跑。
class Fish extends Animal {
    public void move() {
        System.out.println("鱼儿游！");
    }
}

class Bird extends Animal {
    public void move() {
        System.out.println("鸟儿飞！");
    }
}

class Horse extends Animal {
    public void move() {
        System.out.println("马儿跑!");
    }
}

public class ObjectPoly {
    public static void main(String[] args) {
        Animal a; //声明了一个父类Animal的对象a，但没有真正实例化a。
        Fish f = new Fish();
        Bird b = new Bird();
        Horse h = new Horse();

        //通过赋值操作，将这些子类对象向上类型转换为Animal类型。然后经过父类对象a调用其move方法，
        // 这时我们发现，实际调用的却是各个子类对象的move方法。
        a = f;
        a.move();
        a = b;
        a.move();
        a = h;
        a.move();
    }
}
