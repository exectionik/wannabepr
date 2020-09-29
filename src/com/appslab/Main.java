package com.appslab;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Please put height of tower: ");
        double height_tower = myObj.nextDouble();

        System.out.println("Please put height of step :/: ");
        double height_step = myObj.nextDouble();

        System.out.println("Please put lenght of step: ");
        double lenght_step = myObj.nextDouble();

        double distance = height_tower / height_step * (height_step + lenght_step);
        System.out.println("Snail is going to travel: " + distance);

    }
}
