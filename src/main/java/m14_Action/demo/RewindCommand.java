package m14_Action.demo;

/**
 * Created by yuanjie.fang on 2018/2/12.
 */
public class RewindCommand implements Command {
    private AudioPlayer audioPlayer;

    public RewindCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void execute() {
        audioPlayer.rewind();
    }
}
