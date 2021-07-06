package com.company;

import java.util.Scanner;

public class InputClass {

        Scanner sc=new Scanner(System.in);
        int opt;
        public void performParkingOperation(ParkingLot parkingLot){
            do {
                System.out.println("1.Park Car into parking(Enter 1)");
                System.out.println("2.Remove Car from the parking(Enter 2)");
                System.out.println("3.Find slot number with Colour(Enter 3)");
                System.out.println("4.Find slot number with Registration Number(Enter 4)");
                String choice=sc.nextLine();
                String[] splitChoice=choice.split("\\s");
                if(splitChoice[0].equals("park"))
                {
                    parkingLot.carEntersParkingLot(splitChoice[1],splitChoice[2]);
                }
                else if (splitChoice[0].equals("leave"))
                {
                    parkingLot.carLeavesParkinglot(splitChoice[1]);
                }
                else if (splitChoice[0].equals("slot_numbers_for_cars_with_colour"))
                {
                    parkingLot.findSlotWithColour(splitChoice[1]);
                }
                else if (splitChoice[0].equals("slot_number_for_registration_number"))
                {
                    parkingLot.findSlotWithNumber(splitChoice[1]);
                }
                else if (splitChoice[0].equals("registration_numbers_for_cars_with_colour"))
                {
                   parkingLot.findPlateWithColour(splitChoice[1]);
                }
                System.out.println();
                /*printCarStatus();*/
                System.out.println("Do you want to continue(0/1)");
                opt= Integer.parseInt(sc.nextLine());
            }while (opt!=0);
        }


}
