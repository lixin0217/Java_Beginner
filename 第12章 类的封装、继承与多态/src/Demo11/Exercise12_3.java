package Demo11;

/**
 * 3. 定义一个Instrument（乐器）类，并定义其公有方法play()，
 * 再分别定义其子类Wind（管乐器）， Percussion（打击乐器），Stringed（弦乐器），
 * 覆写play方法，实现每种乐器独有play方式。
 * 最后在测试类中使用多态的方法执行每个子类的play()方法。
 */
class Instrument {//定义一个Instrument（乐器）类

    //定义其公有方法play()
    public void play() {
        System.out.println("玩乐器");
    }
}

class Wind extends Instrument {//定义子类Wind（管乐器）

    public void play() {//覆写play方法，实现每种乐器独有play方式。
        System.out.println("弹奏");
    }
}

class Percussion extends Instrument {//定义子类Percussion（打击乐器）

    public void play() {//覆写play方法，实现每种乐器独有play方式。
        System.out.println("打击");
    }
}

class Stringed extends Instrument {//定义子类Stringed（弦乐器）

    public void play() {//覆写play方法，实现每种乐器独有play方式。
        System.out.println("拉");
    }
}

public class Exercise12_3 {
    public static void main(String[] args) {
        //在测试类中使用多态的方法执行每个子类的play()方法。
        Instrument test;
        Wind w = new Wind();
        Percussion p = new Percussion();
        Stringed s = new Stringed();

        test = w;
        test.play();

        test = p;
        test.play();

        test = s;
        test.play();
    }
}
