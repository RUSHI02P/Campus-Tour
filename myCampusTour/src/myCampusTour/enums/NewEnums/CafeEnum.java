package myCampusTour.enums.NewEnums;

public enum CafeEnum {
    CIW("College in the Woods", 25, 55, 0.2, 15.99),
    MOUNTAIN_VIEW("Mountain View", 12, 15, 0.10, 15.99);
    private String cafe;
    private int minutes;
    private int calories;
    private double carbonFootprint;
    private double price;
    private CafeEnum(String cafePlace,int duration, int caloriesBurnt, double carbonCO2, double cost) {
        cafe = cafePlace;
        minutes = duration;
        calories = caloriesBurnt;
        carbonFootprint = carbonCO2;
        price = cost;
    }

    public String getCafe() {
        return cafe;
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

    public double getLunchCost() {
        return price;
    }
}
