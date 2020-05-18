package com.rado;

import java.util.Scanner;

public class walking {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int steps = 0;
        int totalSteps = 0;
        String comm;
        boolean goal = false;
        while (totalSteps<=10000){
            comm = sca.nextLine();
            if ("Going home".equals(comm)){
                if (totalSteps>=10000) {
                    goal = true;
                    break;
                } else {
                    steps = Integer.parseInt(sca.nextLine());
                    totalSteps += steps;
                    if (totalSteps>=10000){
                        goal = true;
                    }
                    break;
                }
            }
            steps = Integer.parseInt(comm);
            if (totalSteps+steps>=10000) {
                totalSteps += steps;
                goal = true;
                break;
            } else {
                totalSteps += steps;
            }
        }
        if (goal){
            System.out.println("Goal reached! Good job!");
        } else {
            System.out.printf("%d more steps to reach goal.",10000 - totalSteps);
        }
    }
}
