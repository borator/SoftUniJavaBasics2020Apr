package com.rado;

import java.util.Scanner;

public class cleverLily {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int age = Integer.parseInt(sca.nextLine());
        double priceOfLaundryMachine = Double.parseDouble(sca.nextLine());
        double priceOfToy = Double.parseDouble(sca.nextLine());
        int toyCount = 0;
        double moneyBirthdayCount = 0;
        double allMoney = 0;
        for (int i = 1; i <= age; i++) {
            if(i%2==0){
                moneyBirthdayCount += ((i/2*10)-1);
            } else {
                toyCount += 1;
            }
        }
        allMoney = toyCount*priceOfToy + moneyBirthdayCount;
        //System.out.printf("%d %f %f",toyCount,moneyBirthdayCount,allMoney );
        if (allMoney-priceOfLaundryMachine>=0){
            System.out.printf("Yes! %.02f",allMoney-priceOfLaundryMachine);
        } else {
            System.out.printf("No! %.02f",priceOfLaundryMachine-allMoney);
        }
    }
}
