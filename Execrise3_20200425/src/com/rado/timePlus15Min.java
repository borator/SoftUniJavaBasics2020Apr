package com.rado;

import java.util.Scanner;

public class timePlus15Min {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int hourInt = Integer.parseInt(sca.nextLine());
        int minInt = Integer.parseInt(sca.nextLine());
        if((minInt+15)>=60){
            if ((hourInt+1)>=24) {
                hourInt = 0;
            } else {
                hourInt += 1;
            }
            minInt = (minInt+15) % 60;
            System.out.printf("%d:%02d",hourInt,minInt);
        } else {
            minInt += 15;
            System.out.printf("%d:%02d",hourInt,minInt);
        }
    }
}
