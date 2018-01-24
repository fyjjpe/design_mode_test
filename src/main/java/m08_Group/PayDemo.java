package m08_Group;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanjie.fang on 2018/1/23.
 */
public class PayDemo {
    public abstract class Market {
        String name;

        public abstract void add(Market m);

        public abstract void remove(Market m);

        public abstract void payByCard();
    }

    // 分店 下面可以有加盟店
    public class MarketBranch extends Market {
        // 加盟店列表
        List<Market> list = new ArrayList<Market>();

        public MarketBranch(String s) {
            this.name = s;
        }

        @Override
        public void add(Market m) {
            list.add(m);
        }

        @Override
        public void remove(Market m) {
            list.remove(m);
        }

        @Override
        public void payByCard() {
            System.out.println(name + "消费,积分已累计加入会员卡");
            for (Market m : list) {
                m.payByCard();
            }
        }
    }


    // 加盟店 下面不在有分店和加盟店，最底层
    public class MarketJoin extends Market {
        public MarketJoin(String s) {
            this.name = s;
        }

        @Override
        public void add(Market m) {


        }

        @Override
        public void remove(Market m) {


        }

        @Override
        public void payByCard() {
            System.out.println(name + "消费,积分已累加入该会员卡");
        }
    }

    public static void main(String[] args) {
        PayDemo demo = new PayDemo();

        MarketBranch rootBranch = demo.new MarketBranch("总店");
        MarketBranch szBranch = demo.new MarketBranch("苏州分店");
        MarketJoin oneJoin = demo.new MarketJoin("分店一");
        MarketJoin twoJoin = demo.new MarketJoin("分店二");

        szBranch.add(oneJoin);
        szBranch.add(twoJoin);
        rootBranch.add(szBranch);
        rootBranch.payByCard();
    }
}
