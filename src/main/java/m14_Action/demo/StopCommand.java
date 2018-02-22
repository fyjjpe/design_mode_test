package m14_Action.demo;

/**
 * Created by yuanjie.fang on 2018/2/12.
 */
public class StopCommand implements Command {
    private AudioPlayer audioPlayer;

    public StopCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void execute() {
        audioPlayer.stop();
    }
}
