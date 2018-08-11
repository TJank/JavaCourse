package com.tylerJankowski;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));
        System.out.println(calculateInterest(10000, 2));
        System.out.println(calculateInterest(1000, 24.9));

        for(int i = 0; i<5; i++) {
            System.out.println("Loop " + i);
        }
// challenge one
        for (int i = 2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",
                    calculateInterest(10000, i)));
        }
// challenge two
        for (int i = 8; i>=2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",
                    calculateInterest(10000, i)));
        }

        int foundPrime = 0;

        for(int i = 60; i<100; i++) {


            if(isPrime(i)) {
                foundPrime++;
                System.out.println(i + "is a prime number.");
                if(foundPrime == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }

        }

        int count = 0;
        int sum = 0;

        for(int i = 1; i<1000; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println(i + " is divisable by 3 and 5.");

            }

            if(count == 5) {
                break;
            }
        }

        System.out.println("Sum = " + sum);


    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for(int i=2; i<= (long) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static boolean isOdd(int number) {

        if(number < 0) {
            return false;
        }

        if(number % 2 !=0) {
            return true;
        } else {
            return false;
        }

    }

    public static int sumOdd(int start, int end) {

        int sum = 0;


        for(int i = start; i<=end; i++) {
            if(i<0) {
                return -1;
            }

            if(isOdd(i)) {
                sum += i;

            }
        }

        return sum;

    }



}
