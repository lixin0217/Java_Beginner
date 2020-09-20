/**
 * 【范例9-2】 类的定义使用（ColorDefine.java）。
 */
class ColorDefine { //定义一个ColorDefine的类
    String color = "black"; //定义一个成员变量作为属性

    void getMes() { //定义一个方法
        System.out.println("Define Class");
    }

    public static void main(String[] args) {
        ColorDefine b = new ColorDefine(); //定义一个ColorDefine类的对象实例
        System.out.println(b.color); //打印输出对象实例的属性
        b.getMes(); //调用对象的方法
    }
}
