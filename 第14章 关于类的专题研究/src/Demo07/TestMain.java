package Demo07;

//【范例14-21】 向类中传递参数（TestMain.java）。
public class TestMain {
    /**
     * public:表示公共方法
     * static:表示此方法为一静态方法，可以由类名直接调用
     * void:表明此方法无返回值
     * main:系统定义的方法名称
     * String[] args:接受运行时参数
     */
    public static void main(String[] args) {
        //判断输入参数的个数是否为两个参数，如果不是，则退出程序。
        // 所有接收的参数都被存放在args[]字符串数组之中，用for循环输出全部内容。
        int j = args.length;
        if (j != 2) {
            System.out.println("输入参数个数有错误！");
            System.exit(1);
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
