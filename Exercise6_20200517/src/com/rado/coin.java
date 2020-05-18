package com.rado;

import java.util.Scanner;

public class coin {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double coinVolume = Double.parseDouble(sca.nextLine());
        coinVolume = coinVolume*100;
        double tmp = 0.00;
        int coinCount = 0;
        if ( coinVolume/200 >= 1 ) {
            tmp = coinVolume/200;
            coinVolume = coinVolume % 200;
            coinCount += Math.floor(tmp) ;
        }
        if (coinVolume/100 >= 1) {
            tmp = coinVolume/100;
            coinVolume = coinVolume % 100;
            coinCount += Math.floor(tmp) ;
        }
        if (coinVolume/50 >= 1) {
            tmp = coinVolume/50;
            coinVolume = coinVolume % 50;
            coinCount += Math.floor(tmp) ;
        }
        if (coinVolume/20 >= 1) {
            tmp = coinVolume/20;
            coinVolume = coinVolume % 20;
            coinCount += Math.floor(tmp);
        }
        if (coinVolume/10 >= 1) {
            tmp = coinVolume/10;
            coinVolume = coinVolume % 10;
            coinCount += Math.floor(tmp) ;
        }
        if (coinVolume/5 >= 1) {
            tmp = coinVolume/5;
            coinVolume = coinVolume % 5;
            coinCount += Math.floor(tmp) ;
        }
        if (coinVolume/2 >= 1) {
            tmp = coinVolume/2;
            coinVolume = coinVolume % 2;
            coinCount += Math.floor(tmp) ;
        }
        if (coinVolume/1 >= 1) {
            tmp = coinVolume/1;
            coinVolume = coinVolume % 1;
            coinCount += Math.floor(tmp) ;
        }
        System.out.println(coinCount);
    }
}
