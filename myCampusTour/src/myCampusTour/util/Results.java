package myCampusTour.util;

import java.io.File;
import java.util.ArrayList;

import myCampusTour.activity.ActivityInterface;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {
	
    public void printItinerary(ArrayList<ActivityInterface> activitiesList) {
        for(int i=0;i<activitiesList.size();i++) {
            System.out.println(activitiesList.get(i).toString());
        }
    }

    public void logError(String mesString, File errorFile) {
        
    }
}
