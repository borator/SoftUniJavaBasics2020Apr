package com.rado;

import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = Integer.parseInt(sca.nextLine());
        for (double i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.printf("%.0f\n", Math.pow(2, i));
            }
        }
    }
}
