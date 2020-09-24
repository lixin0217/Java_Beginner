package Demo02;

//【范例13-4】 模板设计模式（代码TemplateMethod.java）。
abstract class Action {//定义操作行为类
    //定义了四个全局常量
    public static final int EAT = 1;
    public static final int WORK = 2;
    public static final int SLEEP = 5;
    public static final int RUN = 10;

    //声明了四个抽象方法
    public abstract void eat();
    public abstract void work();
    public abstract void sleep();
    public abstract void run();

    //声明了一个具体方法。
    public void command(int ch) {
        switch (ch) {
            case EAT:
                this.eat();
                break;
            case WORK:
                this.work();
                break;
            case SLEEP:
                this.sleep();
                break;
            case RUN:
                this.run();
                break;
            case EAT + WORK:
                this.eat();
                this.work();
                break;
            case EAT + SLEEP + RUN:
                this.eat();
                this.sleep();
                this.run();
                break;
            case EAT + SLEEP + RUN + WORK:
                this.eat();
                this.sleep();
                this.run();
                this.work();
                break;
        }
    }
}

class Robot extends Action {
    //声明子类Robot，通过覆写抽象方法定义机器人的行为。
    public void eat() {
        System.out.println("为机器人充电");
    }

    public void sleep() {
    }

    public void run() {
    }

    public void work() {
        System.out.println("让机器人开始工作。");
    }
}

class Woman extends Action {
    //声明子类Woman，通过覆写抽象方法定义美女的行为。
    public void eat() {
        System.out.println("请美女吃饭");
    }

    public void sleep() {
        System.out.println("让美女睡觉。");
    }

    public void run() {
        System.out.println("让美女跑步健身。");
    }

    public void work() {
    }
}

class Man extends Action {
    //声明子类Man，通过覆写抽象方法定义帅哥的行为。
    public void eat() {
        System.out.println("请帅哥吃饭，宵夜");
    }

    public void sleep() {
        System.out.println("让帅哥睡个觉。");
    }

    public void run() {
        System.out.println("让帅哥跑步爬山打球。");
    }

    public void work() {
        System.out.println("让帅哥干活。");
    }
}

//如果要想实现指定的操作，只需要将方法按照要求覆写即可，相当于父类定义出了一个操作模板。
// 实际用的时候也可以在Servlet程序设计上使用。

public class TemplateMethod {
    public static void main(String[] args) {
        Robot actA = new Robot();//机器人行为
        actA.command(Action.EAT);
        actA.command(Action.WORK);

        System.out.println("===================");
        Woman actB = new Woman();//美女行为
        actB.command(Action.EAT + Action.RUN + Action.SLEEP);

        System.out.println("===================");
        Man actC = new Man();//帅哥行为
        actC.command(Action.EAT + Action.RUN + Action.SLEEP + Action.WORK);
    }
}
