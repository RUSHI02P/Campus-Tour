package myCampusTour.campusTourBuilder;

import java.util.ArrayList;


import myCampusTour.activity.ActivityInterface;
import myCampusTour.activity.AttendLecture;
import myCampusTour.activity.EatLunch;
import myCampusTour.activity.GiftPick;
import myCampusTour.activity.VisitBuildingsImpl;
import myCampusTour.enums.NewEnums.BuildingsEnum;
import myCampusTour.enums.NewEnums.CafeEnum;
import myCampusTour.enums.NewEnums.GiftStoreEnum;
import myCampusTour.enums.NewEnums.LectureEnum;
import myCampusTour.enums.NewEnums.TransportEnums;
import myCampusTour.myTour.Activity;
import myCampusTour.util.Results;

public class PlanCampusTour extends CampusTour {
    BuildingsEnum building1;
    BuildingsEnum building2;
    TransportEnums transportMode;
    GiftStoreEnum giftShop;
    CafeEnum cafe;
    LectureEnum lecture;

    ArrayList<ActivityInterface> activitiesList = new ArrayList<>();
    
    ActivityInterface visitBuildings;
    ActivityInterface giftPicking;
    ActivityInterface eatLunch;
    ActivityInterface attendLecture;

    Activity activityMonitor = new Activity();

    Results results = new Results();

    double totalCost=0;
    int totalTime=0;
    int totalCalories=0;
    double totalCO2=0;

    public PlanCampusTour(
        BuildingsEnum buildingName1,
        BuildingsEnum buildingName2,
        TransportEnums mode,
        GiftStoreEnum giftStore,
        CafeEnum cafePlace,
        LectureEnum whichLec) {
            building1 = buildingName1;
            building2 = buildingName2;
            transportMode = mode;
            giftShop=giftStore;
            cafe=cafePlace;
            lecture = whichLec;

        }

        public void visitBuildings(){

            totalCost += activityMonitor.getTransportCost(transportMode);
            double costing = activityMonitor.getTransportCost(transportMode);
            totalTime += (activityMonitor.getBuildingDuration(building1) + activityMonitor.getBuildingDuration(building2) + activityMonitor.getTransportDuration(transportMode));
            int timing = (activityMonitor.getBuildingDuration(building1) + activityMonitor.getBuildingDuration(building2) + activityMonitor.getTransportDuration(transportMode));
            totalCalories += (activityMonitor.getVisitCalories(building1)+ activityMonitor.getVisitCalories(building2) + activityMonitor.getTravelCalories(transportMode));
            int caloriesEffort = (activityMonitor.getVisitCalories(building1)+ activityMonitor.getVisitCalories(building2) + activityMonitor.getTravelCalories(transportMode));
            totalCO2+= activityMonitor.getVisitCO2(building1) + activityMonitor.getVisitCO2(building2) + activityMonitor.getTravelCO2(transportMode);
            double carbonO2 = activityMonitor.getVisitCO2(building1) + activityMonitor.getVisitCO2(building2) + activityMonitor.getTravelCO2(transportMode);

            visitBuildings = new VisitBuildingsImpl(building1, building2, transportMode, costing, caloriesEffort, timing, carbonO2);

            //System.out.println(visitBuildings.toString());

            activitiesList.add(visitBuildings);

        }

        public void pickGift() {
            //System.out.println(String.format("Pick gift from %s taking time of %d minutes", store.getGiftStore(), activityMonitor.getGiftStoreDuration(store)));
            //System.out.println("Gift costs $"+ activityMonitor.getGiftCost(store));
            totalCost += activityMonitor.getGiftCost(giftShop);
            double costing = activityMonitor.getGiftCost(giftShop);
            totalTime += activityMonitor.getGiftStoreDuration(giftShop);
            int timing = activityMonitor.getGiftStoreDuration(giftShop);
            totalCalories += activityMonitor.getGiftCalories(giftShop);
            int caloriesEffort = activityMonitor.getGiftCalories(giftShop);
            totalCO2 += activityMonitor.getGiftShopCO2(giftShop);
            double carbonO2 = activityMonitor.getGiftShopCO2(giftShop);

            giftPicking = new GiftPick(giftShop, costing, caloriesEffort, timing, carbonO2);

            //System.out.println(giftPicking.toString());

            activitiesList.add(giftPicking);
        }

        public void eatAt() {
            //System.out.println(String.format("Eat at %s for $%.2f", cafe.getCafePlace(), activityMonitor.getLunchPrice(cafe)));
            totalCost += activityMonitor.getLunchPrice(cafe);
            double costing = activityMonitor.getLunchPrice(cafe);
            totalTime += activityMonitor.getLunchTimeDuration(cafe);
            int timings = activityMonitor.getLunchTimeDuration(cafe);
            totalCalories += activityMonitor.getCafeCalories(cafe);
            int caloriesEfforts = activityMonitor.getCafeCalories(cafe);
            totalCO2 += activityMonitor.getCafeCO2(cafe);
            double carbonO2 = activityMonitor.getCafeCO2(cafe);

            eatLunch = new EatLunch(cafe, costing, caloriesEfforts, timings, carbonO2);

            //System.out.println(eatLunch.toString());

            activitiesList.add(eatLunch);

        }

        public void attendLec() {
            //System.out.println(String.format("Attend lec %s for $%.2f", attendLec.getWhichLecture(), activityMonitor.getLecPrice(attendLec)));
            totalCost += activityMonitor.getLecPrice(lecture);
            double costing = activityMonitor.getLecPrice(lecture);
            totalTime += activityMonitor.getLectureDuration(lecture);
            int timing = activityMonitor.getLectureDuration(lecture);
            totalCalories += activityMonitor.getLectureCalories(lecture);
            int caloriesEfforts = activityMonitor.getLectureCalories(lecture);
            totalCO2 += activityMonitor.getLectureCO2(lecture);
            double carbonO2 = activityMonitor.getLectureCO2(lecture);

            attendLecture = new AttendLecture(lecture, costing, caloriesEfforts, timing, carbonO2);

            //System.out.println(attendLecture.toString());

            activitiesList.add(attendLecture);
            
        }

        public void printItinerary() {
            results.printItinerary(activitiesList);

            System.out.println(
                "Buildings to visit: " + building1.getBuildingName() + " and " + building2.getBuildingName() 
            );
            System.out.println(
                "Pick Gift from: " + giftShop.getGiftShop()
            );
            System.out.println(
                "Eat Lunch at: " + cafe.getCafe()
            );
            System.out.println(
                "Attend Lecture: " + lecture.getLecture()
            );
            System.out.println(String.format("Total Cost of the Tour: $%.2f", totalCost));
            System.out.println("Total Duration of the Tour: "+totalTime + " minutes");
            System.out.println("Total Calories burnt during the Tour: "+totalCalories);
            System.out.println(String.format("Total Carbon Footprint of the Tour: %.2f in tonnes", totalCO2));
        }
}
