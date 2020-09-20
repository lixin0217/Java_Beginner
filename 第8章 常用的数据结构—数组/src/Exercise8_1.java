/**
 * 8.6 实战练习
 * 1. 编写程序，对int[] a = {25, 24, 12, 76, 98, 101, 90, 28}数组进行排序。
 * 排序算法有很多种，读者可先编写程序实现冒泡法排序，运行结果如下图所示。
 * （注：冒泡排序也可能有多种实现版本，本题没有统一的答案。）
 * 2. 编写程序，将上述算法稍加改写，将排序算法改成“乱序算法”。两次运行结果分别如下所示。
 * （提示：所谓"乱序"，是跟"排序"相反，乱序为了增加随机性，乱序在生活中模拟随机出现的事件中有很大的应用价值。
 * 编程时，需要使用导入import java.util.Random;）
 */
public class Exercise8_1 {
    public static void main(String[] args) {
        int[] arr = {25, 24, 12, 76, 98, 101, 90, 28};

        System.out.println("排序前的数组的元素为："); //for循环遍历打印排序前数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = " + arr[i] + ";\t");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) { //从第1个（index为0）个元素开始，直到最后一个没有比较的元素
                if (arr[j] > arr[j + 1]) { //比较相邻的两个数组元素，如果前一个比后一个大，则交换位置
                    int temp = arr[j]; //将较大的数赋值给一个temp变量
                    arr[j] = arr[j + 1]; //将较小的数赋值给前一个数组元素
                    arr[j + 1] = temp; //将较大的数赋值给后一个数组元素
                }
            }
        }
        System.out.println();
        System.out.println("排序后的数组的元素为："); //for循环遍历打印排序后数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = " + arr[i] + ";\t");
        }
    }
}
