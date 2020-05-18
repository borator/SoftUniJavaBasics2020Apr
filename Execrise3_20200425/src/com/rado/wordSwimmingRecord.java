package com.rado;

import java.util.Scanner;

public class wordSwimmingRecord {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double recordTime = Double.parseDouble(sca.nextLine());
        double distanceMeters = Double.parseDouble(sca.nextLine());
        double timeToSwimOneMeter = Double.parseDouble(sca.nextLine());
        double timeToSwimDistance = distanceMeters * timeToSwimOneMeter;
        //double timeAdditionalWaterResistance = Math.floor((distanceMeters/15)*12.5);
        //double timeAdditionalWaterResistance = Math.ceil((distanceMeters/15)*12.5);
        double timeAdditionalWaterResistance = Math.floor(distanceMeters/15)*12.5;
        double timeTotal = timeAdditionalWaterResistance + timeToSwimDistance;
        if (timeTotal >= recordTime) {
            System.out.printf("No, he failed! He was %.2f seconds slower.",timeTotal-recordTime);
        } else {
            System.out.printf(" Yes, he succeeded! The new world record is %.2f seconds.",timeTotal);
        }
    }
}
