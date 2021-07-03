package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer,String> regPlate=new HashMap<Integer,String>();
        HashMap<Integer,String>  carColour=new HashMap<Integer,String>();
        Scanner sc=new Scanner(System.in);
        int capacity=0;
        int opt = 0;
        while (capacity!=6 ) {

            System.out.println("Enter number plate");
            String numberPlate=sc.nextLine();
            System.out.println("Enter car colour");
            String colour=sc.nextLine();
            capacity++;
            regPlate.put(capacity,numberPlate);
            carColour.put(capacity,colour);
            System.out.println("Do you want to continue(0/1)");
            opt= Integer.parseInt(sc.nextLine());
            if (opt==0){
                break;
            }
        }


        regPlate.remove(1);
        regPlate.remove(1);

        System.out.println(regPlate);
        System.out.println(carColour);
    }
}
