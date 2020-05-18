package com.rado;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String firstName = sca.nextLine();
        String lastName = sca.nextLine();
        int age = Integer.parseInt(sca.nextLine());
        String town = sca.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName,lastName,age,town);
    }
}
