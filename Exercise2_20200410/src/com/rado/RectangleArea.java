package com.rado;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        Double x1 = Double.parseDouble(sca.nextLine());
        Double y1 = Double.parseDouble(sca.nextLine());
        Double x2 = Double.parseDouble(sca.nextLine());
        Double y2 = Double.parseDouble(sca.nextLine());
        System.out.printf("%.2f%n",Math.abs(x1-x2)*Math.abs(y1-y2));
        System.out.printf("%.2f",Math.abs((x1-x2)*2)+Math.abs((y1-y2)*2));
    }
}
