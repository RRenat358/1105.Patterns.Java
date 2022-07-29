import java.util.ArrayList;
import java.util.List;

/**
 * Пульт управления музыкальным центром
 */

public class RemoteControl {

    private List<Command> buttons = new ArrayList<>();

    public RemoteControl() {
        this.buttons = buttons;
    }

    public void addCommand(int idButton, Command command) {
        buttons.add(idButton, command);
    }

    public void addCommand(int idButton, CommandSequence commandSequence) {
        buttons.add(idButton, commandSequence);
    }

    public void pressButton(int idButton) {
        buttons.get(idButton).execute();
    }


}
