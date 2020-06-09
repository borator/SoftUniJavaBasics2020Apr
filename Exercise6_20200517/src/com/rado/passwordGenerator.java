package com.rado;

import java.util.Scanner;

public class passwordGenerator {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = Integer.parseInt(sca.nextLine());
        int l = Integer.parseInt(sca.nextLine());
        String everything = "";
        for (int a = 1; a < n; a++){
            for (int b = 1; b < n; b++){
                for (int c = 0; c < l; c++){
                    for (int d = 0; d < l; d++){
                        for (int e = 1; e <= n; e++){
                            if(e > a && e > b) {
                                //System.out.printf("%s%s%c%c%d", a, b, (char) (97 + c), (char) (97 + d), e);
                                //System.out.println();
                                everything += String.valueOf(a);
                                everything += String.valueOf(b);
                                everything += (char) (97 + c);
                                everything += (char) (97 + d);
                                everything += String.valueOf(e);
                                everything += " ";
                            }
                        }
                    }
                }
            }
        }
        System.out.println(everything);
    }
}
