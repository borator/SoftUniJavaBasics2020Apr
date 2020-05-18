package com.rado;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String name = sca.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
