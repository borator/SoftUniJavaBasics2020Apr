package com.rado;

import java.util.Scanner;

public class honeyHarvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int flowersNum = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double gain = 0;
        if ("Spring".equals(season)){
            if ("Sunflower".equals(flower)) {
                gain = 10*flowersNum;
            } else if ("Daisy".equals(flower)) {
                gain = 12*flowersNum;
                gain += gain*0.1;
            } else if ("Lavender".equals(flower)) {
                gain = 12*flowersNum;
            } else if ("Mint".equals(flower)) {
                gain = 10*flowersNum;
                gain += gain*0.1;
            }
        } else if ("Summer".equals(season)){
            if ("Sunflower".equals(flower)) {
                gain = 8*flowersNum;
                gain += gain*0.1;
            } else if ("Daisy".equals(flower)) {
                gain = 8*flowersNum;
                gain += gain*0.1;
            } else if ("Lavender".equals(flower)) {
                gain = 8*flowersNum;
                gain += gain*0.1;
            } else if ("Mint".equals(flower)) {
                gain = 12*flowersNum;
                gain += gain*0.1;
            }
        } else if ("Autumn".equals(season)){
            if ("Sunflower".equals(flower)) {
                gain = 12*flowersNum;
                gain -= gain*0.05;
            } else if ("Daisy".equals(flower)) {
                gain = 6*flowersNum;
                gain -= gain*0.05;
            } else if ("Lavender".equals(flower)) {
                gain = 6*flowersNum;
                gain -= gain*0.05;
            } else if ("Mint".equals(flower)) {
                gain = 6*flowersNum;
                gain -= gain*0.05;
            }
        }
        System.out.printf("Total honey harvested: %.2f",gain);
    }
}
