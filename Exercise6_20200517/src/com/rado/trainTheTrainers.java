package com.rado;

import java.util.Scanner;

public class trainTheTrainers {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = Integer.parseInt(sca.nextLine());
        String inp = sca.nextLine();
        double sum = 0;
        String topic = "";
        int topic_count = 0;
        double total_sum = 0;
        while (!"Finish".equals(inp)){
            for (int i = 0; i <= n; i++){
                if(i == 0){
                    topic = inp;
                } else if ( i == n ){
                    //System.out.print( topic + " - " + sum/n + ".");
                    sum += Double.parseDouble(inp);
                    System.out.printf( "%s - %.2f.",topic,(sum/n));
                    total_sum += sum/n;
                    sum = 0;
                    topic_count += 1;
                } else {
                    sum += Double.parseDouble(inp);
                }
                inp = sca.nextLine();
            }
            //inp = sca.nextLine();
            //System.out.println(inp+"   "+sum+"  "+total_sum+"  "+topic_count);
            System.out.println("");
        }
        System.out.printf("Student's final assessment is %.2f.",(total_sum/topic_count));
    }
}
