package com.tylerJankowski;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;

        while (true) {
            System.out.println("Enter number:");

            boolean isAnInt = scanner.hasNextInt();


            if(isAnInt) {
                int number = scanner.nextInt();

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }

                if (min == 0) {
                    min = number;
                }

                scanner.hasNextLine();

            } else {
                break;
            }


        }

        System.out.println("Greatest Number: " + max + " Smallest Number = " + min);
        scanner.close();
    }
}
