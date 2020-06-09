package com.rado;

import java.util.Scanner;

public class specialNumbers {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int N = Integer.parseInt(sca.nextLine());
        int currentDigi=0;
        int digiLong = 0;
        String everything = "";
        for(int i = 1111; i <= 9999; i++) {
            for (int ii = 0; ii < String.valueOf(i).length(); ii++) {
                currentDigi = Integer.parseInt(""+String.valueOf(i).charAt(ii));
                //System.out.println(i +"    "+currentDigi);
                if (currentDigi != 0) {
                    if (N % currentDigi == 0) {
                        //System.out.println(i + "    " + currentDigi);
                        digiLong+=1;
                    }
                }
            }
            if( digiLong==4 ){
                everything += String.valueOf(i);
                everything += " ";
            }
            digiLong=0;
        }
        System.out.println(everything);
    }
}
