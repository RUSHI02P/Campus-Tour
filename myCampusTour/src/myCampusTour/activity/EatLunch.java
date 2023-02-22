package myCampusTour.activity;

import myCampusTour.enums.NewEnums.CafeEnum;

public class EatLunch implements ActivityInterface {
    CafeEnum cafe;
    double totalCost;
    int totalCalories;
    int totalDuration;
    double totalCO2;

    public EatLunch(
        CafeEnum cafePlace,
        double costing,
        int calories,
        int timeDuration,
        double cO2
    ) {
        cafe = cafePlace;
        totalCost = costing;
        totalCalories = calories;
        totalDuration = timeDuration;
        totalCO2 = cO2;
    }

    public void printAllAttributes() {
        System.out.println(
            "Total cost to visit buildings: $" + totalCost + "\n" +
            "Total calories burnt to visit buildings: " + totalCalories + "\n" + 
            "Total duration to visit buildings: " + totalDuration + "\n" +
            "Total carbon footprint to visit buildings: " + totalCO2 + " in tonnes\n"
        );
    }

    /**
     * @return String this returns a string of the properties of Eating Lunch activity.
     */
    @Override
    public String toString() {
        String result = "Eat lunch at: " + cafe.getCafe() + "\n";
        result += "Total cost to order lunch: $" + totalCost+ "\n";
        result += "Total calories burnt while ordering: " + totalCalories+ "\n";
        result += "Total duration to order lunch: " + totalDuration+ "\n";
        result += "Total carbon footprint while ordering lunch: " + totalCO2+ " in tonnes\n";

        return result;
    }
}
