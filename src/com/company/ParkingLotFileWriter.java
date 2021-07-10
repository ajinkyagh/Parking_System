package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class ParkingLotFileWriter implements OutputWriter{
    private final String fileName;

    public ParkingLotFileWriter(String arg) {
        this.fileName=arg;
    }

    @Override
    public void write(String output) {
        try {
            FileWriter myWriter = new FileWriter(fileName,true);
            myWriter.write(output+"\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
