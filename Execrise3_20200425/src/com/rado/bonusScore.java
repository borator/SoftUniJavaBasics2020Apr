package com.rado;

import java.util.Scanner;

public class bonusScore {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int digi = Integer.parseInt(sca.nextLine());
        double addOn = 0;
        if (digi <= 100) {
            addOn = 5;
        } else if (digi<=1000) {
            addOn = digi*0.2;
        } else {
            addOn = digi*0.1;
        }
        if (digi%2==0){
            addOn += 1;
        }
        if (digi%10==5){
            addOn += 2;
        }
        System.out.println(addOn);
        System.out.println(digi+addOn);

    }
}
