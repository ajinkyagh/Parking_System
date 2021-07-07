package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class ParkingLot  {
    private HashMap<Integer,Car> parkingLot = new HashMap<>();
    private final ArrayList<Integer> arrayList=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    int capacity=1,opt=0;

    public void setParkingLot(HashMap<Integer, Car> parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void findPlateWithColour(String s) {
        AtomicBoolean flag= new AtomicBoolean(true);
        parkingLot.forEach((key, value) -> {
            if (value.getColour().equals(s)) {
                System.out.print(value.getPlate()+",");
                flag.set(false);
            }

        });
        if(flag.get()){
            System.out.println("Not found");
            flag.set(true);

        }
    }

    public void findSlotWithNumber(String numbertoSearch) {
        AtomicBoolean flag= new AtomicBoolean(true);
            parkingLot.forEach((key, value) -> {
                if (value.getPlate().equals(numbertoSearch)) {
                    System.out.print(key+",");
                    flag.set(false);
                }


            });

        if(flag.get()){
            System.out.println("Not found");
            flag.set(true);

        }




    }

    void findSlotWithColour(String colourtoSearch) {
        AtomicBoolean flag= new AtomicBoolean(true);

            parkingLot.forEach((key, value) -> {
                if (value.getColour().equals(colourtoSearch)) {
                    System.out.print(key+",");
                    flag.set(false);
                }


            });

        if(flag.get()){
            System.out.println("Not found");
            flag.set(true);

        }


    }

    public void carEntersParkingLot(String number,String colour,int size){
        if (capacity!=size+1 && arrayList.isEmpty()){
            Car vehicle=new Car(number,colour);
            parkingLot.put(capacity,vehicle);
            System.out.println("Allocated slot number:"+capacity);
            capacity++;
        }
        else if (!arrayList.isEmpty() && capacity!=7){
            Car vehicle=new Car(number,colour);
            parkingLot.put(arrayList.get(0),vehicle);
            System.out.println("Allocated slot number:"+arrayList.get(0));
            arrayList.remove(0);
            capacity++;
        }
        else {
            System.out.println("Sorry,Parking lot is full");
        }
    }

   public void carLeavesParkinglot(String slot){
        int slotToInt=Integer.parseInt(slot);
        parkingLot.remove(slotToInt);
        System.out.println("Slot number "+slotToInt+" is free");
        arrayList.add(slotToInt);
        Collections.sort(arrayList);
        capacity--;
    }


    public void displayCarsAvailable() {
        System.out.println("Slot No.      Registration No      Colour");
        parkingLot.forEach((key, value) -> {
            System.out.println(key+"            "+value.getPlate()+"           "+value.getColour());
        });


    }
}
