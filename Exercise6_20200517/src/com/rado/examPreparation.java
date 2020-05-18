package com.rado;

import java.util.Scanner;

public class examPreparation {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String problemName;
        String lastProblem = "";
        int solvedProblemCount = 0;
        double gradesSum = 0.00;
        boolean isFaled = true;
        int failedThreshold = Integer.parseInt(sca.nextLine());
        double filedTimes=0;
        while (filedTimes<failedThreshold){
            problemName = sca.nextLine();
            if("Enough".equals(problemName)){
                isFaled = false;
                break;
            }
            int grade = Integer.parseInt(sca.nextLine());
            if (grade <= 4){
                filedTimes += 1;
            }
            gradesSum += grade;
            solvedProblemCount += 1;
            lastProblem = problemName;

        }
        if (isFaled) {
            System.out.printf("You need a break, %d poor grades.", failedThreshold);
        } else {
            System.out.printf("Average score: %.2f%n", gradesSum/solvedProblemCount);
            System.out.printf("Number of problems: %d%n", solvedProblemCount);
            System.out.printf("Last problem: %s", lastProblem);
        }


    }
}
