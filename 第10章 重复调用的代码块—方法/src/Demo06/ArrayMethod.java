package Demo06;

public class ArrayMethod {
    public static void printArr(int[] arr) { //printArr方法，其功能是将数组的元素输出。
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {13, 23, 83, 1, 343, 23423, 833}; //声明一个数组arr。
        System.out.print("arr:");
        printArr(arr);
        System.out.println("arr.length = " + arr.length);

        System.out.println("==========================");

        int[] arrnew = arr.clone();//使用数组clone方法，新的数组arrnew克隆原数组的元素。
        System.out.print("arrnew:");
        printArr(arrnew);
        System.out.println("arrnew.length = " + arrnew.length);

        System.out.println("==========================");

        if (arr == arrnew) { //判断数组对象arr和克隆数组arrnew的引用值是否相同。
            System.out.println("数组arr和数组arrnew的引用地址相同。");
        } else {
            System.out.println("数组arr和数组arrnew的引用地址不相同。");
        }
    }
}
