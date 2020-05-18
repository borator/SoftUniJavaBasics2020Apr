package com.rado;

import java.util.Scanner;

public class onTimeForTheExam {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int hourExam = Integer.parseInt(sca.nextLine());
        int minsExam = Integer.parseInt(sca.nextLine());
        int hourArrival = Integer.parseInt(sca.nextLine());
        int minsArrival = Integer.parseInt(sca.nextLine());
        double examTime=hourExam*60+minsExam;
        double arrivalTime=hourArrival*60+minsArrival;
        double diff = examTime - arrivalTime;
        double hours = 0;
        double mins = 0;
        if (diff<=-1){
            System.out.println("Late");
        } else if (diff>=0 && diff<=30){
            System.out.println("On Time");
        } else if (diff>30){
            System.out.println("Early");
        }
        if(diff>0 && diff<60){
            System.out.printf("%.0f minutes before the start",diff);
        } else if ( diff>=60 ) {
            hours = Math.floor(diff/60);
            mins = Math.abs(diff%60);
            if (mins<10){
                System.out.printf("%.0f:0%.0f hours before the start",hours,mins);
            } else {
                System.out.printf("%.0f:%.0f hours before the start",hours,mins);
            }
        } else if (diff<0 && diff>=-59){
            System.out.printf("%.0f minutes after the start",Math.abs(diff));
        } else if (diff<=-60){
            hours = Math.abs(Math.ceil(diff/60));
            mins = Math.abs(diff%60);
            if (mins<10) {
                System.out.printf("%.0f:0%.0f hours after the start",hours,mins);
            } else {
                System.out.printf("%.0f:%.0f hours after the start",hours,mins);
            }
        }
    }
}