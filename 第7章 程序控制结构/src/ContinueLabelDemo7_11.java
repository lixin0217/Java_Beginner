/**
 * 【范例7-9】 带标签的break语句的使用（breakLabelDemo7 9.java）。
 */
public class ContinueLabelDemo7_11 {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            System.out.println("最外层循环, i = " + i);

            loop:
            for (int j = 1; j < 4; j++) {
                System.out.println("中间层循环, j = " + j);
                for (int k = 1; k < 4; k++) {
                    System.out.println("最内层循环, k = " + k);
                    continue loop;
                }
            }
            System.out.println("这是第" + i + "次循环。\n");
        }
    }
}
