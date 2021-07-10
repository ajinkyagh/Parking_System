package com.company;

public class OutputToConsole implements OutputWriter{

    @Override
    public void write(String output) {
        System.out.println(output);

    }
}
