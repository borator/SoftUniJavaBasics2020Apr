package com.rado;

import java.util.Scanner;

public class graduation {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String username = sca.nextLine();
        double total =0;
        for (int i=1; i<=12; i++) {
            double grad = Double.parseDouble(sca.nextLine());
            if (grad >= 4.00) {
                total += grad;
            }
        }
        System.out.printf("%s graduated. Average grade: %.2f", username, total/12);

    }
}
