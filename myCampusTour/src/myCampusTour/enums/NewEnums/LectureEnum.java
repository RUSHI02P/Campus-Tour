package myCampusTour.enums.NewEnums;

public enum LectureEnum {
    CS542_IN_CLASS("CS542 in-class", 55, 20, 0.07, 30),
    CS540_ONLINE("CS540 online", 65, 20, 0.03, 30);
    private String attendLechow;
    private int minutes;
    private int calories;
    private double carbonFootprint;
    private double price;
    private LectureEnum(String whichLec,int duration, int caloriesBurnt, double carbonCO2, double cost) {
        attendLechow = whichLec;
        minutes = duration;
        calories = caloriesBurnt;
        carbonFootprint = carbonCO2;
        price = cost;
    }

    public String getLecture() {
        return attendLechow;
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

    public double getLectureCost() {
        return price;
    }
}
