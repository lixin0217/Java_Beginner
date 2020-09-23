package Demo01;

/**
 * 【范例12-1】 类的封装性使用引例——一只品质不可控的猫（TestCat.Java）。
 */
class MyCat {
    //通过public修饰符，开放MyCat的属性（weight）给外界，
    // 这意味着外界可以通过“对象名.属性名”的方式来访问（读或写）这个属性。

    public float weight;

    //声明一个无参构造方法，在本例中无明显含义。
    MyCat() {
    }
}


public class TestCat {
    public static void main(String[] args) {
        MyCat aCat = new MyCat();//定义一个对象aCat
        aCat.weight = -10.0f;//通过“对象名.属性名”的方式来写这个属性。
        //“-10.0f”是一个普通的合法的单精度浮点数，因此在纯语法上，它给weight赋值没有任何问题。
        // 但是对于一个真正的对象（猫）来说，这是完全不能接受的，
        // 一个猫的重量（weight）怎么可能为负值？这明显是“一只不合格的猫”，
        // 但是由于weight这个属性开放给外界，“猫的体重值”无法做到“独立自主”，
        // 因为它的值可被任何外界的行为所影响。

        float temp = aCat.weight;//通过点操作符获得这个对象的值。
        System.out.println("The weight o a Cat is: " + temp);//输出这个对象的属性值
    }
}
