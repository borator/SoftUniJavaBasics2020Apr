package com.rado;

import java.util.Scanner;

public class graduation2 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String username = sca.nextLine();
        double total =0;
        int expel = 0;
        int counter = 1;
        while (counter<=12){
            double grad = Double.parseDouble(sca.nextLine());
            if (grad >= 4.00) {
                total += grad;
                counter+=1;
            } else {
                expel+=1;
            }
            if (expel>=1){
                System.out.printf("%s has been excluded at %d grade",username,counter);
                break;
            }

        }
        if (expel<1) {
            System.out.printf("%s graduated. Average grade: %.2f", username, total / 12);
        }
    }
}
