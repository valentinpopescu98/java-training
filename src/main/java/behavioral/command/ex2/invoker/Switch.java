package behavioral.command.ex2.invoker;

import behavioral.command.ex2.Command;

public class Switch {
    public void executeCommand(Command command) {
        command.execute();
    }
}
