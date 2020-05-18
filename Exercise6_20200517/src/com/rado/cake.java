package com.rado;

import java.util.Scanner;

public class cake {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a = Integer.parseInt(sca.nextLine());
        int b = Integer.parseInt(sca.nextLine());
        int tmpPeaces = 0;
        int peacesCount = a*b;
        String tmp;
        while(peacesCount>=0){
            tmp = sca.nextLine();
            if("STOP".equals(tmp)){
                System.out.printf("%d pieces are left.",peacesCount);
                break;
            }
            tmpPeaces = Integer.parseInt(tmp);
            if(peacesCount-tmpPeaces<0){
                System.out.printf("No more cake left! You need %d pieces more.",Math.abs(peacesCount-tmpPeaces));
                break;
            }
            peacesCount -= tmpPeaces;
        }
    }
}
