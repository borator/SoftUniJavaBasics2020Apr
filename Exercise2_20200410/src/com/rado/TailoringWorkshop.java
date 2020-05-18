package com.rado;

import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int numberOfSheets = Integer.parseInt(sca.nextLine());
        double tableLong = Double.parseDouble(sca.nextLine());
        double tableWide = Double.parseDouble(sca.nextLine());
        double totalAreaOfSheets = numberOfSheets * (tableLong + 2 * 0.30) * (tableWide + 2 * 0.30);
        double totalAreaOfCares = numberOfSheets * (tableLong /2 ) * (tableLong / 2);
        double priceUSD = totalAreaOfSheets * 7 + totalAreaOfCares * 9;
        double priceBGN = priceUSD * 1.85;
        System.out.printf("%.2f USD%n",priceUSD);
        System.out.printf("%.2f BGN",priceBGN);
    }
}
