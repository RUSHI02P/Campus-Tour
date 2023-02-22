package myCampusTour.driver;

import java.io.File;

import myCampusTour.builderWorkshop.BuilderWorkshopI;
import myCampusTour.builderWorkshop.CampusTourBuilderWorkshop;
import myCampusTour.campusTourBuilder.CampusTour;
import myCampusTour.campusTourBuilder.PlanCampusTour;
import myCampusTour.enums.NewEnums.BuildingsEnum;
import myCampusTour.enums.NewEnums.CafeEnum;
import myCampusTour.enums.NewEnums.GiftStoreEnum;
import myCampusTour.enums.NewEnums.LectureEnum;
import myCampusTour.enums.NewEnums.TransportEnums;
import myCampusTour.util.ErrorLog;
import myCampusTour.util.MyLogger;

/**
 * @author Rushi Patel
   @email  rpatel99@binghamton.edu
 *
 */
public class Driver {
	public static void main(String[] args) {

		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */

	    if (args.length != 2 || args[0].equals("${arg0}") || args[1].equals("${arg1}")) {

			System.err.println("Error: Incorrect number of arguments. Program accepts 2 argumnets.");
			System.exit(0);
		}

		System.out.println("Hello World! Lets get started with the assignment\n");

		ErrorLog errorLog = new ErrorLog();
		File errorFile = new File(args[0]);

		int debug_value;
		try {
			debug_value = Integer.parseInt(args[1]);
			MyLogger.setDebugValue(debug_value);
		} catch (NumberFormatException err) {
			System.out.println(err.toString());
			errorLog.logError(err.toString(), errorFile);
		}

		System.out.println("\n****************** Student 1 Itinerary ******************\n");

		CampusTour campusTour1 = new PlanCampusTour(
									BuildingsEnum.WATSON, 
									BuildingsEnum.SCIENCE_LIBRARY, 
									TransportEnums.ON_FOOT, 
									GiftStoreEnum.EVENTS_CENTER, 
									CafeEnum.MOUNTAIN_VIEW, 
									LectureEnum.CS542_IN_CLASS);
		BuilderWorkshopI workshop1 = new CampusTourBuilderWorkshop();
		workshop1.construct(campusTour1);

		System.out.println("\n*********************************************************\n");

		System.out.println("\n****************** Student 2 Itinerary ******************\n");

		CampusTour campusTour2 = new PlanCampusTour(
									BuildingsEnum.BIOMEDICAL, 
									BuildingsEnum.SOM, 
									TransportEnums.BUS_RIDE, 
									GiftStoreEnum.UNIV_UNION, 
									CafeEnum.CIW, 
									LectureEnum.CS540_ONLINE);
		BuilderWorkshopI workshop2 = new CampusTourBuilderWorkshop();
		workshop2.construct(campusTour2);

		System.out.println("\n*********************************************************\n");

	}
}
