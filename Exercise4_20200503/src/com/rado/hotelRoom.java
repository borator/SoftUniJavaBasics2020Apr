package com.rado;

import java.util.Scanner;

public class hotelRoom {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String month = sca.nextLine();
        int nightsIn = Integer.parseInt(sca.nextLine());
        double priceApartment = 0.0;
        double priceStudio = 0.0;
        if ("May".equals(month) || "October".equals(month)){
            if(nightsIn>7 && nightsIn<=14){
                priceStudio = (50-50*0.05)*nightsIn;
                priceApartment = 65 * nightsIn;
                //System.out.println('1');
            } else if (nightsIn>14) {
                priceStudio = (50-50*0.3)*nightsIn;
                priceApartment = (65-65*0.1)*nightsIn;
                //System.out.println('2');
            } else {
                priceApartment = 65 * nightsIn;
                priceStudio = 50 * nightsIn;
                //System.out.println('3');
            }
        } else if ("June".equals(month) || "September".equals(month)) {
            if(nightsIn>7 && nightsIn<=14) {
                priceStudio = 75.20 * nightsIn;
                priceApartment = 68.70 * nightsIn;
                //System.out.println('4');
            } else if (nightsIn>14) {
                priceApartment = (68.70-68.70*0.1)*nightsIn;
                priceStudio = (75.20-75.20*0.2)*nightsIn;
                //System.out.println('5');
            } else {
                priceApartment = 68.70 * nightsIn;
                priceStudio = 75.20 * nightsIn;
                //System.out.println('6');
            }
        } else if ("July".equals(month) || "August".equals(month)){
            if (nightsIn>14) {
                priceApartment = (77-77*0.1)*nightsIn;
                priceStudio = 76 * nightsIn;
                //System.out.println('7');
            } else {
                priceApartment = 77 * nightsIn;
                priceStudio = 76 * nightsIn;
                //System.out.println('8');
            }
        }
        System.out.printf("Apartment: %.2f lv.\n",priceApartment);
        System.out.printf("Studio: %.2f lv.",priceStudio );
    }
}
