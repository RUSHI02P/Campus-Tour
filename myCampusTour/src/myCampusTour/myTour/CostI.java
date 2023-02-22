package myCampusTour.myTour;

import myCampusTour.enums.NewEnums.CafeEnum;
import myCampusTour.enums.NewEnums.GiftStoreEnum;
import myCampusTour.enums.NewEnums.LectureEnum;
import myCampusTour.enums.NewEnums.TransportEnums;

public interface CostI {
    public double getTransportCost(TransportEnums mode);
    public double getGiftCost(GiftStoreEnum giftStore);
    public double getLunchPrice(CafeEnum cafePlace);
    public double getLecPrice(LectureEnum lecture);
}
