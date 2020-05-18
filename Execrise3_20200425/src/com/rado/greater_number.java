package com.rado;

import java.util.Scanner;

public class greater_number {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int digi1 = Integer.parseInt(sca.nextLine());
        int digi2 = Integer.parseInt(sca.nextLine());
        if (digi1 > digi2){
            System.out.println(digi1);
        } else {
            System.out.println(digi2);
        }
    }
}
