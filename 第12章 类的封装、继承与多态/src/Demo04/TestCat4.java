package Demo04;

/**
 * 【范例12-4】 方法的封装使用（TestCat4.Java）。
 * 下面的这个范例添加了一个MakeSound()方法，通过修饰符private（私有）将其封装了起来。
 */
public class TestCat4 {
    public static void main(String[] args) {
        MyCat aCat = new MyCat();
        aCat.setWeight(20f);
        float temp = aCat.getWeight();
        System.out.println("The weight o a Cat is: " + temp);
//        aCat.makeSound(); //makeSound() 在 Demo04.MyCat 中是 private 访问控制
    }
}

class MyCat {
    private float weight;

    public float getWeight() {
        makeSound();
        //访问权限控制符是对类外而言的，而在同一类中，所有的类成员属性及方法都是相互可见的，
        // 也就是说，它们之间是可以相互访问的。
        return weight;
    }

    public void setWeight(float weight) {
        if (weight <= 0) {
            System.out.println("属性设置非法，应该>0；使用默认值10！");
            this.weight = 10f;
        } else
            this.weight = weight;
    }

    private void makeSound() {
        System.out.println("Miao miao, my weight is " + weight);
    }
}
