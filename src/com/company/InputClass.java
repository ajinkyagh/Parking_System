package com.company;

import java.util.Scanner;

public class InputClass {

        Scanner sc=new Scanner(System.in);
        int opt,siz;
        boolean flag=true,flag2=true;
        public void performParkingOperation(ParkingLot parkingLot){
            while (flag){
                String choice=sc.nextLine();
                String[] splitChoice=choice.split("\\s");
                if (flag2){
                    if (splitChoice[0].equals("create_parking_lot"));{
                        siz=Integer.parseInt(splitChoice[1]);
                        System.out.println("Created a parking lot with "+ siz +" slots");
                        flag2=false;
                    }
                }
                else{
                    switch (splitChoice[0]){
                        case "park": parkingLot.carEntersParkingLot(splitChoice[1],splitChoice[2],siz);
                            break;
                        case "leave":parkingLot.carLeavesParkinglot(splitChoice[1]);
                            break;
                        case "slot_numbers_for_cars_with_colour": parkingLot.findSlotWithColour(splitChoice[1]);
                            break;
                        case "slot_number_for_registration_number":parkingLot.findSlotWithNumber(splitChoice[1]);
                            break;
                        case "registration_numbers_for_cars_with_colour":parkingLot.findPlateWithColour(splitChoice[1]);
                            break;
                        case "exit":flag=false;
                            break;
                        default:
                            System.out.println("Invalid Option");
                    }

                }

                /*System.out.println("Do you want to continue(0/1)");
                opt= Integer.parseInt(sc.nextLine());*/
            };
        }


}
