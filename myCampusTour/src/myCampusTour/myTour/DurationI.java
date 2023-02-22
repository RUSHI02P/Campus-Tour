package myCampusTour.myTour;

import myCampusTour.enums.NewEnums.BuildingsEnum;
import myCampusTour.enums.NewEnums.CafeEnum;
import myCampusTour.enums.NewEnums.GiftStoreEnum;
import myCampusTour.enums.NewEnums.LectureEnum;
import myCampusTour.enums.NewEnums.TransportEnums;

public interface DurationI {
    //public int getDuration();
    public int getBuildingDuration(BuildingsEnum building);
    public int getTransportDuration(TransportEnums mode);
    public int getGiftStoreDuration(GiftStoreEnum giftSrtore);
    public int getLunchTimeDuration(CafeEnum cafePlace);
    public int getLectureDuration(LectureEnum whichLecture);
}
