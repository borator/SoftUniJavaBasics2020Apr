package com.rado;

import java.util.Scanner;

public class oddEvenPosition {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = Integer.parseInt(sca.nextLine());
        double sumOdd = 0.00;
        double sunEven = 0.00;
        double minOdd = Integer.MAX_VALUE;
        double maxOdd = Integer.MIN_VALUE;
        double minEven = Integer.MAX_VALUE;
        double maxEven = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            double num = Double.parseDouble(sca.nextLine());
            if (i%2!=0){
                sunEven += num;
                if (num>maxEven)
                    maxEven = num;
                if (num<minEven)
                    minEven = num;
            } else {
                sumOdd += num;
                if (num>maxOdd)
                    maxOdd = num;
                if (num<minOdd)
                    minOdd = num;
            }
        }
        System.out.printf("OddSum=%.2f,\n", sumOdd);
        if (minOdd==Integer.MAX_VALUE) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=%.2f,\n", minOdd);
        }
        if (maxOdd==Integer.MIN_VALUE) {
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=%.2f,\n", maxOdd);
        }
        System.out.printf("EvenSum=%.2f,\n", sunEven);
        if (maxEven==Integer.MIN_VALUE) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=%.2f,\n", minEven);
        }
        if (minEven==Integer.MAX_VALUE) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%.2f\n", maxEven);
        }
    }
}
