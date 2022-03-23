package behavioral.state.air_conditioning;

import behavioral.state.State;

public class AirConditioning {
    private AirConditioningHigh airConditioningHigh;
    private AirConditioningMedium airConditioningMedium;
    private AirConditioningLow airConditioningLow;
    private AirConditioningOff airConditioningOff;

    private State state;

    public AirConditioning() {
        airConditioningHigh = new AirConditioningHigh(this);
        airConditioningMedium = new AirConditioningMedium(this);
        airConditioningLow = new AirConditioningLow(this);
        airConditioningOff = new AirConditioningOff(this);

        state = airConditioningOff;
    }

    public String getInfo() {
        return state.showInfo();
    }

    public void changeMode() {
        state.handleChangeMode();
    }

    public AirConditioningHigh getAirConditioningHigh() {
        return airConditioningHigh;
    }

    public AirConditioningMedium getAirConditioningMedium() {
        return airConditioningMedium;
    }

    public AirConditioningLow getAirConditioningLow() {
        return airConditioningLow;
    }

    public AirConditioningOff getAirConditioningOff() {
        return airConditioningOff;
    }

    public void setState(State state) {
        this.state = state;
    }
}
