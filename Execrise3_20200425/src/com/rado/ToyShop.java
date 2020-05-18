package com.rado;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        Double tripPrice = Double.parseDouble(sca.nextLine());
        int puzzleNumber = Integer.parseInt(sca.nextLine());
        int tokingDollsNumber = Integer.parseInt(sca.nextLine());
        int teddyBearsNumber = Integer.parseInt(sca.nextLine());
        int minionsNumber = Integer.parseInt(sca.nextLine());
        int toyTruckNumber = Integer.parseInt(sca.nextLine());
        double totalToysPrice = puzzleNumber*2.60+tokingDollsNumber*3.00+teddyBearsNumber*4.10+minionsNumber*8.20+toyTruckNumber*2.00;
        int numberOfToys = puzzleNumber+tokingDollsNumber+teddyBearsNumber+minionsNumber+toyTruckNumber;
        if (numberOfToys>=50) {
            totalToysPrice = totalToysPrice - (totalToysPrice*0.25);
        }
        totalToysPrice -= totalToysPrice*0.10;
        if (totalToysPrice >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.",totalToysPrice-tripPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.",tripPrice-totalToysPrice);
        }

    }
}
