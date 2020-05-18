package com.rado;

        import java.util.Scanner;

public class CharityCamapaign {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int days = Integer.parseInt(sca.nextLine());
        int numberOfCooks = Integer.parseInt(sca.nextLine());
        int numberOfCakes = Integer.parseInt(sca.nextLine());
        int numberOfWaffles = Integer.parseInt(sca.nextLine());
        int numberOfPancakes = Integer.parseInt(sca.nextLine());
        double priceAllCakes = numberOfCakes * 45.00;
        double priceAllWaffles = numberOfWaffles * 5.80;
        double priceAllPancakes = numberOfPancakes * 3.20;
        double totalPricePerDay = (priceAllCakes + priceAllWaffles + priceAllPancakes)*numberOfCooks;
        double totalPriceForAllDays = days * totalPricePerDay;
        double sumToCoverExpenses = totalPriceForAllDays - totalPriceForAllDays/8;
        System.out.printf("%.2f",sumToCoverExpenses);
    }
}
