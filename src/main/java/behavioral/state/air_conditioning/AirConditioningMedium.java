package behavioral.state.air_conditioning;

import behavioral.state.State;

public class AirConditioningMedium implements State {
    private AirConditioning airConditioning;

    public AirConditioningMedium(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public void handleChangeMode() {
        System.out.println("Turning air conditioning high!");
        airConditioning.setState(airConditioning.getAirConditioningHigh());
    }

    @Override
    public String showInfo() {
        return "Air conditioning is medium...";
    }
}
