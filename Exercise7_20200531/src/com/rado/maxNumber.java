package com.rado;

import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = Integer.parseInt(sca.nextLine());
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++){
            int digi = Integer.parseInt(sca.nextLine());
            if(digi>max){
                max = digi;
            }
        }
        System.out.println(max);
    }
}
