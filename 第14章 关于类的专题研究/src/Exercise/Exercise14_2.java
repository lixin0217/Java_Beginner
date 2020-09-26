package Exercise;

/**
 * 14.10 实战练习
 * 1. 定义一个包含“name”、“age”和“sex”的对象，使用匿名对象输出对象实例。
 * 2. 完成一个统计Book类产生实例化对象的个数。
 */
class Book {
    String title;
    double price;
    String publisher;
    static int num = 0;

    public Book() {
        num++;
    }
}

public class Exercise14_2 {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();
        Book b4 = new Book();
        Book b5 = new Book();
        Book b6 = new Book();
        System.out.println("共产生了" + Book.num + "个实例化对象。");
    }
}
