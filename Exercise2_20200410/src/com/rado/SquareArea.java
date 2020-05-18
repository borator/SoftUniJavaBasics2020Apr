package com.rado;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        Integer a = Integer.parseInt(sca.nextLine());
        int area = a * a;
        System.out.printf("% d",area);
    }
}
