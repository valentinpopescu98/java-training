package behavioral.mediator.ex2;

public class Light {
    private String type;
    private boolean isLightOn = false;

    public Light(String type) {
        this.type = type;
    }

    public void toggle() {
        isLightOn = !isLightOn;
        System.out.println(String.format("Light %s is turned %s", type, isLightOn? "ON" : "OFF"));
    }

    public boolean isLightOn() {
        return isLightOn;
    }
}
