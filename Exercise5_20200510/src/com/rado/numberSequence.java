package com.rado;

import java.util.Scanner;

public class numberSequence {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = Integer.parseInt(sca.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int digi = Integer.parseInt(sca.nextLine());
            if (digi<min){
                min = digi;
            }
            if (digi>max){
                max = digi;
            }
        }
        System.out.printf("Max number: %d\n",max);
        System.out.printf("Min number: %d",min);
    }
}
