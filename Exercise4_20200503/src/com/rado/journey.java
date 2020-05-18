package com.rado;

import java.util.Scanner;

public class journey {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double budget = Double.parseDouble(sca.nextLine());
        String season = sca.nextLine();
        String location;
        String accommodation = "Hotel";
        if (budget <= 100){
            location = "Bulgaria";
            if ("summer".equals(season)){
                accommodation = "Camp";
                budget = budget*0.3;
            } else {
                budget = budget*0.7;
                accommodation = "Hotel";
            }
        } else if (budget <= 1000 ) {
            location = "Balkans";
            if ("summer".equals(season)){
                accommodation = "Camp";
                budget = budget*0.4;
            } else {
                budget = budget*0.8;
                accommodation = "Hotel";
            }
        } else if (budget > 1000) {
            location = "Europe";
            accommodation = "Hotel";
            budget = budget*0.9;
        } else {
            location = "Libya";
        }
        System.out.printf("Somewhere in %s\n",location);
        System.out.printf("%s - %.2f",accommodation,budget);
    }
}
