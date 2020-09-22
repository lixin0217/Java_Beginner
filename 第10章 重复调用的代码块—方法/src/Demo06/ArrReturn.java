package Demo06;

public class ArrReturn {
    //在main方法中分别输出排序前和排序后的数组元素。
    public static void main(String[] args) {
        int[] arr = {3, 53, 23, 22, 55, 21};
        printArr(arr, "排序前:");

        int[] arrNew = sort(arr);
        printArr(arr, "排序后");
    }

    public static int[] sort(int[] arr) { //sort方法是一个冒泡排序算法，对数组arr的元素从大到小排序。
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    //printArr方法是将数组的元素输出。其中数组的输出用了for-each语法。
    public static void printArr(int[] arr, String msg) {
        System.out.println(msg);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
