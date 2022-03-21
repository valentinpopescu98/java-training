package behavioral.command.ex2.commands;

import behavioral.command.ex2.Command;
import behavioral.command.ex2.invoker.Light;

import java.util.List;

public class ToggleAllLights implements Command {
    private final List<Light> lights;

    public ToggleAllLights(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.forEach(Light::toggle);
    }
}
