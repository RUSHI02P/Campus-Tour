package myCampusTour.enums.NewEnums;

public enum GiftStoreEnum {
    EVENTS_CENTER("Events Center gift store", 7, 35, 0.15, 35.00),
    UNIV_UNION("University Union gift store", 5, 25, 0.05, 45.00);
    private String giftShop;
    private int minutes;
    private int calories;
    private double carbonFootprint;
    private double price;
    private GiftStoreEnum(String store,int duration, int caloriesBurnt, double carbonCO2, double cost) {
        giftShop = store;
        minutes = duration;
        calories = caloriesBurnt;
        carbonFootprint = carbonCO2;
        price = cost;
    }

    public String getGiftShop() {
        return giftShop;
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

    public double getGiftCost() {
        return price;
    }
}
