package Demo02;

public class OverloadValueOf {
    public static void main(String[] args) {
        byte num_byte = 12;
        short num_short = 34;
        int num_int = 12345;
        float num_float = 12.34f;
        double num_double = 12.345;
        boolean b_value = false;

        System.out.println("num_byte is " + String.valueOf(num_byte));
        System.out.println("num_short is " + String.valueOf(num_short));
        System.out.println("num_int is " + String.valueOf(num_int));
        System.out.println("num_float is " + String.valueOf(num_float));
        System.out.println("num_double is " + String.valueOf(num_double));
        System.out.println("b_value is " + String.valueOf(b_value));
    }
}
