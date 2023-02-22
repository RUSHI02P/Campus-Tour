package myCampusTour.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ErrorLog implements FileDisplayInterface {
    public void logError(String mesString, File errorFile) {
        try {
            FileWriter fileWriter = new FileWriter(errorFile, true);
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
            bufferWriter.write(mesString);
            bufferWriter.newLine();
            bufferWriter.close();
            fileWriter.close();

        } catch (IOException err) {
            System.out.println(err);
            String errMessage = err.toString() + " : " + err.getStackTrace()[4];
            printError(errMessage.toString());
        } finally {
            System.out.println("Error Occured: " + mesString);
        }
    }

    public void printError(String errMessage) {
        System.out.println("Program exited with error: " + errMessage);
        System.out.println("Check errors in the errorLog.txt");
        System.exit(0);
    }
}
