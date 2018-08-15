package com.tylerJankowski;

public class Main {

    public static void main(String[] args) {
//	    int count = 0;
//	    while (count!=5) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count= 1;
//        do{
//            System.out.println("Count value was " + count);
//            count++;
//        } while (count!=6);

        int number = 4;
        int finishedNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishedNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
            evenNumbersFound++;
            if(evenNumbersFound >= 5) {
                break;
            }
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);

    }

    public static boolean isEvenNumber(int number) {
        if(number % 2 ==0) {
            return true;
        } else {
            return false;
        }
    }
}
