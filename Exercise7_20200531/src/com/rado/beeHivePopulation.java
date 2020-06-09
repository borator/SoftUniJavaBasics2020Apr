package com.rado;

import java.util.Scanner;

public class beeHivePopulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initPop = Integer.parseInt(scanner.nextLine());
        int years = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i < years+1; i++){
            initPop += initPop/10 * 2;
            if ( i % 5 == 0){
                initPop -= initPop/50 * 5;
                //System.out.println("FIVE"+initPop);
            }
            initPop -= initPop/20 * 2;
        }
        System.out.printf("Beehive population: %d",initPop);
    }
}
