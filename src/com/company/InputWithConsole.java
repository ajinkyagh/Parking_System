package com.company;

import java.util.Scanner;

public class InputWithConsole {
    private final int argsLength;

    public InputWithConsole(int argsLength) {
        this.argsLength=argsLength;
    }

    public void inputFromConsole(){
        Parking parking=new Parking(argsLength, new OutputToConsole());
        Scanner sc=new Scanner(System.in);
        String input ;
        while (true){
             input=sc.nextLine();
            parking.performOperations(input);
        }

    }
}
