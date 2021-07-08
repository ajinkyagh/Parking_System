package com.company;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        InputWithTextFile inputWithTextFile=new InputWithTextFile();
//        inputWithTextFile.inputFromTextFile();

        InputWithConsole inputWithConsole=new InputWithConsole();
        inputWithConsole.inputFromConsole();



    }
}
