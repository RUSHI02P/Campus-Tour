-----------------------------------------------------------------------
## Instruction to clean:

#### Command: ant -buildfile myCampusTour/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

#### Command: ant -buildfile myCampusTour/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

#### Command: ant -buildfile myCampusTour/src/build.xml run -Darg0=<campusTourError.txt> -Darg1=<DEBUG_VALUE> 

## you can run it in the following manner:

ant -buildfile myCampusTour/src/build.xml run -Darg0=campusTourError.txt -Darg1=2

Note: Arguments accept the absolute path of the files.

-----------------------------------------------------------------------
## Description:
Used Builder pattern to create an Itinerary for Campus Tour.
 Activities:
  - Visit Buildings: Student visits two university buildings via bus or walking.
  - Gift Pick: Student picks a gift from either gift store in the university.
  - Eat Lunch: Student eats lunch at either cafes by waiting in queue or online.
  - Attend Lecture: Student either attends in class lecture or online lecture.

 Enums:
  - Building Names Enum
  - Cafe Enums
  - Gift Store Enums
  - Lecture Enums
  - Transportation Enums
 
 CampusTourBuilderWorkshop: Implements BuiderWorkshopI interface that has construct method to create and call all the activities.

 PlanCampusTour: extends CampusTour abstract class that has methods to visit buildings, pick gifts, eat lunch, attend lecture.

 Data Structure: ArrayList to store all the activities.

 Results class: contains printItinerary method that prints all the activities with details in the terminal.





