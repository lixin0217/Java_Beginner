/**
 * 【范例9-6】 “==”运算符用于比较（CompareObject1.java）。
 */
public class CompareObject1 {
    public static void main(String[] args) {
        //用new实例化两个String类对象，此时这两个对象在“堆内存”中处于不同的内存位置，
        //也就是它们的内存地址是不一样的。这个时候程序中是用的“==”比较，
        //比较的是内存地址值（即引用值），所以输出str1!=str2。
        String str1 = new String("java");
        String str2 = new String("java");

        //将str2的引用值直接赋给str3，这个时候就相当于str3也指向了str2的引用，
        // 此时这两个对象指向的是同一内存地址，所以比较值的结果是str2==str3。
        String str3 = str2;

        if (str1 == str2) {
            System.out.println("str1 == str2");
        } else {
            System.out.println("str1 != str2");
        }

        if (str2 == str3) {
            System.out.println("str2 == str3");
        } else {
            System.out.println("str2 != str3");
        }
    }
}
