package m14_Action.demo2;

import m14_Action.demo.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanjie.fang on 2018/2/12.
 */
public class MacroAudioCommand implements MacroCommand {
    private List<Command> commandList = new ArrayList<Command>();

    public void add(Command cmd) {
        commandList.add(cmd);
    }

    public void remove(Command cmd) {
        commandList.remove(cmd);
    }

    public void execute() {
        for (Command cmd : commandList) {
            cmd.execute();
        }
    }
}
