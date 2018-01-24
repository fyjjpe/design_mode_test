package m10_Wrapper;

/**
 * Created by yuanjie.fang on 2018/1/23.
 */
public class Client {
    public static void main(String[] args) {
        TheGreatestSage sage = new Monkey();

        TheGreatestSage bird = new Bird(sage);
        TheGreatestSage fish = new Fish(bird);

        fish.move();

    }
}
