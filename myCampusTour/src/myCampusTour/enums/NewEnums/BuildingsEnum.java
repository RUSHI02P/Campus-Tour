package myCampusTour.enums.NewEnums;

public enum BuildingsEnum {
    WATSON("Watson Institute", 10, 120, 0.2, 0),
    SOM("School of Management", 8, 100, 0.1, 0),
    SCIENCE_LIBRARY("Science 1", 12, 130, 0.05, 0),
    ART_MUSEUM("Binghamton Art Museum", 15, 150, 0.15, 0),
    BIOMEDICAL("Institute of Biomedical Technology", 7, 80, 0.3, 0);
    private String bldName;
    private int minutes;
    private int calories;
    private double carbonFootprint;
    private double price;
    private BuildingsEnum(String name,int duration, int caloriesBurnt, double carbonCO2, double cost) {
        bldName = name;
        minutes = duration;
        calories = caloriesBurnt;
        carbonFootprint = carbonCO2;
        price = cost;
    }

    public String getBuildingName() {
        return bldName;
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

    public double getBuildingCost() {
        return price;
    }

}