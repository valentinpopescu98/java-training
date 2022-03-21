package behavioral.mediator.ex2;

import behavioral.command.ex2.Command;
import behavioral.command.ex2.invoker.Light;

import java.util.List;

public class TurnOnAllLights implements Command {
    private final Mediator mediator;

    public TurnOnAllLights(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
