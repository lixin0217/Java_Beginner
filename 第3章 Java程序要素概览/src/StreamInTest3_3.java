import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 【范例3-3】 简单的输入、输出流使用范例（StreamInTest3 3.java）。
 * System.in System.out System.err的使用范例
 */

public class StreamInTest3_3 {
    public static void main(String[] args) {
        String str;

        //创建标准输入流对象stdin来接收键盘System.in的输入
        InputStreamReader stdin = new InputStreamReader(System.in);

        //以缓冲流模式来接收stdin
        BufferedReader buff = new BufferedReader(stdin);

        //使用try和catch机制来处理输入的异常
        try {
            System.out.print("Please enter string:");
            str = buff.readLine();
            System.out.println("Your input string is: " + str);
        } catch (Exception e) {
            System.err.println("I/O error occurs!!");
            e.printStackTrace();
        }
    }
}
