import java.util.ArrayList;
import java.util.List;

/**
 * Последовательность команд
 */

public class CommandSequence implements Command {

    private List<Command> commands = new ArrayList<>();

    public CommandSequence(List commands) {
        this.commands = commands;
    }


    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }


}
