package m17_Mediator;

/**
 * Created by yuanjie.fang on 2018/2/13.
 */
public class Client {
    public static void main(String[] args) {
        AbstractColleague collA = new ColleagueA();
        AbstractColleague collB = new ColleagueB();

        AbstractMediator am = new Mediator(collA, collB);
        System.out.println("设置A影响B");
        collA.setNumber(1000, am);
        System.out.println("collA——" + collA.getNumber());
        System.out.println("collB——" + collB.getNumber());

        System.out.println("设置B影响A");
        collB.setNumber(1000,am);
        System.out.println("collA——" + collA.getNumber());
        System.out.println("collB——" + collB.getNumber());
    }
}
