package behavioral.state;

import behavioral.state.air_conditioning.AirConditioning;

public class Main {
    public static void main(String[] args) {
        AirConditioning airConditioning = new AirConditioning();
        System.out.println(airConditioning.getInfo());

        airConditioning.changeMode();
        System.out.println(airConditioning.getInfo());

        airConditioning.changeMode();
        System.out.println(airConditioning.getInfo());

        airConditioning.changeMode();
        System.out.println(airConditioning.getInfo());

        airConditioning.changeMode();
        System.out.println(airConditioning.getInfo());
    }
}
