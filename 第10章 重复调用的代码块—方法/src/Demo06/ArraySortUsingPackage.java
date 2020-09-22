package Demo06;

public class ArraySortUsingPackage {
    public static void printArr(int[] arr, String msg) {
        System.out.println(msg);
        for (int i : arr) {
            System.out.println(i + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {13, 324, 11, 3, 23432};
        printArr(arr, "排序前");
        java.util.Arrays.sort(arr); //利用Java的包库提供的sort方法来排序
        printArr(arr, "排序后");
    }
}
