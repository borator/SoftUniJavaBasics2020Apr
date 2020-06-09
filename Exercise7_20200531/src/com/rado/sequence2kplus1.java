package com.rado;

import java.util.Scanner;

public class sequence2kplus1 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = Integer.parseInt(sca.nextLine());
        int i = 1;
        //int tmp = 0;
        while (i <= n) {
            System.out.println(i);
            i = i * 2 + 1;
        }
    }
}
