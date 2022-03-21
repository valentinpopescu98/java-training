package behavioral.mediator.ex2;

import behavioral.command.ex2.Command;
import behavioral.command.ex2.invoker.Light;

import java.util.List;

public class TurnOffAllLights implements Command {
    private final Mediator mediator;

    public TurnOffAllLights(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }
}
