package com.rado;

import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = Integer.parseInt(sca.nextLine());
        int sum = 0;
        for(int i = 0; i < n; i++){
            int digi = Integer.parseInt(sca.nextLine());
            sum += digi;
        }
        System.out.printf("%d",sum);
    }
}
