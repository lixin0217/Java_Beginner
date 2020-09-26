package Demo03;

//【范例13-10】 接口制定标准（代码Interfacestandards.java）。
interface USB {//定义USB接口的标准，其中有一个work( )抽象方法，表示拿到USB设备就要工作。

    public void work();//拿到USB设备就表示要进行工作
}

class Computer {
    //定义Computer类，其中定义具体方法plugin(USBusb)，
    // 表明在电脑上做出支持USB设备的操作，该类只要有USB设备就可以使用。

    public void plugin(USB usb) {
        usb.work();//按照固定的方式进行工作
    }
}

class Print implements USB {//定义Print类实现USB接口，定义具体的USB设备打印机。

    public void work() {
        System.out.println("打印机用USB接口，连接开始工作");
    }
}

class Flash implements USB {//定义Flash类实现接口USB，定义具体的USB设备U盘。

    public void work() {
        System.out.println("U盘使用USB接口，连接开始工作");
    }
}

public class InterfaceStandards {
    public static void main(String[] args) {
        Computer com = new Computer();//创建Computer类对象com。
        com.plugin(new Print());//在电脑上使用打印机
        com.plugin(new Flash());//在电脑上使用U盘
    }
}
