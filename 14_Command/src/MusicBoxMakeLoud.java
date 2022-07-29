/**
 * Выключить свет
 */

public class MusicBoxMakeLoud implements Command {

    private MusicBox musicBox;


    public MusicBoxMakeLoud(MusicBox musicBox) {
        this.musicBox = musicBox;
    }


    @Override
    public void execute() {
        musicBox.makeLoud();
    }


}
