package m14_Action;

/**
 * Created by yuanjie.fang on 2018/2/12.
 */
public class Invoker {
    private Command command = null;


    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
