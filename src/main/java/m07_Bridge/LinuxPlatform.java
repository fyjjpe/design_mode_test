package m07_Bridge;

/**
 * Created by yuanjie.fang on 2018/1/23.
 */
public class LinuxPlatform extends Platform {
    public LinuxPlatform(Monkey monkey) {
        this.monkey = monkey;
    }

    public void program() {
        monkey.type();
        System.out.println("使用Linux平台!");
    }
}
