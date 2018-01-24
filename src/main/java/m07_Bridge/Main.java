package m07_Bridge;

/**
 * Created by yuanjie.fang on 2018/1/23.
 * 测试桥接模式
 */
public class Main {
    public static void main(String[] args) {
        Monkey monkeyS = new ServerMonkey();
        Monkey monkeyM = new MobileMonkey();
        Platform platform = new WindowsPlatform(monkeyS);
        platform.program();
        System.out.println("--------------------");
        platform = new WindowsPlatform(monkeyM);
        platform.program();
        System.out.println("--------------------");
        platform = new LinuxPlatform(monkeyS);
        platform.program();
        System.out.println("--------------------");
        platform = new LinuxPlatform(monkeyM);
        platform.program();

    }
}
