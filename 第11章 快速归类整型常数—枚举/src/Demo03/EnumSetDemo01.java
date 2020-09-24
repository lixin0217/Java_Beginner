package Demo03;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * 【范例11-8】 测试EnumSet静态方法allOf()（EnumSetDemo01.java）。
 */
enum Color {RED, GREEN, BLUE}

public class EnumSetDemo01 {
    public static void main(String[] args) {
        EnumSet<Color> eSet = EnumSet.allOf(Color.class);
        Iterator<Color> iter = eSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
