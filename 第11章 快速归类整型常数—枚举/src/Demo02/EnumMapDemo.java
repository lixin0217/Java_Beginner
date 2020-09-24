package Demo02;

import java.util.EnumMap;
import java.util.Map;
// 由于EnumMap类和 Map类不是java.lang默认加载的包库。
// 所以导入在Java包lang的EnumMap类和 Map类。

/**
 * 【范例11-7】 使用EnumMap操作枚举类中实例（Demo02.EnumMapDemo.java）。
 */

public class EnumMapDemo {
    public static void main(String[] args) {
        //创建了一个EnumMap类的对象 eMap。EnumMap<KeyType, NameType>是一个模板类，
        // 这里它们的两个类型参数KeyType和NameType分别被实例化为Color和String
        EnumMap<Color, String> eMap = new EnumMap<Color, String>(Color.class);

        //将“Demo02.Color.红色”作为键（key），“RED”作为映射的值（value），
        // 二者一起构成一对<key, value>映射，然后利用EnumMap中的put()方法来操作完整这种映射。
        eMap.put(Color.RED, "RED");
        eMap.put(Color.GREEN, "GREEN");
        eMap.put(Color.BLUE, "BLUE");

        //通过for-each循环，将eMap所拥有元素的<key，value>依次输出。
        for (Map.Entry<Color, String> me : eMap.entrySet()) {
            // EntrySet()是定义在Map类中的一个方法，其作用是返回整个映射实例（entry）的集合。
            // EntrySet()方法名中的Set不能理解“设置”，其表示的含义是“集合”。
            System.out.println(me.getKey() + "-->" + me.getValue());
        }
    }
}
