package com.rado;

import java.util.Scanner;

public class fishingBoat {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double budget = Double.parseDouble(sca.nextLine());
        String season = sca.nextLine();
        int numberOfFisherman = Integer.parseInt(sca.nextLine());
        double rentAShip = 0.0;
        if ("Summer".equals(season) || "Autumn".equals(season)){
            rentAShip = 4200;
        } else if ("Spring".equals(season)){
            rentAShip = 3000;
        } else {
            rentAShip = 2600;
        }
        if (numberOfFisherman<=6){
            rentAShip -= rentAShip*0.1;
        } else if (numberOfFisherman>7 && numberOfFisherman<=11) {
            rentAShip -= rentAShip*0.15;
        } else if (numberOfFisherman>12 ){
            rentAShip -= rentAShip*0.25;
        } else {
            rentAShip = 0;
        }

        if (!"Autumn".equals(season) && numberOfFisherman % 2 == 0) {
            rentAShip -= rentAShip*0.05;
        }
        if (budget>=rentAShip) {
            System.out.printf("Yes! You have %.2f leva left.",budget-rentAShip);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.",rentAShip-budget);
        }
    }
}
