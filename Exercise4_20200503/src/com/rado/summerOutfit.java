package com.rado;

import java.util.Scanner;

public class summerOutfit {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int temperature = Integer.parseInt(sca.nextLine());
        String tod = sca.nextLine();
        boolean morningLow = ("Morning".equals(tod) && temperature<=18 && temperature>=10);
        boolean morningMid = ("Morning".equals(tod) && temperature>18 && temperature<=24);
        boolean morningHigh = ("Morning".equals(tod) && temperature>=25);

        boolean afternoonLow = ("Afternoon".equals(tod) && temperature<=18 && temperature>=10);
        boolean afternoonMid = ("Afternoon".equals(tod) && temperature>18 && temperature<=24);
        boolean afternoonHigh = ("Afternoon".equals(tod) && temperature>=25);

        boolean eveningLow = ("Evening".equals(tod) && temperature<=18 && temperature>=10);
        boolean eveningMid = ("Evening".equals(tod) && temperature>18 && temperature<=24);
        boolean eveningHigh = ("Evening".equals(tod) && temperature>=25);

        if (morningLow) {
            System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.",temperature);
        } else if (morningMid) {
            System.out.printf("It's %d degrees, get your Shirt and Moccasins.",temperature);
        } else if (morningHigh) {
            System.out.printf("It's %d degrees, get your T-Shirt and Sandals.",temperature);
        } else if (afternoonLow) {
            System.out.printf("It's %d degrees, get your Shirt and Moccasins.",temperature);
        } else if (afternoonMid) {
            System.out.printf("It's %d degrees, get your T-Shirt and Sandals.",temperature);
        } else if (afternoonHigh) {
            System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.",temperature);
        } else if (eveningLow) {
            System.out.printf("It's %d degrees, get your Shirt and Moccasins.",temperature);
        } else if (eveningMid) {
            System.out.printf("It's %d degrees, get your Shirt and Moccasins.",temperature);
        } else {
            System.out.printf("It's %d degrees, get your Shirt and Moccasins.",temperature);
        }
    }
}
