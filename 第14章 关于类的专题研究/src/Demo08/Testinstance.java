package Demo08;

//【范例14-25】 instanceof关键字使用实例（TestInstance.java）。
class Person {
    public void fun1() {
        System.out.println("1.Person{Fun1()}");
    }

    public void fun2() {
        System.out.println("2.Person{Fun2()}");
    }
}

class Student extends Person {
    public void fun1() {
        System.out.println("3.Student{Fun1()}");
    }

    public void fun3() {
        System.out.println("4.Student{Fun3()}");
    }
}


public class Testinstance {
    public static void main(String[] args) {
        //声明了一个父类对象p，并通过其子类实例化此对象。
        Person p = new Student();

        //用instanceof关键字判断p对象是否是Student的实例。
        // 在此范例中，因为p是通过Student类实例化的，所以此条件满足。
        if (p instanceof Student) {

            //将p对象强制转换为Student类的对象，并调用fun1()方法，
            // 调用此方法时，实际上调用的是被子类覆写了的fun1()方法。
            Student s = (Student) p;
            s.fun1();
        } else {
            p.fun2();
        }
    }
}
