package com.rado;

import java.util.Scanner;

public class honeyWinterReserves2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double requiredHoney = Double.parseDouble(scanner.nextLine());
        double totalCollectedHoney = 0;
        boolean collected = false;
        String cmd = scanner.nextLine();
        while (!cmd.equals("Winter has come")) {
                int period = 6;
                double honeyPerBee = 0;
                while (period > 0) {
                    honeyPerBee += Double.parseDouble(scanner.nextLine());
                    period--;
                }
                if (honeyPerBee < 0 ){
                    System.out.printf("%s was banished for gluttony\n",cmd);
                }
                totalCollectedHoney += honeyPerBee;
                if (totalCollectedHoney >= requiredHoney) {
                    collected = true;
                    System.out.printf("Well done! Honey surplus %.2f.",(totalCollectedHoney - requiredHoney));
                    break;
                }
            cmd = scanner.nextLine();
        }

        if (!collected){
            if (totalCollectedHoney >= requiredHoney) {
                System.out.printf("Well done! Honey surplus %.2f.",(totalCollectedHoney - requiredHoney));
            } else {
                System.out.printf("Hard Winter! Honey needed %.2f.",(requiredHoney - totalCollectedHoney));
            }
        }
    }
}

