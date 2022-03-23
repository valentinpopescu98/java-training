package behavioral.state.air_conditioning;

import behavioral.state.State;

public class AirConditioningLow implements State {
    private AirConditioning airConditioning;

    public AirConditioningLow(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public void handleChangeMode() {
        System.out.println("Turning air conditioning medium!");
        airConditioning.setState(airConditioning.getAirConditioningMedium());
    }

    @Override
    public String showInfo() {
        return "Air conditioning is low...";
    }
}
