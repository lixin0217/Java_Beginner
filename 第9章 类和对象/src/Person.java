/**
 * 【范例9-1】 类的组成使用（Person.java）。
 */
class Person { //Person类的定义。
    String name;
    int age;

    public Person() {
    }

    //构造方法Person()的定义.
    // “this.name =name;”这个语句就可以比较清晰的解读为:
    // 用Person方法内形参name给本对象的成员变量name赋值。
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String talk() {
        return "I'm " + this.name + ",I'm " + this.age + " years' old.";
    }
}
