package Demo06;

public class ArrayReference {

    //定义静态方法changeReferValue，分别对传入参数的值进行修改。
    public static void changeReferValue(int a, int[] myArr) {
        a += 1;         //将参数a加1
        myArr[0] = 0;   //将数组的3个元素都置0
        myArr[1] = 0;
        myArr[2] = 0;
    }

    //定义静态方法printArr，用于将数组在终端打印出来。
    public static void printArr(int[] arr) {
        //在Java1.5以后的版本中，对于数组和集合框架（Collection）等类型的对象，提供了一种新的遍历方式，称为for-each
        for (int i : arr) {
            System.out.println(i + "");
        }
        System.out.println();
    }

    //定义静态方法print，用于打印所有变量。
    public static void print(int in, int[] arr) {
        System.out.println("in:" + in);
        System.out.println("arr:");
        printArr(arr);
    }

    //在主方法中分别声明了整型、数组等2种不同类型的变量，并赋予初值。整型属于基本数据类型，而数组则属于引用数据类型。
    public static void main(String[] args) {
        int in = 10;
        int[] arr = {1, 2, 3, 4, 5};
     //调用print方法，打印出没有调用changeReferValue方法前的各个变量值。
        System.out.println("--------调用changeReferValue方法之前---------");
        print(in, arr);

        changeReferValue(in, arr);//调用changeReferValue函数，试图改变参数的值。
        //再次调用print方法，用以查看调用changeReferValue方法之后，各个变量值的值是否得以改变。
        System.out.println("--------调用changeReferValue方法之后---------");
        print(in, arr);
    }
}
