package com.tylerJankowski;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	    Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your year of birth: ");
//
//        boolean hasNextInt = scanner.hasNextInt();
//        if(hasNextInt) {
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine(); // handle next line character (enter key)
//
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//            int age = 2018 - yearOfBirth;
//
//            if (age >= 0 && age <= 100) {
//                System.out.println("Your name is " + name
//                        + ", and you are " + age + " years old.");
//            } else {
//                System.out.println("Invalid year of birth.");
//            }
//        } else System.out.println("Invalid Input: 'BirthYear'");
//        scanner.close();

        // challenge
        // ReadingUserInputChallenge
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int number = 0;
        int sum = 0;

        System.out.println("Enter Number #" + count);

        boolean hasNextInt = scanner.hasNextInt();
        while (count <= 10) {

            if(hasNextInt) {

                number += scanner.nextInt();
                sum += scanner.nextInt();
                number *= 10;
                count++;


            }else System.out.println("Invalid Number");
        }




    }
}
