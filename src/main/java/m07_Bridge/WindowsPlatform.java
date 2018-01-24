package m07_Bridge;

/**
 * Created by yuanjie.fang on 2018/1/23.
 */
public class WindowsPlatform extends Platform {
    public WindowsPlatform(Monkey monkey) {
        this.monkey = monkey;
    }

    public void program() {
        monkey.type();
        System.out.println("使用Windows平台！");
    }
}
