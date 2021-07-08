package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class InputWithTextFile {
    public void inputFromTextFile() throws FileNotFoundException {
        FileReader fr = new FileReader("filename.txt");
        Scanner inFile = new Scanner(fr);
        Parking parking=new Parking();
        while (inFile.hasNext()) {
            String line = inFile.nextLine();
            parking.setParkingLot(line);
        }
        inFile.close();
    }
}
