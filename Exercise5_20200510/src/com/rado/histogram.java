package com.rado;

import java.util.Scanner;

public class histogram {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = Integer.parseInt(sca.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sca.nextLine());
            if (num < 200) {
                p1 += 1;
            } else if (num >= 200 && num < 400) {
                p2 += 1;
            } else if (num >= 400 && num < 600) {
                p3 += 1;
            } else if (num >= 600 && num < 800) {
                p4 += 1;
            } else {
                p5 += 1;
            }
        }
        System.out.printf("%.2f%%\n", (double) p1 / n * 100);
        System.out.printf("%.2f%%\n", (double) p2 / n * 100);
        System.out.printf("%.2f%%\n", (double) p3 / n * 100);
        System.out.printf("%.2f%%\n", (double) p4 / n * 100);
        System.out.printf("%.2f%%\n", (double) p5 / n * 100);
    }
}
