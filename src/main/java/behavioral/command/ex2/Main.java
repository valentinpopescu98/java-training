package behavioral.command.ex2;

import behavioral.command.ex2.commands.ToggleAllLights;
import behavioral.command.ex2.commands.ToggleLight;
import behavioral.command.ex2.invoker.Light;
import behavioral.command.ex2.invoker.Switch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Light bedroomlight = new Light("Bedroom");
        Light kitchenlight = new Light("Kitchen");

        Switch mySwitch = new Switch();

        ToggleLight toggleLight = new ToggleLight(bedroomlight);
        mySwitch.executeCommand(toggleLight);
        System.out.println("----------------------------------");

        ToggleAllLights toggleAllLights = new ToggleAllLights(Arrays.asList(bedroomlight, kitchenlight));
        mySwitch.executeCommand(toggleAllLights);
    }
}
