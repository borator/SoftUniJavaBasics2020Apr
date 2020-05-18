package com.rado;

import java.util.Scanner;
import java.lang.Math;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String geoFig = sca.nextLine();
        if (geoFig.equals("rectangle")) {
            double a = Double.parseDouble(sca.nextLine());
            double b = Double.parseDouble(sca.nextLine());
            System.out.printf("%.3f", a * b);
    } else if (geoFig.equals("square")){
                double a = Double.parseDouble(sca.nextLine());
                System.out.printf("%.3f",a*a);
        } else if (geoFig.equals("circle")) {
            double a = Double.parseDouble(sca.nextLine());
            System.out.printf("%.3f",Math.PI*a*a);
        } else if (geoFig.equals("triangle")) {
            double a = Double.parseDouble(sca.nextLine());
            double h = Double.parseDouble(sca.nextLine());
            System.out.printf("%.3f",(a*h)/2);
        } else {
            System.out.println("Error!");
        }
    }
}
