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
    public static int countArr(int[] arr) {
        int newArrlength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            } else newArrlength += 1;
        }
        return newArrlength;
    }

    public static void main(String[] args) {
        int oldArr[] = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 0, 5};
        int j = countArr(oldArr);
        System.out.println("旧数组的长度为：" + oldArr.length);
        System.out.println("新数组的长度为：" + countArr(oldArr));

        int newArr[];

    }

}
