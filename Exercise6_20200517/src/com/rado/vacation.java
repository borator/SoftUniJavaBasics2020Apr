package com.rado;

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double neededMoney = Double.parseDouble(sca.nextLine());
        double ownedMoney = Double.parseDouble(sca.nextLine());
        int spendingCounter = 0;
        int daysCounter = 0;
        while (ownedMoney<neededMoney && spendingCounter<5) {
            String command = sca.nextLine();
            double money = Double.parseDouble(sca.nextLine());
            daysCounter++;
            if ("save".equals(command)) {
                ownedMoney += money;
                spendingCounter=0;
            } else if ("spend".equals(command)) {
                ownedMoney -= money;
                spendingCounter += 1;
                if (ownedMoney<0) {
                    ownedMoney = 0;
                }
            }
        }
        if (spendingCounter==5){
            System.out.println("You can't save the money.");
            System.out.println(daysCounter);
        } else {
            System.out.printf("You saved the money for %d days.",daysCounter);
        }

    }
}
