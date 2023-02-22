package myCampusTour.builderWorkshop;

import myCampusTour.campusTourBuilder.CampusTour;

public class CampusTourBuilderWorkshop implements BuilderWorkshopI {
    /***
     * @param CampusTour This takes CampusTour Interface as parameter.
     * @return void
     */
    public void construct(CampusTour campusTour) {
        campusTour.visitBuildings();
        campusTour.pickGift();
        campusTour.eatAt();
        campusTour.attendLec();
        campusTour.printItinerary();
    }

}
