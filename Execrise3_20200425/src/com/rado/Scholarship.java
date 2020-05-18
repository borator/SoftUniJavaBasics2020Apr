package com.rado;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double incomeInBGN = Double.parseDouble(sca.nextLine());
        double midScore = Double.parseDouble(sca.nextLine());
        double minWorkWage = Double.parseDouble(sca.nextLine());
        double scholSocial =minWorkWage*0.35;
        double scholExcell =midScore*25;
        if (incomeInBGN<minWorkWage && midScore>4.5 && midScore<5.5) {
            System.out.println("You get a Social scholarship "+(int)Math.floor(scholSocial)+" BGN");
        } else if (incomeInBGN<minWorkWage && midScore>=5.5 && scholSocial > scholExcell) {
            System.out.println("You get a Social scholarship "+(int)Math.floor(scholSocial)+" BGN");
        } else if (midScore>=5.5){
            System.out.println("You get a scholarship for excellent results "+(int)Math.floor(scholExcell)+" BGN");
        } else {
            System.out.println("You cannot get a scholarship!");
        }

    }
}
