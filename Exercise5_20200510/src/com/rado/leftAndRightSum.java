package com.rado;

import java.util.Scanner;

public class leftAndRightSum {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = Integer.parseInt(sca.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < Math.pow(2,n); i++){
            int digi = Integer.parseInt(sca.nextLine());
            if (i<=1){
                sum1 += digi;
            }
            if (i>1){
                sum2 += digi;
            }
        }
        //System.out.printf("%d %d",sum1,sum2);
        if(sum1==sum2){
            System.out.printf("Yes, sum = %d\n",sum1);
        } else {
            System.out.printf("No, diff = %d\n",sum1-sum2);
        }
    }
}
