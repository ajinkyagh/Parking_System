package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class ParkingLot  {
    OutputWriter writer;
    private final int size;
    private final HashMap<Integer,Car> parkingLot = new HashMap<>();
    private final ArrayList<Integer> arrayList=new ArrayList<>();
    int capacity=1;

    public ParkingLot(int size, OutputWriter writer) {
        this.size=size;
        this.writer = writer;
    }

    public void findPlateWithColour(String s) {
        AtomicBoolean flag= new AtomicBoolean(true);
        parkingLot.forEach((key, value) -> {
            if (value.getColour().equals(s)) {
                String outputString=value.getPlate()+",";
                writer.write(outputString);
                flag.set(false);
            }

        });
        if(flag.get()){
            String outputString="Not found";
            writer.write(outputString);
            flag.set(true);

        }
    }

    public void findSlotWithNumber(String numbertoSearch) {
        AtomicBoolean flag= new AtomicBoolean(true);
            parkingLot.forEach((key, value) -> {
                if (value.getPlate().equals(numbertoSearch)) {
                    String outputString=key+",";
                    writer.write(outputString);
                    flag.set(false);
                }


            });

        if(flag.get()){
            String outputString="Not found";
            writer.write(outputString);
            flag.set(true);

        }




    }

    void findSlotWithColour(String colourtoSearch) {
        AtomicBoolean flag= new AtomicBoolean(true);
            parkingLot.forEach((key, value) -> {
                if (value.getColour().equals(colourtoSearch)) {
                    String outputString=key+",";
                    writer.write(outputString);
                    flag.set(false);
                }


            });

        if(flag.get()){
            String outputString="Not found";
            writer.write(outputString);
            flag.set(true);

        }


    }

    public void carEntersParkingLot(String number,String colour){
        if (capacity!=size+1 && arrayList.isEmpty()){
            Car vehicle=new Car(number,colour);
            parkingLot.put(capacity,vehicle);
            String outputString = "Allocated slot number:" + capacity;

           writer.write(outputString);
            capacity++;
        }
        else if (!arrayList.isEmpty() && capacity!=size+1){
            Car vehicle=new Car(number,colour);
            parkingLot.put(arrayList.get(0),vehicle);

            String outputString = "Allocated slot number:" + arrayList.get(0);
            writer.write(outputString);

            arrayList.remove(0);
            capacity++;
        }
        else {
            String outputString ="Sorry,Parking lot is full";
            writer.write(outputString);
        }
    }

   public void carLeavesParkinglot(String slot){
        int slotToInt=Integer.parseInt(slot);
        parkingLot.remove(slotToInt);
        String outputString="Slot number "+slotToInt+" is free";
        writer.write(outputString);
        arrayList.add(slotToInt);
        Collections.sort(arrayList);
        capacity--;
    }


    public void displayCarsAvailable() {
        writer.write("Slot No.      Registration No      Colour");
        parkingLot.forEach((key, value) -> {
            writer.write(key+"            "+value.getPlate()+"           "+value.getColour());
        });


    }
}
