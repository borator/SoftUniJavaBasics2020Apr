package com.rado;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double budget = Double.parseDouble(sca.nextLine());
        int people = Integer.parseInt(sca.nextLine());
        double priceOfCostume = Double.parseDouble(sca.nextLine());
        double decorPrice = budget*0.1;
        double allCostumesPrice = people * priceOfCostume;
        if (people>150){
            allCostumesPrice -= allCostumesPrice*0.1;
        }
        if ((allCostumesPrice+decorPrice)>budget){
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.",(allCostumesPrice+decorPrice)-budget);
        } else {
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.",budget-(allCostumesPrice+decorPrice));
        }

    }
}
