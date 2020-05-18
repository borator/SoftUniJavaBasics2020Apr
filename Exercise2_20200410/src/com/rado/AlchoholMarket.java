package com.rado;

import java.util.Scanner;

public class AlchoholMarket {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double priceWhiskey = Double.parseDouble(sca.nextLine());
        double volumeBeer = Double.parseDouble(sca.nextLine());
        double volumeWine = Double.parseDouble(sca.nextLine());
        double volumeRakiya = Double.parseDouble(sca.nextLine());
        double volumeWhiskey = Double.parseDouble(sca.nextLine());
        double priceRakiya = priceWhiskey*0.5;
        double priceWine = priceRakiya*0.6;
        double priceBeer = priceRakiya*0.2;
        double priceTotal = priceWhiskey*volumeWhiskey + priceBeer*volumeBeer + priceRakiya*volumeRakiya + priceWine*volumeWine;
        System.out.printf("%.2f",priceTotal);
    }
}
