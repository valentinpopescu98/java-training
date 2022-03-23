package behavioral.state.air_conditioning;

import behavioral.state.State;

public class AirConditioningOff implements State {
    private AirConditioning airConditioning;

    public AirConditioningOff(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public void handleChangeMode() {
        System.out.println("Turning air conditioning low!");
        airConditioning.setState(airConditioning.getAirConditioningLow());
    }

    @Override
    public String showInfo() {
        return "Air conditioning is off...";
    }
}
