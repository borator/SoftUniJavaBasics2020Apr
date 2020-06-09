package com.rado;

import java.util.Scanner;

public class beeHiveRole {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int intelegence = Integer.parseInt(sca.nextLine());
        int power = Integer.parseInt(sca.nextLine());
        String sex = sca.nextLine();
        if (intelegence >= 80) {
            if (power >= 80 && "female".equals(sex)) {
                System.out.println("Queen Bee");
            } else {
                System.out.println("Repairing Bee");
            }
        } else if ( intelegence >= 60) {
            System.out.println("Cleaning Bee");
        } else {
            if (power >= 80 && "male".equals(sex)){
                System.out.println("Drone Bee");
            } else if ( power>=60 ) {
                System.out.println("Guard Bee");
            } else {
                System.out.println("Worker Bee");
            }

        }
    }
}
