package com.rado;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double l = Double.parseDouble(sca.nextLine());
        double w = Double.parseDouble(sca.nextLine());
        double h = Double.parseDouble(sca.nextLine());
        double waterVolume = Double.parseDouble(sca.nextLine());
        System.out.printf("%.3f", l*w*h*0.001*(1-waterVolume*0.01));
    }
}
