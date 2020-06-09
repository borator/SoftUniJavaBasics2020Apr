package com.rado;

import java.util.Scanner;

public class moving {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int w = Integer.parseInt(sca.nextLine());
        int l = Integer.parseInt(sca.nextLine());
        int h = Integer.parseInt(sca.nextLine());
        int total = 0;
        String doner = sca.nextLine();
        while (!"Done".equals(doner)){
            int currentNum = Integer.parseInt(doner);
            if(total+currentNum>w*l*h){
                total += currentNum;
                System.out.printf("No more free space! You need %d Cubic meters more.",total-w*l*h);
                break;
            }
            total += currentNum;
            doner = sca.nextLine();
        }
        if(total<=w*l*h){
            System.out.printf("%d Cubic meters left.",w*l*h-total);
        }
    }
}
