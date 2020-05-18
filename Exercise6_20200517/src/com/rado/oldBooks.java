package com.rado;

import java.util.Scanner;

public class oldBooks {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String tt = sca.nextLine();
        int w = Integer.parseInt(sca.nextLine());
        int sum = 0;
        boolean foundIt = false;
        String username;
        while(!foundIt && w > sum){
            username = sca.nextLine();
            //System.out.println(username);
            if(tt.equals(username)){
                foundIt = true;
            } else {
                sum += 1;
            }
        }
        if (foundIt) {
            System.out.printf("You checked %d books and found it.",sum);
        } else {
            System.out.printf("The book you search is not here!\nYou checked %d books.", sum);
        }
    }
}
