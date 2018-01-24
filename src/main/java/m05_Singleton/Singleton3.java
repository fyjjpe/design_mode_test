package m05_Singleton;

/**
 * Created by yuanjie.fang on 2018/1/23.
 * “双重检查加锁”机制的实现会使用关键字volatile，
 * 它的意思是：被volatile修饰的变量的值，将不会被本地线程缓存，
 * 所有对该变量的读写都是直接操作共享内存，从而确保多个线程能正确的处理该变量。
 *
 *
 * 在java1.4及以前版本中，很多JVM对于volatile关键字的实现的问题，
 * 会导致“双重检查加锁”的失败，
 * 因此“双重检查加锁”机制只只能用在java5及以上的版本。
 *
 *
 * ————————————————————建议很少使用
 */
public class Singleton3 {
    private volatile static Singleton3 instance = null;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

}
