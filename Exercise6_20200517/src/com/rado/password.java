package com.rado;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String username = sca.nextLine();
        String password = sca.nextLine();
        String input = sca.nextLine();
        while (!input.equals(password)){
            input = sca.nextLine();
        }
        System.out.printf("Welcome %s!",username);
    }
}
