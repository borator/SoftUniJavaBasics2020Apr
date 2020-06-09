package com.rado;

import java.util.Scanner;

public class honeyWinterReservers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double honeyInDemand = Double.parseDouble(scanner.nextLine());
        double honeyGathered = 0;
        String beeName = scanner.nextLine();
        while (!"Winter has come".equals(beeName)){
            for(int i = 0; i<6; i++){
                double bee = Double.parseDouble(scanner.nextLine());
                honeyGathered += bee;
            }
            if (honeyGathered < 0){
                System.out.printf("%s was banished for gluttony\n",beeName);
            }
            beeName = scanner.nextLine();
        }
        if (honeyInDemand - honeyGathered<=0){
            System.out.printf("Well done! Honey surplus %.2f.",honeyGathered-honeyInDemand);
        } else {
            System.out.printf("Hard Winter! Honey needed %.2f.",honeyInDemand-honeyGathered);
        }
    }
}
