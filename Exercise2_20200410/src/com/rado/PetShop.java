package com.rado;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner sca =  new Scanner(System.in);
        int meAnimals = Integer.parseInt(sca.nextLine());
        int otherAnimals = Integer.parseInt(sca.nextLine());
        System.out.printf("%.2f lv.",meAnimals*2.5+otherAnimals*4);
    }
}
