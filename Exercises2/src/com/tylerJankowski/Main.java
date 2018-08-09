package com.tylerJankowski;

public class Main {

    public static void main(String[] args) {
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
    }

    public static double area(double radius) {

        double pi = 3.14159;

        if (radius < 0) {
            return -1.0;
        }
         return radius * radius * pi;

    }

    public static double area(double x, double y) {

        if ((x < 0) || (y < 0)) {
            return -1.0;
        }

        return x*y;

    }

    public static void printYearsAndDays(long minutes) {

        if(minutes < 0) {
            System.out.println("Invalid Value.");
        }

        long hours = (minutes / 60) % 24;
        long days =  ((minutes / 60) / 24) % 365;
        long years = ((minutes / 60) / 24) / 365;

        System.out.println(minutes + " min = " + years + " y and " + days + " d "
                + hours + " h.");

    }

    public static void printEqual(int one, int two, int three) {
        if((one < 0) || (two < 0) || (three <0)) {
            System.out.println("Invalid Value.");
        } else if ((one == two) && (one == three)) {
            System.out.println("All numbers are equal");
        } else if((one != two) && (two != three) && (one != three)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }

}
