package com.rado;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double cents = Double.parseDouble(sca.nextLine());
        System.out.printf("% f", cents*2.54);
    }
}
