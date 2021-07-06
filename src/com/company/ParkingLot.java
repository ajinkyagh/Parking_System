package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ParkingLot {
    private HashMap<Integer,Car> car= new HashMap<>();
    private ArrayList<Integer> arrayList=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    int capacity=1,opt=0;

    public void findPlateWithColour(String s) {
        car.forEach((key, value) -> {
            if (value.colour.equals(s)) {
                System.out.println(value.plate);
            }
            else{
                System.out.println("Car not found");
            }
        });
    }

    public void findSlotWithNumber(String numbertoSearch) {
            car.forEach((key, value) -> {
                if (value.plate.equals(numbertoSearch)) {
                    System.out.println(key);
                }
                else{
                    System.out.println("Car not found");
                }
            });



    }

    void findSlotWithColour(String colourtoSearch) {
            car.forEach((key, value) -> {
                if (value.colour.equals(colourtoSearch)) {
                    System.out.println(key);
                }
                else{
                    System.out.println("Car not found");
                }
            });


    }

    public void carEntersParkingLot(String number,String colour){
        if (capacity!=7 && arrayList.isEmpty()){
            Car vehicle=new Car(number,colour);
            car.put(capacity,vehicle);
            System.out.println(vehicle.plate+" "+vehicle.colour);
            System.out.println("Allocated slot number:"+capacity);
            capacity++;
        }
        else if (!arrayList.isEmpty() && capacity!=7){
            Car vehicle=new Car(number,colour);
            car.put(arrayList.get(0),vehicle);
            System.out.println(vehicle.plate+" "+vehicle.colour);
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
        car.remove(slotToInt);
        arrayList.add(slotToInt);
        Collections.sort(arrayList);
        capacity--;
    }



}
