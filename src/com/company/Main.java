package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        InputClass inputClass=new InputClass();
        ParkingLot parkingLot=new ParkingLot();
        inputClass.performParkingOperation(parkingLot);

    }
}
