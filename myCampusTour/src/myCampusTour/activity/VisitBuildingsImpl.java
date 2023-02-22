package myCampusTour.activity;

import myCampusTour.enums.NewEnums.BuildingsEnum;
import myCampusTour.enums.NewEnums.TransportEnums;
import myCampusTour.util.MyLogger;
import myCampusTour.util.MyLogger.DebugLevel;

public class VisitBuildingsImpl implements ActivityInterface {
    BuildingsEnum building1;
    BuildingsEnum building2;
    TransportEnums transport;
    double totalCost;
    int totalCalories;
    int totalDuration;
    double totalCO2;

    public VisitBuildingsImpl(
        BuildingsEnum bldName1,
        BuildingsEnum bldName2,
        TransportEnums mode,
        double costing,
        int calories,
        int timeDuration,
        double cO2
    ) {
        building1 = bldName1;
        building2 = bldName2;
        transport = mode;
        totalCost = costing;
        totalCalories = calories;
        totalDuration = timeDuration;
        totalCO2 = cO2;
        
        String loggerString = "Logging Inside VisitBuilding Activity class\n";
        loggerString += toString();

        MyLogger.writeMessage(loggerString, DebugLevel.VISITBUILDING);
    }

    /***
     * @param None
     * @return void
     */
    public void printAllAttributes() {
        System.out.println(
            "Total cost to visit buildings: $" + totalCost + "\n" +
            "Total calories burnt to visit buildings: " + totalCalories + "\n" + 
            "Total duration to visit buildings: " + totalDuration + "\n" +
            "Total carbon footprint to visit buildings: " + totalCO2 + " in tonnes\n"
        );
    }

    /**
     * @return String this returns a string of the properties of Visiting building activity.
     */
    @Override
    public String toString() {
        String result = "Buildings to visit: " + building1.getBuildingName() + " and " + building2.getBuildingName() + "\n";
        result += "Travel mode: " + transport.getTransportMode() + "\n";
        result += "Total cost to visit buildings: $" + totalCost + "\n";
        result += "Total calories burnt to visit buildings: " + totalCalories + "\n";
        result += "Total duration to visit buildings: " + totalDuration + "\n";
        result += "Total carbon footprint to visit buildings: " + totalCO2 + " in tonnes\n";

        return result;
    }

}
