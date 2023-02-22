package myCampusTour.activity;

import myCampusTour.enums.NewEnums.LectureEnum;

public class AttendLecture implements ActivityInterface {
    LectureEnum lecture;
    double totalCost;
    int totalCalories;
    int totalDuration;
    double totalCO2;

    public AttendLecture(
        LectureEnum lectureAttend,
        double costing,
        int calories,
        int timeDuration,
        double cO2
    ) {
        lecture = lectureAttend;
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
     * @return String this returns a string of the properties of Attending Lecture activity.
     */
    @Override
    public String toString() {
        String result = "Attend lecture: " + lecture.getLecture() + "\n";
        result += "Total cost to attend lecture: $" + totalCost+ "\n";
        result += "Total calories burnt while attending: " + totalCalories+ "\n";
        result += "Total duration to attend lecture: " + totalDuration+ "\n";
        result += "Total carbon footprint while attending lecture: " + totalCO2+ " in tonnes\n";

        return result;
    }
}
