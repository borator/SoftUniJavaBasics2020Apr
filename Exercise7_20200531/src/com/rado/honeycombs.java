package com.rado;

import java.util.Scanner;

public class honeycombs {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int bees = Integer.parseInt(sca.nextLine());
        int flowers = Integer.parseInt(sca.nextLine());
        double honeyBee = bees * flowers * 0.21;
        double honeyCombs = Math.floor(honeyBee/100);
        double honeyRest = honeyBee%100;
        System.out.printf("%d honeycombs filled.\n",(int) honeyCombs);
        System.out.printf("%.2f grams of honey left.", honeyRest);
    }
}
