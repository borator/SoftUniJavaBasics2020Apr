package com.rado;

import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int digi = Integer.parseInt(sca.nextLine());
        if (digi % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
