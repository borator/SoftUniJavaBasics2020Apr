package com.rado;

import java.util.Scanner;

public class characterSequence {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String n = sca.nextLine();
        for(int i = 0; i < n.length(); i++){
            char letter = n.charAt(i);
            System.out.printf("%s\n",letter);
        }
    }
}
