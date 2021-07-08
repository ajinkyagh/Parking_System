package com.company;

import java.util.Scanner;

public class InputWithConsole {
    public void inputFromConsole(){
        Parking parking=new Parking();
        Scanner sc=new Scanner(System.in);
        String input ;
        while (true){
             input=sc.nextLine();
            parking.setParkingLot(input);
        }

    }
}



        /*  while (flag){
                String choice=line;
                String[] splitChoice=choice.split("\\s");
                if (flag2){
                    if (splitChoice[0].equals("create_parking_lot"));{
                        siz=Integer.parseInt(splitChoice[1]);
                        System.out.println("Created a parking lot with "+ siz +" slots");
                        flag2=false;
                    }
                }
                else{
                    switch (splitChoice[0]) {
                        case "park" -> parkingLot.carEntersParkingLot(splitChoice[1], splitChoice[2], siz);
                        case "leave" -> parkingLot.carLeavesParkinglot(splitChoice[1]);
                        case "slot_numbers_for_cars_with_colour" -> parkingLot.findSlotWithColour(splitChoice[1]);
                        case "slot_number_for_registration_number" -> parkingLot.findSlotWithNumber(splitChoice[1]);
                        case "registration_numbers_for_cars_with_colour" -> parkingLot.findPlateWithColour(splitChoice[1]);
                        case "status" -> parkingLot.displayCarsAvailable();
                        case "exit" -> flag = false;
                        default -> System.out.println("Invalid Option");
                    }

                }
              }
            }

    }
}*/
