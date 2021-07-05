package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ParkingLot {
    private HashMap<Integer,Car> car= new HashMap<>();
    private HashMap<Integer,String> carPlate =new HashMap<Integer,String>();
    private HashMap<Integer,String>  carColour=new HashMap<Integer,String>();
    private ArrayList<Integer> arrayList=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    int capacity=1,opt=0;
    String choice;
    public void createParkingLot(){
        do {
            System.out.println("1.Park Car into parking(Enter 1)");
            System.out.println("2.Remove Car from the parking(Enter 2)");
            System.out.println("3.Find slot number with Colour(Enter 3)");
            System.out.println("4.Find slot number with Registration Number(Enter 4)");
            choice=sc.nextLine();
            String[] splitChoice=choice.split("\\s");
            if(splitChoice[0].equals("park"))
            {
                carEntersParkingLot(splitChoice[1],splitChoice[2]);
            }
            else if (splitChoice[0].equals("leave"))
            {
               carLeavesParkinglot(splitChoice[1]);
            }
            else if (splitChoice[0].equals("slot_numbers_for_cars_with_colour"))
            {
                findSlotWithColour(splitChoice[1]);
            }
            else if (splitChoice[0].equals("slot_number_for_registration_number"))
            {
                findSlotWithNumber(splitChoice[1]);
            }
            else if (splitChoice[0].equals("registration_numbers_for_cars_with_colour"))
            {
                findPlateWithColour(splitChoice[1]);
            }
            System.out.println();
            /*printCarStatus();*/
            System.out.println("Do you want to continue(0/1)");
            opt= Integer.parseInt(sc.nextLine());
        }while (opt!=0);
    }

    private void findPlateWithColour(String s) {
        car.forEach((key, value) -> {
            if (value.colour.equals(s)) {
                System.out.println(value.plate);
            }
            else{
                System.out.println("Car not found");
            }
        });
    }

    private void findSlotWithNumber(String numbertoSearch) {
            car.forEach((key, value) -> {
                if (value.plate.equals(numbertoSearch)) {
                    System.out.println(key);
                }
                else{
                    System.out.println("Car not found");
                }
            });



    }

    private void findSlotWithColour(String colourtoSearch) {

            car.forEach((key, value) -> {
                if (value.colour.equals(colourtoSearch)) {
                    System.out.println(key);
                }
                else{
                    System.out.println("Car not found");
                }
            });

    }

    private void carEntersParkingLot(String number,String colour){
        if (capacity!=7 && arrayList.isEmpty()){
            Car vehicle=new Car(number,colour);
            car.put(capacity,vehicle);
            System.out.println(vehicle.plate+" "+vehicle.colour);
            /*carPlate.put(capacity,number);
            carColour.put(capacity,colour);*/
            System.out.println("Allocated slot number:"+capacity);
            capacity++;
        }
        else if (!arrayList.isEmpty() && capacity!=7){
            Car vehicle=new Car(number,colour);
            car.put(arrayList.get(0),vehicle);
            System.out.println(vehicle.plate+" "+vehicle.colour);
            /*carPlate.put(arrayList.get(0),number);
            carColour.put(arrayList.get(0),colour);*/
            System.out.println("Allocated slot number:"+arrayList.get(0));
            arrayList.remove(0);
            capacity++;
        }
        else {
            System.out.println("Sorry,Parking lot is full");
        }
    }

    private void carLeavesParkinglot(String slot){
        int slotToInt=Integer.parseInt(slot);
        car.remove(slotToInt);
        /*carColour.remove(slotToInt);
        carPlate.remove(slotToInt);*/
        arrayList.add(slotToInt);
        Collections.sort(arrayList);
        capacity--;
    }

    public void printCarStatus(){
        System.out.println(carPlate);
        System.out.println(carColour);
    }

}
