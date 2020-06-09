package com.rado;

import java.util.Scanner;

public class minNumber {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = Integer.parseInt(sca.nextLine());
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<n; i++){
            int digi = Integer.parseInt(sca.nextLine());
            if(digi<min){
                min = digi;
            }
        }
        System.out.println(min);
    }
}
