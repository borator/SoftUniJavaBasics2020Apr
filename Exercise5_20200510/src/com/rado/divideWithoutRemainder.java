package com.rado;

import java.util.Scanner;

public class divideWithoutRemainder {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = Integer.parseInt(sca.nextLine());
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sca.nextLine());
            if (num % 2 == 0) {
                p2 += 1;
            }
            if (num % 3 == 0) {
                p3 += 1;
            }
            if (num % 4 == 0) {
                p4 += 1;
            }
        }
        System.out.printf("%.2f%%\n", (double) p2 / n * 100);
        System.out.printf("%.2f%%\n", (double) p3 / n * 100);
        System.out.printf("%.2f%%\n", (double) p4 / n * 100);
    }
}
