package Demo05;

/**
 * 【范例12-5】 使用构造函数实现数据的封装（TestEncapsulation.Java）。
 * 如果类中的某些数据在初始化后不想再被外界修改，则可以使用构造方法配合私有化的
 * Setter 函数来实现该数据的封装
 */
public class TestEncapsulation {
    public static void main(String[] args) {
        MyCat aCat = new MyCat(12,5);
        //类MyCat的对象aCat一经实例化，name和age私有属性便不能再进行修改，
        // 因为构造方法只能在实例化对象时自动调用一次，而SetHeight()方法和SetWeight()方法
        // 的访问权限为私有类型，外界不能调用，这样就实现了封装的目的。

        float wt = aCat.getWeight();
        float ht = aCat.getHeight();
        System.out.println("The weight o a Cat is: " + wt);
        System.out.println("The height o a Cat is: " + ht);
    }
}

class MyCat {
    private float weight;
    private float height;

    //MyCat类的构造方法，通过调用私有化SetHeight()方法
    //和私有化SetWeight()方法来对height和weight进行初始化。
    public MyCat(float weight, float height) {
        setWeight(weight);
        setHeight(height);
    }

    public float getWeight() {
        return weight;
    }

    private void setWeight(float weight) {
        if (weight <= 0) {
            System.out.println("属性设置非法，应该>0；使用默认值10！");
            this.weight = 10f;
        } else
            this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    private void setHeight(float height) {
        if (height <= 0) {
            System.out.println("属性设置非法，应该>0；使用默认值20！");
            this.height = 20f;
        } else
            this.height = height;
    }
}
