package com.company;


public class Parking  {
    private final int argsLength;
    private final OutputWriter writer;
    int siz;
    boolean flag = true, flag2 = true;
    ParkingLot parkingLot;


    public Parking(int argsLength, OutputWriter writer) {
        this.argsLength = argsLength;
        this.writer = writer;
    }

    public void performOperations(String line) {
        String choice = line;
        String[] splitChoice = choice.split("\\s");
        if (flag2) {
            if (splitChoice[0].equals("create_parking_lot")) {
                siz = Integer.parseInt(splitChoice[1]);
                parkingLot = new ParkingLot(siz, this.writer);
                String outputString="Created a parking lot with " + siz + " slots";
                writer.write(outputString);
                flag2 = false;
            } else {
                String outputString="Parking lot not initialized";
                writer.write(outputString);
            }
        } else {
            switch (splitChoice[0]) {

                case "park" -> parkingLot.carEntersParkingLot(splitChoice[1], splitChoice[2]);
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





