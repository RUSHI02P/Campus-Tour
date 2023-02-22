package myCampusTour.myTour;

import myCampusTour.enums.NewEnums.BuildingsEnum;
import myCampusTour.enums.NewEnums.CafeEnum;
import myCampusTour.enums.NewEnums.GiftStoreEnum;
import myCampusTour.enums.NewEnums.LectureEnum;
import myCampusTour.enums.NewEnums.TransportEnums;

public class Activity implements CostI, DurationI, EffortI, CarbonFootprintI {

    public double getTransportCost(TransportEnums mode) {
        return mode.getTransportCost();
    }

    public double getGiftCost(GiftStoreEnum giftStore) {
        return giftStore.getGiftCost();
    }

    public double getLunchPrice(CafeEnum cafePlace) {
        return cafePlace.getLunchCost();
    }

    public double getLecPrice(LectureEnum lecture) {
        return lecture.getLectureCost();
    }

    public int getBuildingDuration(BuildingsEnum building) {
        return building.getDurationMins();
    }

    public int getTransportDuration(TransportEnums mode) {
        return mode.getDurationMins();
    }

    public int getGiftStoreDuration(GiftStoreEnum giftStore) {
        return giftStore.getDurationMins();
    }

    public int getLunchTimeDuration(CafeEnum cafePlace) {
        return cafePlace.getDurationMins();
    }

    public int getLectureDuration(LectureEnum whichLecture) {
        return whichLecture.getDurationMins();
    }

    public int getVisitCalories(BuildingsEnum calories) {
        return calories.getCaloriesBurnt();
    }

    public int getTravelCalories(TransportEnums mode) {
        return mode.getCaloriesBurnt();
    }

    public int getGiftCalories(GiftStoreEnum giftShop) {
        return giftShop.getCaloriesBurnt();
    }

    public int getCafeCalories(CafeEnum cafePlace) {
        return cafePlace.getCaloriesBurnt();
    }

    public int getLectureCalories(LectureEnum whichLec) {
        return whichLec.getCaloriesBurnt();
    }

    public double getVisitCO2(BuildingsEnum buildings) {
        return buildings.getCO2();
    }

    public double getTravelCO2(TransportEnums mode) {
        return mode.getCO2();
    }

    public double getGiftShopCO2(GiftStoreEnum store) {
        return store.getCO2();
    }

    public double getCafeCO2(CafeEnum cafe) {
        return cafe.getCO2();
    }

    public double getLectureCO2(LectureEnum lecture) {
        return lecture.getCO2();
    }
}
