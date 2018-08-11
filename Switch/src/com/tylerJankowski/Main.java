package com.tylerJankowski;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));



	    char value = 'E';

	    switch (value) {
            case 'A' :
                System.out.println("Value Returned: A");
                break;

            case 'B':
                System.out.println("Value Returned: B");
                break;

            case 'C':
                System.out.println("Value Returned: C");
                break;

            case 'D':
                System.out.println("Value Returned: D");
                break;

            case 'E':
                System.out.println("Value Returned: E");
                break;

            default:
                System.out.println("Value not found.");
                break;
	    }

	    String month = "January";

	    switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not Sure");
        }

//        printDayOfTheWeek(5);
//	    printDayOfTheWeek(0);
//	    printDayOfTheWeek(3);

    }

    // Day of the week challenge
    private static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println("Today is Sunday");
                break;

            case 1:
                System.out.println("Today is Monday");
                break;

            case 2:
                System.out.println("Today is Tuesday");
                break;

            case 3:
                System.out.println("Today is Wednesday");
                break;

            case 4:
                System.out.println("Today is Thursday");
                break;

            case 5:
                System.out.println("Today is Friday");
                break;

            case 6:
                System.out.println("Today is Saturday");
                break;
        }
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;

            case 1:
                System.out.println("ONE");
                break;

            case 2:
                System.out.println("TWO");
                break;

            case 3:
                System.out.println("THREE");
                break;

            case 4:
                System.out.println("FOUR");
                break;

            case 5:
                System.out.println("FIVE");
                break;

            case 6:
                System.out.println("SIX");
                break;

            case 7:
                System.out.println("SEVEN");
                break;

            case 8:
                System.out.println("EIGHT");
                break;

            case 9:
                System.out.println("NINE");
                break;

            default:
                System.out.println("OTHER");
        }
    }

    public static boolean isLeapYear(int year) {
        if((year < 1) || (year > 9999)) {
            return false;
        }
        else if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            return true;
        } else {
            return false;
        }

    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12)) {
            return -1;
        }
        if ((year < 1) || (year > 9999)) {
            return -1;
        }

        boolean isLeapYear = isLeapYear(year);

        switch (month) {
            case 1:
                return 31;


            case 2:
                if(isLeapYear) {
                    return 29;
                } else {
                    return 28;
                }

            case 3:
                return 31;
            case 4:
                return 30;

            case 5:
                return 31;

            case 6:
                return 30;

            case 7:
                return 31;

            case 8:
                return 31;

            case 9:
                return 30;

            case 10:
                return 31;

            case 11:
                return 30;

            case 12:
                return 31;

            default:
                return -1;
        }

    }

}












