package com.rado;

import java.util.Scanner;

public class password_guess {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String txt = sca.nextLine();
        if (txt.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
