package Demo05;

import java.util.ArrayList;

/**
 * 【范例12-6】 返回引用数据时应该注意的问题（ReturnVariable.Java）。
 */
class TestReturn {//创建了一个TestReturn类
    //设置为private封装类中的一个ArrayList类型（一种长度可变数组）属性intArray
    private ArrayList<Integer> intArray = new ArrayList<Integer>();

    //封装在构造函数中对其进行初始化，并且没有提供相应的设置Setter方法。
    TestReturn() {
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
    }

    ArrayList<Integer> getIntArray() {
        return intArray;
    }
}

public class ReturnVariable {
    public static void main(String[] args) {
        //实例化了TestReturn类，定义了testReturn对象，
        // 在构造这个对象的同时，自动调用构造方法，即也初始化inArray的属性值。
        TestReturn testReturn = new TestReturn();

        //通过getIntArray()函数得到intArray私有属性,并输出这个数组的大小。
        ArrayList<Integer> intArray = testReturn.getIntArray();
        System.out.println("在外部修改其私有变量属性前长度为：" + intArray.size());

        intArray.add(4);//向得到的intArray中添加了一个int类型数据成员4
        ArrayList<Integer> intArray2 = testReturn.getIntArray();//重新获得intArray的值
        System.out.println("在外部修改其私有变量属性后长度为：" + intArray2.size());
    }
}
