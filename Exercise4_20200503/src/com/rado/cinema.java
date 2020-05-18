package com.rado;

import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String pType = sca.nextLine();
        int rows = Integer.parseInt(sca.nextLine());
        int cols = Integer.parseInt(sca.nextLine());
        double income = 0.0;
        if ("Premiere".equals(pType)){
            income = rows * cols * 12;
        } else if ("Normal".equals(pType)){
            income = rows * cols * 7.50;
        } else {
            income = rows * cols * 5;
        }
        System.out.printf("%.2f leva",income);
    }
}
