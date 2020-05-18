package com.rado;

import java.util.Scanner;

public class volleyball {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String leapOrNot = sca.nextLine();
        int holidaysInYear = Integer.parseInt(sca.nextLine());
        int weekendsHomeTown = Integer.parseInt(sca.nextLine());
        int weekendsInSofia = 48 - weekendsHomeTown;
        double gamesInSofia = weekendsInSofia*3.0/4;
        double gamesInHomeTown = weekendsHomeTown;
        double gamesDuringHoliday = holidaysInYear*2.0/3;
        double totalGames = gamesInSofia + gamesInHomeTown + gamesDuringHoliday;
        if ("leap".equals(leapOrNot)){
            totalGames += totalGames*0.15;
        }
        System.out.printf("%.0f",Math.floor(totalGames));
    }
}
