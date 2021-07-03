package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer,String> regPlate=new HashMap<Integer,String>();
        HashMap<Integer,String>  carColour=new HashMap<Integer,String>();
        ArrayList<Integer> arrayList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int capacity=1,slot;
        int opt = 0;
        do {
            System.out.println("1.Park Car into parking");
            System.out.println("2.Remove Car from the parking");
            int option= Integer.parseInt(sc.nextLine());
            if(option==1)
            {
                if (capacity!=7 && arrayList.isEmpty()){
                    System.out.println("Enter number plate");
                    String numberPlate=sc.nextLine();
                    System.out.println("Enter car colour");
                    String colour=sc.nextLine();
                    regPlate.put(capacity,numberPlate);
                    carColour.put(capacity,colour);
                    System.out.println("Allocated slot number:"+capacity);
                    capacity++;
                }
                else if (!arrayList.isEmpty() && capacity!=7){
                    System.out.println("Enter number plate");
                    String numberPlate=sc.nextLine();
                    System.out.println("Enter car colour");
                    String colour=sc.nextLine();
                    regPlate.put(arrayList.get(0),numberPlate);
                    carColour.put(arrayList.get(0),colour);
                    System.out.println("Allocated slot number:"+arrayList.get(0));
                    arrayList.remove(0);
                    capacity++;
                }
                else {
                    System.out.println("Sorry,Parking lot is full");
                }

            }
            else if (option==2)
            {
                System.out.println("Enter the slot from which the car exits");
                slot= Integer.parseInt(sc.nextLine());
                regPlate.remove(slot);
                carColour.remove(slot);
                arrayList.add(slot);
                Collections.sort(arrayList);
                capacity--;
            }
            System.out.println(regPlate);
            System.out.println(carColour);
            System.out.println("Do you want to continue(0/1)");
            opt= Integer.parseInt(sc.nextLine());
        }while (opt!=0);

        System.out.println(regPlate);
        System.out.println(carColour);
    }
}
