package m21_Strategy;

/**
 * Created by yuanjie.fang on 2018/2/22.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.strategyInterface();
    }
}
