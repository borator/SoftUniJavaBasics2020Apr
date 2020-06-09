package com.rado;

import java.util.Scanner;

public class accountBalance {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = Integer.parseInt(sca.nextLine());
        double sum = 0;
        for (int i=0;i<n;i++) {
            double inc = Double.parseDouble(sca.nextLine());
            if (sum+inc<0) {
                System.out.println("Invalid operation!\n");
                break;
            } else {
                sum += inc;
            System.out.printf("Increase: %.2f\n", inc);
            }
        }
        System.out.printf("Total: %.2f",sum);
    }
}
