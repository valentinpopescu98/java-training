package behavioral.mediator.ex2;

public class Main {
    public static void main(String[] args) {
        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        Mediator mediator = new Mediator();
        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        TurnOnAllLights turnOnAllLights = new TurnOnAllLights(mediator);
        TurnOffAllLights turnOffAllLights = new TurnOffAllLights(mediator);

        turnOnAllLights.execute();
        turnOffAllLights.execute();
    }
}
