package Exercise;

/**
 * 9.7 实战练习 *
 * 3. 定义一个book类，包括属性title（书名）、price（价格）及pub（出版社），pub的默认值是“天天精彩出版社”，
 * 并在该类中定义方法getInfo()，来获取这三个属性。再定义一个公共类BookPress，其内包括主方法。
 * 在主方法中，定义3个book类的实例b1，b2和b3，分别调用各个对象的getInfo()方法，
 * 如果“天天精彩出版社”改名为“每日精彩出版社”，请在程序中实现实例b1，b2和b3的pub改名操作。
 * 完成功能后，请读者思考一下，如果book类的实例众多，有没有办法优化这样的批量改名操作？
 */

//定义一个book类，包括属性title（书名）、price（价格）及pub（出版社），pub的默认值是“天天精彩出版社”，并在该类中定义方法getInfo()，来获取这三个属性。
class Book {
    String title;
    Double price;
    String pub = "天天精彩出版社";

    public Book(String title, Double price, String pub) {
        this.title = title;
        this.price = price;
        this.pub = pub;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    public Book() {

    }

    public String getInfo() {
        return ("The book title is " + this.title + ",price is " + this.price + ",published by " + this.pub + ".");
    }
}

//在主方法中，定义3个book类的实例b1，b2和b3，分别调用各个对象的getInfo()方法，如果“天天精彩出版社”改名为“每日精彩出版社”，请在程序中实现实例b1，b2和b3的pub改名操作。
public class Exercise9_3 {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();

        System.out.println(b1.getInfo());
        System.out.println(b2.getInfo());
        System.out.println(b3.getInfo());

        System.out.println("============分隔符=============");

        b1.pub = "每日精彩出版社";
        b2.pub = "每日精彩出版社";
        b3.pub = "每日精彩出版社";
        System.out.println(b1.getInfo());
        System.out.println(b2.getInfo());
        System.out.println(b3.getInfo());

        //完成功能后，请读者思考一下，如果book类的实例众多，有没有办法优化这样的批量改名操作？
        b1.setPub( "每日精彩出版社"); //用get set 方法能适当简化，但数量没有变化。
        System.out.println(b1.getInfo());
    }
}
