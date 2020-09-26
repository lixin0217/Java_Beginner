package Exercise;

import java.util.Scanner;

/**
 * 13.5 实战练习
 * 2.利用接口及抽象类设计实现
 * ⑴ 定义接口圆形CircleShape(),其中定义常量PI，默认方法area计算圆面积；
 * ⑵ 定义圆形类Circle实现接口CircleShape，包含构造方法和求圆周长方法；
 * ⑶ 定义圆柱类Cylinder继承Circle实现接口CircleShape,包含构造方法，圆柱表面积，体积；
 * ⑷ 从控制台输入圆半径，输出圆面积及周长；
 * ⑸ 从控制台输入圆柱底面半径及高，输出圆柱底面积、圆柱表面积及体积。
 */
interface CircleShape {//⑴ 定义接口圆形CircleShape()
    static double PI = 3.14;  //定义常量PI，默认方法area计算圆面积；

    default double area(double radius) {//定义默认方法area计算圆面积；
        return PI * radius * radius;
    }
}

class Circle implements CircleShape {// ⑵ 定义圆形类Circle实现接口CircleShape
    double radius;//定义变量r表示半径

    public Circle(double radius) {//构造方法
        this.radius = radius;
    }

    public double area(double radius) {//调用接口默认方法area计算圆面积；
        CircleShape.super.area(radius);
        return PI * radius * radius;
    }

    double perimeter(double radius) {//定义perimeter方法，返回圆周长
        return 2 * PI * this.radius;
    }
}

class Cylinder extends Circle {// ⑶ 定义圆柱类Cylinder继承Circle实现接口CircleShape
    double height; //定义变量height代表圆柱体的高

    public Cylinder(double radius, double height) {//构造方法
        super(radius);
        this.height = height;
    }

    public double area(double radius) {//调用接口area方法计算圆柱底面积
        super.area(radius);
        return PI * radius * radius;
    }

    double surfaceArea(double radius, double height) {//定义surfaceArea方法计算圆柱表面积
        return super.area(radius) + super.perimeter(radius) * this.height;
    }

    double volume(double radius, double height) {//定义volume方法计算圆柱体积
        return super.area(radius) * this.height;
    }
}

public class Exercise13_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ⑷ 从控制台输入圆半径，输出圆面积及周长；
        System.out.print("请输入圆的半径：");
        double r1 = sc.nextDouble();
        Circle c1 = new Circle(r1);
        System.out.println("圆的面积为：" + c1.area(r1));
        System.out.println("圆的周长为：" + c1.perimeter(r1));

        // ⑸ 从控制台输入圆柱底面半径及高，输出圆柱底面积、圆柱表面积及体积。
        System.out.print("请输入圆柱的底面半径：");
        double r2 = sc.nextDouble();
        System.out.print("请输入圆柱的高：");
        double h = sc.nextDouble();
        Cylinder c2 = new Cylinder(r2, h);
        System.out.println("圆柱的底面积为：" + c2.area(r2));
        System.out.println("圆柱的表面积为：" + c2.surfaceArea(r2, h));
        System.out.println("圆柱的体积为：" + c2.volume(r2, h));
    }
}
