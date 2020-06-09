package com.rado;

import java.util.Scanner;

public class readText {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String a = sca.nextLine();
        int count = 0;
        while (!(a.equals("Stop"))){
            count += 1;
            a = sca.nextLine();
        }
        System.out.printf("%d",count);
    }
}
