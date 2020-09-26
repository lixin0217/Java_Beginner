package Demo04;

//【范例13-13】 代理设计模式（代码Proxytest.java）。
abstract class Subject {//定义一个抽象类Subject，其中定义一抽象方法request( )。

    abstract public void request();
}

class RealSubject extends Subject {
    //真实角色（红酒厂商）,定义一个RealSubject类实现继承Subject，覆写抽象方法request( )。

    public void request() {//覆写抽象方法
        System.out.println("我是红酒厂商，欢迎品尝购买。");
    }
}

class ProxySubject extends Subject {
    //代理角色（代理商）定义一个ProxySubject代理类，覆写抽象方法request ( )，定义preRequest( )。

    private RealSubject realSubject;//以真实角色作为代理角色的属性

    public void request() {//该方法封装了真实对象的request方法
        preRequest();
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();//此处执行真实对象的request方法
        postRequest();
    }

    private void preRequest() {
        System.out.println("广告宣传，免费品尝。");
        //添加一些你希望在购买之前的动作
    }

    private void postRequest() {
        System.out.println("付款购买。");
        //添加一些你希望在购买之后的动作
    }
}

public class ProxyTest {
    public static void main(String[] args) {
        //客户直接找代理商
        Subject sub = new ProxySubject();//子类为接口实例化
        sub.request();
    }
}
