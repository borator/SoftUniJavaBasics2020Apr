package com.rado;

import java.util.Scanner;

public class vowelsSum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sca = new Scanner(System.in);
        String n = sca.nextLine();
        for(int i = 0; i < n.length(); i++){
            char letter = n.charAt(i);
            if ('a' == letter){
                sum += 1;
            } else if ('e' == letter) {
                sum += 2;
            } else if ('i' == letter) {
                sum += 3;
            } else if ('o' == letter) {
                sum += 4;
            } else if ('u' == letter) {
                sum += 5;
            }
        }
        System.out.printf("%d",sum);
    }
}
