package m14_Action.demo2;

import m14_Action.demo.Command;

/**
 * Created by yuanjie.fang on 2018/2/12.
 */
public interface MacroCommand extends Command {
    public void add(Command cmd);

    public void remove(Command cmd);

}
