/**
 * Включить музыкальный центр
 */


public class MusicBoxTurnOn implements Command {

    private MusicBox musicBox;

    public MusicBoxTurnOn(MusicBox musicBox) {
        this.musicBox = musicBox;
    }

    @Override
    public void execute() {
        musicBox.turnOn();
    }


}

