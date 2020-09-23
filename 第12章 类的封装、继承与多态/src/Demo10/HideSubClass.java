package Demo10;

//【范例12-23】 隐藏子类的成员。
class Father {//定义了父类Father
    public static void overWritting() {//定义了一个静态方法overWritting()
        System.out.println("----Father Method------");
    }
}

class Son extends Father {//定义了子类Son，它继承父类Father
    public static void overWritting() {//定义了一个与父类同名的静态方法overWritting()。
        System.out.println("######Son Method#######");
    }
}

public class HideSubClass {
    public static void main(String[] args) {
        Father dad = new Son();//用子类实例化一个父类对象dad。
        dad.overWritting();
        //调用dad的overWritting()方法，从运行结果可以看出，
        //这时调用的父类的方法，没有被子类所覆盖，这就是说父类“隐藏”了子类的同名方法。

        Father.overWritting();
        Son.overWritting();
        //事实上，所有的静态方法都隶属于类，而非对象。
        // 所以，可以通过“类名.静态方法名”的方法来直接访问静态方法
    }
}
