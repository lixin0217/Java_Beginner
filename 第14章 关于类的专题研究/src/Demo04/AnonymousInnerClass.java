package Demo04;

//【范例14-11】 匿名内部类使用实例（AnonymousInnerClass.java）。
abstract class Bird {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int fly();
}

public class AnonymousInnerClass {
    public void test(Bird bird) {
        System.out.println(bird.getName() + "最高能飞" + bird.fly() + "米。");
    }

    public static void main(String[] args) {
        AnonymousInnerClass test = new AnonymousInnerClass();
        test.test(new Bird() {
            //在Test类中，test()方法接受一个Bird类型的参数，同时我们知道一个抽象类是没有办法直接new的，
            // 我们必须要先有实现类才能new出来它的实现类实例。所以在main方法中直接使用匿名内部类来创建一个Bird实例。
            // 匿名内部类不能是抽象类，所以必须要实现它的抽象父类或者接口里面所有的抽象方法。
            @Override
            public int fly() {
                return 1000;
            }

            @Override
            public String getName() {
                return "BIRD";

            }
        });
    }
}
