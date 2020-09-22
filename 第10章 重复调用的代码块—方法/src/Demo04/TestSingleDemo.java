package Demo04;

public class TestSingleDemo {
    public static void main(String[] args) {
        Person p; //声明一个Person类的对象p，但并未实例化，仅是在栈内存中为对象引用p分配了空间存储，p所指向的对象并不存在。
        p = Person.getPerson(); //调用Person类中的getPerson()方法，由于该方法是公有的，可以借此方法返回Person类的实例化对象，并将返回对象的引用赋值给p。
        System.out.println("姓名：" + p.name);
    }
}

class Person {
    String name;
    private static final Person p = new Person(); //声明了一个Person类的实例化对象，此对象是在Person类的内部实例化，所以可以调用私有构造方法。
    // 此对象被标识为static类型，表示为一静态属性。另外，在声明Person对象的时候还加上了一个final关键字，此关键字表示对象PERSON不能被重新实例化。

    private Person() { //将Person类的构造方法通过private关键字私有化，这样外部就无法通过其构造方法来产生实例化对象。
        name = "test";
    }

    public static Person getPerson() {
        return p;
    }
}