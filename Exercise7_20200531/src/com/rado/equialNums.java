package com.rado;

import java.util.Scanner;

public class equialNums {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a1 = Integer.parseInt(sca.nextLine());
        int a2 = Integer.parseInt(sca.nextLine());
        for(int i = a1; i<=a2;i++){
            String currentNum = "" + i;
            int oddSum = 0;
            int evenSum = 0;
            for (int ii = 0; ii < currentNum.length(); ii++) {
                int currentDigi = Integer.parseInt(""+currentNum.charAt(ii));
                if(ii % 2==0){
                    evenSum += currentDigi;
                }else{
                    oddSum += currentDigi;
                }

            }
            if (evenSum==oddSum){
                System.out.print(i + " ");
            }
        }
    }
}
