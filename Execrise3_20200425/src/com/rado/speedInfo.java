package com.rado;

import java.util.Scanner;

public class speedInfo {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double spee = Double.parseDouble(sca.nextLine());
        if( spee <= 10 ){
            System.out.println("slow");
        } else if(spee <= 50){
            System.out.println("average");
        } else if ( spee <= 150) {
            System.out.println("fast");
        } else if (spee <= 1000) {
            System.out.println("ultra fast");
        } else {
            System.out.println("extremely fast");
        }
    }
}
