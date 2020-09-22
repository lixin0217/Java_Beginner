package Exercise;

/**
 * 9.7 实战练习
 * 2. 定义一个book类，包括属性title（书名）和price（价格），并在该类中定义一个方法printInfo()，来输出这2个属性。
 * 然后再定义一个主类，其内包括主方法，在主方法中，定义2个book类的实例bookA和bookB，并分别初始化title和price的值。
 * 然后将bookA赋值给bookB，分别调用printInfo()，查看输出结果并分析原因。
 */

// 定义一个book类，包括属性title（书名）和price（价格），并在该类中定义一个方法printInfo()，来输出这2个属性。
class book {
    String title;
    double price;

    public book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public book() {
    }

    void printinfo() {
        System.out.println("The book title is " + this.title + ", the price is " + this.price);
    }
}

//定义一个主类，其内包括主方法，在主方法中，定义2个book类的实例bookA和bookB，并分别初始化title和price的值。
public class Exercise9_2 {
    public static void main(String[] args) {
        book bookA = new book("Gone with the wind", 30.8);
        book bookB = new book("Hello World", 100.8);
        bookA.printinfo();
        bookB.printinfo();

        // 将bookA赋值给bookB，分别调用printInfo()，查看输出结果并分析原因。
        System.out.println("=================重新赋值后===================");
        bookA = bookB;
        bookA.printinfo();
        bookB.printinfo();
    }
}
