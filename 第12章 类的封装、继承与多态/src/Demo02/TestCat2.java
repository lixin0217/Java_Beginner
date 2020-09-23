package Demo02;

/**
 * 【范例12-2】 类的封装实例——一只难以访问的猫。
 */

public class TestCat2 {
    public static void main(String[] args) {
        MyCat aCat = new MyCat();//定义一个对象aCat

        //因为weight为私有的，所以外界不能由对象直接进行访问这些私有属性，
        // 因此直接通过“对象名.属性名”的方式来读写这个属性代码是无法通过编译的。
        //报错提示：weight 在 Demo02.MyCat 中是 private 访问控制
//        aCat.weight = -10.0f;
//        float temp = aCat.weight;

//        System.out.println("The weight o a Cat is: " + temp);//输出这个对象的属性值
    }
}

class MyCat {
    private float weight; //属性在声明时前面加上了private修饰符。

    MyCat() {
    }
}
