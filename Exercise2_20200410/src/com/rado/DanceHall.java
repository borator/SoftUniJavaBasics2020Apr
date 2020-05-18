package com.rado;

import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double hallLong = Double.parseDouble(sca.nextLine());
        double hallWide = Double.parseDouble(sca.nextLine());
        double wardrobeSide = Double.parseDouble(sca.nextLine());
        double hallAreaCentimeters = hallLong*100*hallWide*100;
        double wardrobeArea = wardrobeSide*100*wardrobeSide*100;
        double benchArea = hallAreaCentimeters/10;
        double freeSpace = hallAreaCentimeters - wardrobeArea - benchArea;
        double dancersCount = freeSpace/(40+7000);
        System.out.printf("%d",(int) Math.floor(dancersCount));
    }
}
