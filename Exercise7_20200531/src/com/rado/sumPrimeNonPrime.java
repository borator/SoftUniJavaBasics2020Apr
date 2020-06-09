package com.rado;

import java.util.Scanner;

public class sumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String x = sca.nextLine();
        int sumPN = 0;
        int sumNPN = 0;
        while ( !"stop".equals(x)){
            int n = Integer.parseInt(x);
            if (n < 0) {
                System.out.println("Number is negative.");
            } else {
                int i, m = 0, flag = 0;
                m = n / 2;
                if (n == 0 || n == 1) {
                    //System.out.println(n + " is not prime number");
                    sumNPN += n;
                } else {
                    for (i = 2; i <= m; i++) {
                        if (n % i == 0) {
                            //System.out.println(n + " is not prime number");
                            sumNPN += n;
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        //System.out.println(n + " is prime number");
                        sumPN += n;
                    }
                }//end of else
            }
            x = sca.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + sumPN);
        System.out.println("Sum of all non prime numbers is: " + sumNPN);
    }
}
