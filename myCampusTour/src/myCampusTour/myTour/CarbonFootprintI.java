package myCampusTour.myTour;

import myCampusTour.enums.NewEnums.BuildingsEnum;
import myCampusTour.enums.NewEnums.CafeEnum;
import myCampusTour.enums.NewEnums.GiftStoreEnum;
import myCampusTour.enums.NewEnums.LectureEnum;
import myCampusTour.enums.NewEnums.TransportEnums;

public interface CarbonFootprintI {
    //public double getCO2();
    public double getVisitCO2(BuildingsEnum building);
    public double getTravelCO2(TransportEnums mode);
    public double getGiftShopCO2(GiftStoreEnum store);
    public double getCafeCO2(CafeEnum cafe);
    public double getLectureCO2(LectureEnum lecture);
}