package myCampusTour.myTour;

import myCampusTour.enums.NewEnums.BuildingsEnum;
import myCampusTour.enums.NewEnums.CafeEnum;
import myCampusTour.enums.NewEnums.GiftStoreEnum;
import myCampusTour.enums.NewEnums.LectureEnum;
import myCampusTour.enums.NewEnums.TransportEnums;

public interface EffortI {
    //public int getCalories();
    public int getVisitCalories(BuildingsEnum calories);
    public int getTravelCalories(TransportEnums mode);
    public int getGiftCalories(GiftStoreEnum giftShop);
    public int getCafeCalories(CafeEnum cafePlace);
    public int getLectureCalories(LectureEnum whichLec);
}
