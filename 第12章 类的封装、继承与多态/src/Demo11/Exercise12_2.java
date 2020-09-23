package Demo11;

/**
 * 2. 观察下面的两个类，请回答下面的问题（本题改编自华为科技有限公司面试题）：
 * ⑴ 在子类中哪些方法隐藏了父类的方法?
 * ⑵ 在子类中哪些方法覆盖了父类的方法?
 * 并通过编程实践验证上述问题。
 */
class classA {//父类classA

    void methodOne(int i) {//普通方法
        System.out.println("ClassA:methodOne,i=" + i);
    }

    void methodTwo(int i) {//普通方法
        System.out.println("ClassA:methodTwo,i=" + i);
    }

    static void methodThree(int i) {//关键词static修饰的静态方法是不能被覆盖的
        System.out.println("ClassA:methodThree,i=" + i);
    }

    static void methodFour(int i) {//关键词static修饰的静态方法是不能被覆盖的
        System.out.println("ClassA:methodFour,i=" + i);
    }
}

class classB extends classA {//子类classB

/*    static void methodOne(int i) {//关键词static修饰的静态方法，
        // classB中的methodOne(int)无法覆盖classA中的methodOne(int)覆盖的方法为 static
        System.out.println("ClassB:methodOne,i=" + i);
    }*/

    void methodTwo(int i) {//普通方法
        System.out.println("ClassB:methodTwo,i=" + i);
    }

/*    void methodThree(int i) {//普通方法
        //classB中的methodThree(int)无法覆盖classA中的methodThree(int),被覆盖的方法为static
        System.out.println("ClassB:methodThree,i=" + i);
    }*/

    static void methodFour(int i) {//关键词static修饰的静态方法
        System.out.println("ClassB:methodFour,i=" + i);
    }
}

public class Exercise12_2 {
    public static void main(String[] args) {
        classA dad = new classB(); //用classB子类实例化一个classA父类对象dad
        dad.methodOne(1);
        dad.methodTwo(2);
        dad.methodThree(3);
        dad.methodFour(4);
    }
}
