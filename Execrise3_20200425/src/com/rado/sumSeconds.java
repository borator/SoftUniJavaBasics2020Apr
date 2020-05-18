package com.rado;

import java.util.Scanner;

public class sumSeconds {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double totalMins;
        int timeFirst = Integer.parseInt(sca.nextLine());
        int timeSecond = Integer.parseInt(sca.nextLine());
        int timeThird = Integer.parseInt(sca.nextLine());
        int minutes = (timeFirst+timeSecond+timeThird)/60;
        int seconds = (timeFirst+timeSecond+timeThird)%60;
        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes,seconds);
        } else {
            System.out.printf("%d:%d",minutes,seconds);
        }
    }
}
