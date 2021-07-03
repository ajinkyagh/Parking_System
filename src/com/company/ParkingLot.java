package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ParkingLot {
    private HashMap<Integer,String> carPlate =new HashMap<Integer,String>();
    private HashMap<Integer,String>  carColour=new HashMap<Integer,String>();
    private ArrayList<Integer> arrayList=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    int capacity=1,slot,opt=0,choice;
    public void createParkingLot(){
        do {
            System.out.println("1.Park Car into parking(Enter 1)");
            System.out.println("2.Remove Car from the parking(Enter 2)");
            System.out.println("3.Find slot number with Colour(Enter 3)");
            System.out.println("4.Find slot number with Registration Number(Enter 4)");
            choice= Integer.parseInt(sc.nextLine());
            if(choice==1)
            {
                carEntersParkingLot();
            }
            else if (choice==2)
            {
               carLeavesParkinglot();
            }
            else if (choice==3)
            {
                findSlotWithColour();
            }
            else if (choice==4)
            {
                findSlotWithNumber();
            }
            printCarStatus();
            System.out.println("Do you want to continue(0/1)");
            opt= Integer.parseInt(sc.nextLine());
        }while (opt!=0);
    }

    private void findSlotWithNumber() {
        System.out.println("Enter number to be searched");
        String numbertoSearch=sc.nextLine();
        if(carPlate.containsValue(numbertoSearch)){
            carPlate.forEach((key, value) -> {
                if (value.equals(numbertoSearch)) {
                    System.out.println(key);
                }
            });
        }
        else{
            System.out.println("Car not found");
        }

    }

    private void findSlotWithColour() {
        System.out.println("Enter colour to be searched");
        String colourtoSearch=sc.nextLine();
        if(carColour.containsValue(colourtoSearch)){
            carColour.forEach((key, value) -> {
                if (value.equals(colourtoSearch)) {
                    System.out.println(key);
                }
            });
        }
        else{
            System.out.println("Car not found");
        }
    }

    private void carEntersParkingLot(){
        if (capacity!=7 && arrayList.isEmpty()){
            System.out.println("Enter number plate");
            String numberPlate=sc.nextLine();
            System.out.println("Enter car colour");
            String colour=sc.nextLine();
            carPlate.put(capacity,numberPlate);
            carColour.put(capacity,colour);
            System.out.println("Allocated slot number:"+capacity);
            capacity++;
        }
        else if (!arrayList.isEmpty() && capacity!=7){
            System.out.println("Enter number plate");
            String numberPlate=sc.nextLine();
            System.out.println("Enter car colour");
            String colour=sc.nextLine();
            carPlate.put(arrayList.get(0),numberPlate);
            carColour.put(arrayList.get(0),colour);
            System.out.println("Allocated slot number:"+arrayList.get(0));
            arrayList.remove(0);
            capacity++;
        }
        else {
            System.out.println("Sorry,Parking lot is full");
        }
    }

    private void carLeavesParkinglot(){
        System.out.println("Enter the slot from which the car exits");
        slot= Integer.parseInt(sc.nextLine());
        carPlate.remove(slot);
        carColour.remove(slot);
        arrayList.add(slot);
        Collections.sort(arrayList);
        capacity--;
    }

    public void printCarStatus(){
        System.out.println(carPlate);
        System.out.println(carColour);
    }

}
