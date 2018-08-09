package com.tylerJankowski;

public class Main {

    public static void main(String[] args) {
	    int switchValue = 7;

	    switch(switchValue) {
            case 1:
                System.out.println("Value was 1.");
                break;

            case 2:
                System.out.println("Value was 2.");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5.");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4, or 5.");
                break;
	    }

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

        printDayOfTheWeek(5);
	    printDayOfTheWeek(0);
	    printDayOfTheWeek(3);

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

    }
}












