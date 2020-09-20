/**
 * 【范例9-7】 equals方法用于对象内容的比较（CompareObject2.java）。
 */
public class CompareObject2 {
    public static void main(String[] args) {
        String str1 = new String("java");
        String str2 = new String("java");
        String str3 = str2;

        //equals()方法的宿主是String类的对象str1。所有String类的对象都有equals()方法
        if (str1.equals(str2)) {
            System.out.println("str1 equals str2");
        } else {
            System.out.println("str1 not equals str2");
        }

        if (str2.equals(str3)) {
            System.out.println("str2 equals str3");
        } else {
            System.out.println("str2 not equals str3");
        }
    }
}
