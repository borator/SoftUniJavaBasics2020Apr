package com.rado;

import java.util.Scanner;

public class newHouse {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String flower = sca.nextLine();
        int fCount = Integer.parseInt(sca.nextLine());
        double budget = Double.parseDouble(sca.nextLine());
        double spending = 0.0;
        if ("Roses".equals(flower) && fCount > 80){
            spending = fCount*5;
            spending -= spending*0.1;
        } else if ("Roses".equals(flower)) {
            spending = fCount*5;
        } else if ("Dahlias".equals(flower) && fCount > 90) {
            spending = fCount*3.80;
            spending -= spending*0.15;
        } else if ("Dahlias".equals(flower)) {
            spending = fCount*3.80;
        } else if ("Tulips".equals(flower) && fCount > 80) {
            spending = fCount*2.80;
            spending -= spending*0.15;
        } else if ("Tulips".equals(flower)) {
            spending = fCount*2.80;
        } else if ("Narcissus".equals(flower) && fCount < 120) {
            spending = fCount*3.00;
            spending += spending*0.15;
        } else if ("Narcissus".equals(flower)) {
            spending = fCount*3.00;
        } else if ("Gladiolus".equals(flower) && fCount < 80) {
            spending = fCount*2.50;
            spending += spending*0.20;
        } else {
            spending = fCount*2.50;
        }

        if (budget>=spending) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",fCount,flower,budget-spending);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.",spending-budget);
        }
    }
}
