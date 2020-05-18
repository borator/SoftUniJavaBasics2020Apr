package com.rado;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double squareMeters = Double.parseDouble(sca.nextLine());
        System.out.printf("The final price is: %.2f lv.\n",(squareMeters*7.61)-(squareMeters*7.61*0.18));
        System.out.printf("The discount is: %.2f lv.",squareMeters*7.61*0.18);
    }
}
