package behavioral.command.ex2.commands;

import behavioral.command.ex2.Command;
import behavioral.command.ex2.invoker.Light;

public class ToggleLight implements Command {
    private final Light light;

    public ToggleLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}
