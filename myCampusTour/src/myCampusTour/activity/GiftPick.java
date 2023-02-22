package myCampusTour.activity;

import myCampusTour.enums.NewEnums.GiftStoreEnum;
import myCampusTour.util.MyLogger;
import myCampusTour.util.MyLogger.DebugLevel;

public class GiftPick implements ActivityInterface {
    GiftStoreEnum giftShop;
    double totalCost;
    int totalCalories;
    int totalDuration;
    double totalCO2;

    public GiftPick(
        GiftStoreEnum giftStore,
        double costing,
        int calories,
        int timeDuration,
        double cO2
    ) {
        giftShop = giftStore;
        totalCost = costing;
        totalCalories = calories;
        totalDuration = timeDuration;
        totalCO2 = cO2;

        String loggerString = "Logging Inside GiftPick Activity class\n";
        loggerString += toString();

        MyLogger.writeMessage(loggerString, DebugLevel.GIFTPICK);
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
     * @return String this returns a string of the properties of Picking Gift activity.
     */
    @Override
    public String toString() {
        String result = "Gifts to pick from: " + giftShop.getGiftShop() + "\n";
        result += "Total cost to pick gifts: $" + totalCost+ "\n";
        result += "Total calories burnt while picking gifts: " + totalCalories+ "\n";
        result += "Total duration to pick gifts: " + totalDuration+ "\n";
        result += "Total carbon footprint while picking gifts: " + totalCO2+ " in tonnes\n";

        return result;
    }
}
