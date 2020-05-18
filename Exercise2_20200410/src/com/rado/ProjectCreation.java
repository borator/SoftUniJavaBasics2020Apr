package com.rado;

import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String name = sca.nextLine();
        Integer numberOfProjects = sca.nextInt();
        System.out.println("The architect "+name+" will need "+numberOfProjects*3+" hours to complete "+numberOfProjects+" project/s.");
    }
}
