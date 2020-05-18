package com.rado;

import java.util.Scanner;

public class number_1_9_to_text {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int digi = Integer.parseInt(sca.nextLine());
        if (digi == 1){
            System.out.println("one");
        } else if (digi == 2) {
            System.out.println("two");
        } else if (digi == 3) {
            System.out.println("three");
        } else if (digi == 4) {
            System.out.println("four");
        } else if (digi == 5) {
            System.out.println("five");
        } else if (digi == 6) {
            System.out.println("six");
        } else if (digi == 7) {
            System.out.println("seven");
        } else if (digi == 8) {
            System.out.println("eight");
        } else if (digi == 9) {
            System.out.println("nine");
        } else {
            System.out.println("number too big");
        }
    }
}
