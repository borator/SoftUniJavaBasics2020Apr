package com.rado;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = Integer.parseInt(sca.nextLine());
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < n; i++) {
            int digi = Integer.parseInt(sca.nextLine());
            if (i % 2 == 0) {
                sumEven += digi;
            } else {
                sumOdd += digi;
            }
        }
        if (sumEven == sumOdd) {
            System.out.printf("Yes\nSum = %d", sumEven);
        } else {
            System.out.printf("No\nDiff = %d", Math.abs(sumEven - sumOdd));
        }
    }
}