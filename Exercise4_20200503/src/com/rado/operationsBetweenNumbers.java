package com.rado;

import java.util.Scanner;

public class operationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int N1 = Integer.parseInt(sca.nextLine());
        int N2 = Integer.parseInt(sca.nextLine());
        String oper = sca.nextLine();
        String oddOrEven="odd";
        if ("+".equals(oper)){
            if ((N1+N2) % 2 == 0){
                oddOrEven = "even";
            }
            System.out.printf("%d %s %d = %d - %s",N1,"+",N2,N1+N2,oddOrEven);
        } else if ("-".equals(oper)) {
            if ((N1-N2) % 2 == 0){
                oddOrEven = "even";
            } else {
                oddOrEven = "odd";
            }
            System.out.printf("%d %s %d = %d - %s",N1,"-",N2,N1-N2,oddOrEven);
        } else if ("*".equals(oper)) {
            if ((N1*N2) % 2 == 0){
                oddOrEven = "even";
            } else {
                oddOrEven = "odd";
            }
            System.out.printf("%d %s %d = %d - %s",N1,"*",N2,N1*N2,oddOrEven);
        } else if ("/".equals(oper)) {
            if (N2 == 0){
                System.out.printf("Cannot divide %d by zero",N1);
            } else {
                System.out.printf("%d %s %d = %.2f",N1,"/",N2,(double)N1/N2);
            }
        } else if ("%".equals(oper)) {
            if (N2 == 0){
                System.out.printf("Cannot divide %d by zero",N1);
            } else {
                System.out.printf("%d %s %d = %d",N1,"%",N2,N1%N2);
            }
        }
    }
}
