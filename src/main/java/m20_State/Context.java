package m20_State;

/**
 * Created by yuanjie.fang on 2018/2/14.
 */
public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request(String sampleParameter){
        state.handle(sampleParameter);
    }
}
