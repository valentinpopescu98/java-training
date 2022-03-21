package behavioral.mediator.ex2;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<Light> lights = new ArrayList<>();

    public void registerLight(Light light) {
        lights.add(light);
    }

    public void turnOffAllLights() {
        lights.forEach(light -> {
            if (light.isLightOn()) {
                light.toggle();
            }
        });
    }

    public void turnOnAllLights() {
        lights.forEach(light -> {
            if (!light.isLightOn()) {
                light.toggle();
            }
        });
    }
}
