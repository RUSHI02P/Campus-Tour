package myCampusTour.enums.NewEnums;

public enum TransportEnums {
    ON_FOOT("by walking", 12, 135, 0.0, 1),
    BUS_RIDE("take a bus ride", 5, 30, 0.1, 3);
    private String modeTransport;
    private int minutes;
    private int calories;
    private double carbonFootprint;
    private double price;
    private TransportEnums(String mode,int duration, int caloriesBurnt, double carbonCO2, double cost) {
        modeTransport = mode;
        minutes = duration;
        calories = caloriesBurnt;
        carbonFootprint = carbonCO2;
        price = cost;
    }

    public String getTransportMode() {
        return modeTransport;
    }
    
    public int getDurationMins() {
        return minutes;
    }

    public int getCaloriesBurnt() {
        return calories;
    }

    public double getCO2() {
        return carbonFootprint;
    }

    public double getTransportCost() {
        return price;
    }
}
