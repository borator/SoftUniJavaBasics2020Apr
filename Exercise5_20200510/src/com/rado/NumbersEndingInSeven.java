package com.rado;

public class NumbersEndingInSeven {
    public static void main(String[] args) {
        for(int i =7;i<=997;i++){
            if(i%10==7){
                System.out.printf("%d\n",i);
            }
        }
    }
}
