package Demo10;

/**
 * 【范例12-16】 super调用父类的方法（Override2.Java）。
 */
class Person {
    //声明了一个Person类，里面定义了name和age两个属性，并声明了一个talk()方法。
    String name;
    int age;

    public String talk() {
        return "I'm " + name + ",I'm " + age + " years old.";
    }
}

class Student extends Person {//声明了一个Student类，此类继承自Person
    String school;

    public Student(String name, int age, String school) {
        //定义了Student类的构造方法，并对数据成员实施了初始化。
        super.name = name;
        super.age = age;
        this.school = school;
    }

    public String talk() {
        //声明了一个与父类中同名的talk()方法，因此Student类中的talk()方法覆写了Person类中的talk()方法，
        // 但通过super.talk()方式，调用了父类中的talk()方法。由于父类的talk()方法返回的是一个字符串，
        // 因此可以用连接符“+”，连接来自子类的字符串：", I am from " + this.school”，
        // 这样拼接的结果一起又作为子类的talk()方法的返回值。
        return super.talk() + "I'm from " + school;
        //从程序中可以看到，在子类中可以通过super.方法()调用父类中被子类覆写的方法。
    }
}

public class Override {
    public static void main(String[] args) {
        //实例化了一个子类对象，并同时调用子类构造方法为属性赋初值。
        Student s = new Student("Alex", 34, "HAUT");
        //用子类对象调用talk()方法，但此时调用的是子类中的talk()方法。
        // 由于子类的talk()方法返回的是一个字符串，因此可以作为System.out.println()的参数，
        // 将字符串输出到屏幕上。
        System.out.println(s.talk());
    }
}
