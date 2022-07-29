/**
 * Выключить музыкальный центр
 */


public class MusicBoxTurnOff implements Command {

    private MusicBox musicBox;

    public MusicBoxTurnOff(MusicBox musicBox) {
        this.musicBox = musicBox;
    }

    @Override
    public void execute() {
        musicBox.turnOff();
    }

}
