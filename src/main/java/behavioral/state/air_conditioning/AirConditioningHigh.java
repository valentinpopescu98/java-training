package behavioral.state.air_conditioning;

import behavioral.state.State;

public class AirConditioningHigh implements State {
    private AirConditioning airConditioning;

    public AirConditioningHigh(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public void handleChangeMode() {
        System.out.println("Turning air conditioning off!");
        airConditioning.setState(airConditioning.getAirConditioningOff());
    }

    @Override
    public String showInfo() {
        return "Air conditioning is high...";
    }
}
