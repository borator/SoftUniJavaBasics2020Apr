package com.rado;

import java.util.Scanner;

public class beeHiveDefence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beeNum = Integer.parseInt(scanner.nextLine());
        int bearHealth = Integer.parseInt(scanner.nextLine());
        int bearAttack = Integer.parseInt(scanner.nextLine());
        while( bearHealth >= 0 || beeNum < 100){
            if ((beeNum - bearAttack) < 100 ) {
                beeNum -= bearAttack;
                if (beeNum < 0){
                    beeNum = 0;
                    System.out.printf("The bear stole the honey! Bees left %d.\n", beeNum);
                    break;
                } else {
                    System.out.printf("The bear stole the honey! Bees left %d.\n", beeNum);
                    break;
                }
            } else {
                beeNum -= bearAttack;
            }
            if ( (bearHealth - beeNum*5) <= 0 ){
                System.out.printf("Beehive won! Bees left %d.\n", beeNum);
                break;
            } else {
                bearHealth -= beeNum*5;
            }
        }
    }
}
