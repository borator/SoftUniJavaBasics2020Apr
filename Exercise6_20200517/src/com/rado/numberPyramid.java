package com.rado;

import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = Integer.parseInt(sca.nextLine());
        int cur = 1;
        boolean isBigger = false;
        for(int i = 1; i<=n; i++){
            for(int ii = 1; ii<=i;ii++){
                if(cur > n) {
                    isBigger=true;
                    break;
                }
                System.out.print(cur+" ");
                cur++;
            }
            if(isBigger){
                break;
            }
            System.out.println();
        }
    }
}
