package com.company;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Parking {
        int siz;
        boolean flag=true,flag2=true;
        ParkingLot parkingLot;



    public void setParkingLot(String line) {
                String choice=line;
                String[] splitChoice=choice.split("\\s");
                if (flag2){
                    if (splitChoice[0].equals("create_parking_lot")){
                        siz=Integer.parseInt(splitChoice[1]);
                        parkingLot=new ParkingLot(siz);
                        System.out.println("Created a parking lot with "+ siz +" slots");
                        flag2=false;
                    }
                    else {
                        System.out.println("Parking lot not initialized");
                    }
                }
                else{
                    switch (splitChoice[0]) {

                        case "park" -> parkingLot.carEntersParkingLot(splitChoice[1], splitChoice[2]);
                        case "leave" -> parkingLot.carLeavesParkinglot(splitChoice[1]);
                        case "slot_numbers_for_cars_with_colour" -> parkingLot.findSlotWithColour(splitChoice[1]);
                        case "slot_number_for_registration_number" -> parkingLot.findSlotWithNumber(splitChoice[1]);
                        case "registration_numbers_for_cars_with_colour" -> parkingLot.findPlateWithColour(splitChoice[1]);
                        case "status" -> parkingLot.displayCarsAvailable();
                        case "exit" -> flag = false;
                        default -> System.out.println("Invalid Option");
                    }

                }
                return;
    }


    private void parkingOperation(){

    }

    }






