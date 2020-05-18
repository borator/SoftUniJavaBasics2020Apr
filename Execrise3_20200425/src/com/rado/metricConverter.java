package com.rado;

import java.util.Scanner;

public class metricConverter {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double digiMeters = Double.parseDouble(sca.nextLine());
        String unitsFrom = sca.nextLine();
        String unitsTo = sca.nextLine();
        if (unitsFrom.equals("mm")){
            if (unitsTo.equals("m")){
                digiMeters = digiMeters/1000;
            } else {
                digiMeters = digiMeters/10;
            }
        } else if (unitsFrom.equals("cm")){
            if (unitsTo.equals("m")){
                digiMeters = digiMeters/100;
            } else {
                digiMeters = digiMeters*10;
            }
        } else if (unitsFrom.equals("m")) {
            if (unitsTo.equals("mm")){
                digiMeters = digiMeters * 1000;
            } else {
                digiMeters = digiMeters * 100;
            }
        }
        System.out.printf("%.3f",digiMeters);
    }
}
