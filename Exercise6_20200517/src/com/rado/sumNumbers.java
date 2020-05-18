package com.rado;

import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int sum = 0;
        String input = sca.nextLine();
        while (!input.equals("Stop")){
                int currentNum = Integer.parseInt(input);
                sum += currentNum;
                input = sca.nextLine();
        }
        System.out.println(sum);
    }
}
