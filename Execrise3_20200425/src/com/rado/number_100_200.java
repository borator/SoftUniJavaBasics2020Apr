package com.rado;

import java.util.Scanner;

public class number_100_200 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int digi = Integer.parseInt(sca.nextLine());
        if (digi<100){
            System.out.println("Less than 100");
        } else if (digi>=100 && digi<=200) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 200");
        }
    }
}
