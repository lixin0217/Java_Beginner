/**
 * 10.12 实战练习
 * 1. 编程实现，现在有如下的一个数组。
 * oldArr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}
 * 要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，生成的新数组为。
 * newArr[] = {1,3,4,5,6,6,5,4,7,6,7,5}
 * 提示:
 * 步骤一：需要确定新数组的大小，需要知道原始数组之中不为0的个数，可编写一个方法完成；
 * 步骤二：根据统计的结果开辟一个新的数组；
 * 步骤三：将原始数组之中不为0的数据拷贝到新数组之中。
 * 1）将旧数组的元素取出来与0进行==比较，为0忽略，计数+1，确定数组长度；
 * 2）new一个新数组为指定的长度；
 * 3）将旧数组中不为0的元素逐一赋值给新数组。
 */
package Demo07;

public class Exercise10_1 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 0, 5, 0, 324, 6, 6, 0, 5, 4, 0, 6, 0, 1133, 0, 5};

        System.out.println("旧数组的长度为：" + arr.length);
        System.out.println("新数组的长度为：" + countArr(arr));

        printArr("旧数组的元素为：", arr);
        printArr("新数组的元素为：", renewArr(arr));

    }

    //countArr方法将原有数组中为0的元素去除，返回去掉0后的数组长度
    public static int countArr(int[] arr) {
        int newArrlength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            } else newArrlength += 1;
        }
        return newArrlength;
    }

    //printArr方法是将数组的元素输出。其中数组的输出用了for-each语法。
    public static void printArr(String msg, int[] arr) {
        System.out.println(msg);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //renewArr方法是将数组的元素0剔除，返回不包含0的新数组
    public static int[] renewArr(int[] arr) {
        int j = 0;
        int temp[] = new int[countArr(arr)];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        return temp;
    }
}
