package com.rado;

import java.util.Scanner;

public class numbers1NWithStep3 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = Integer.parseInt(sca.nextLine());
        for (int i = 1; i <= n; i += 3) {
            System.out.printf("%d\n", i);
        }
    }
}
