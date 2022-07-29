import java.util.ArrayList;
import java.util.List;

/**
 * Пульт управления музыкальным центром
 */

public class RemoteControl {

    private List<Command> buttons;

    public RemoteControl(List<Command> buttons) {
        this.buttons = new ArrayList<>();
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
