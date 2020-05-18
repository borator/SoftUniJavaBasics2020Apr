package com.rado;

import java.util.Scanner;

public class Excellent_Result {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double grade = Double.parseDouble(sca.nextLine());
        if (grade >= 5.50) {
            System.out.println("Excellent!");
        }
    }
}
