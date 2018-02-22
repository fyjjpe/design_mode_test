package m14_Action.demo2;

import m14_Action.demo.*;

/**
 * Created by yuanjie.fang on 2018/2/12.
 */
public class User2 {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        MacroAudioCommand macroAudioCommand = new MacroAudioCommand();
        macroAudioCommand.add(playCommand);
        macroAudioCommand.add(rewindCommand);
        macroAudioCommand.add(stopCommand);
        macroAudioCommand.execute();
    }
}
