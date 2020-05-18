package com.rado;

import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = Integer.parseInt(sca.nextLine());
        int salary = Integer.parseInt(sca.nextLine());
        for (int i = 0; i < n; i++) {
            String siteName = sca.nextLine();
            if ("Facebook".equals(siteName)) {
                if(salary - 150 <= 0){
                    System.out.println("You have lost your salary.");
                    return;
                } else {
                    salary -= 150;
                }
            } else if ("Instagram".equals(siteName)) {
                if(salary - 50 <= 0){
                    System.out.println("You have lost your salary.");
                    return;
                } else {
                    salary -= 100;
                }
            } else if ("Reddit".equals(siteName)) {
                if(salary - 50 <= 0){
                    System.out.println("You have lost your salary.");
                    return;
                } else {
                    salary -= 50;
                }
            }
        }
        System.out.printf("%d",salary);

    }
}
