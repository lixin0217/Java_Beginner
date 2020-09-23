package Demo03;

/**
 * 【范例12-3】 类私有属性的Setter和Getter方法——一只品质可控的猫（TestCat3.java）。
 */
public class TestCat3 {
    public static void main(String[] args) {
        MyCat aCat = new MyCat();
        aCat.setWeight(20f);
        float temp = aCat.getWeight();
        System.out.println("The weight o a Cat is: " + temp);
    }
}

class MyCat {
    private float weight;

    public float getWeight() {
        return weight;
    }

    //经由公有接口来对属性值实施操作，我们可以在这些接口里对这些值实施“管控”，
    // 从而能更好地控制属性成员。
    public void setWeight(float weight) {
        if (weight <= 0) {
            System.out.println("属性设置非法，应该>0；使用默认值10！");
            this.weight = 10f;
        } else
            this.weight = weight;
    }
}
