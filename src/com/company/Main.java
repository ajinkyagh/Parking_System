package com.company;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        InputWithTextFile inputWithTextFile;
        InputWithConsole inputWithConsole=new InputWithConsole(args.length);
        OutputWriter writer;

        if (args.length!=0){
            inputWithTextFile=new InputWithTextFile(args[0],args.length,new ParkingLotFileWriter(args[1]));
            inputWithTextFile.inputFromTextFile();
        }
        else {
            inputWithConsole.inputFromConsole();
        }



    }
}
