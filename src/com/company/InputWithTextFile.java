package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class InputWithTextFile {
    private static String textFile ;
    private static int argsLength;
    private static ParkingLotFileWriter parkingLotFileWriter;

    public InputWithTextFile(String textFile, int argsLength, ParkingLotFileWriter parkingLotFileWriter){
        this.textFile=textFile;
        this.argsLength=argsLength;
        this.parkingLotFileWriter = parkingLotFileWriter;
    }
    public static void inputFromTextFile() throws FileNotFoundException {
        FileReader fr = new FileReader(textFile);
        Scanner inFile = new Scanner(fr);
        Parking parking=new Parking(argsLength,parkingLotFileWriter);
        while (inFile.hasNext()) {
            String line = inFile.nextLine();
            parking.performOperations(line);
        }
        inFile.close();

    }
}
