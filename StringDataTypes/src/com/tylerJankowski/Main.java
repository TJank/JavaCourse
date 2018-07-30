package com.tylerJankowski;

public class Main {

    public static void main(String[] args) {
	    String myString =  "This is a string";
	    myString = myString + ", and this is more.";
        System.out.println(myString);

        String numberString = "250";
        numberString = numberString + "50";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("last string value: " + lastString);

        // Operators
        int result = 1 + 2;


        result = result - 1;
        System.out.println("one less than result is " + result);
        result = result * 10;
        System.out.println("Ten times result is " + result);
        result = result /5;
        System.out.println("result divided by 5 equals " + result);
        result = result % 3;
        System.out.println("remainder of result is: " + result);


        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien");

        int topScore = 100;
        if (topScore == 100) // or <, >, >=, <=, !=
            System.out.println("You got the high score!");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100));
        System.out.println("Greater than second score and less than 100.");


        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar)
            System.out.println("this is not supposed to happen");

        isCar = true;
        // ternary operator
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is True");

        double myNum = 20d;
        double mySecNum = 80d;
        double total = (myNum + mySecNum) * 25d;
        System.out.println("total = " + total);
        double remainder = total % 40;
        System.out.println("Remainder is: " + remainder);
        if(remainder <=20)
            System.out.println("Total was over the limit.");




    }
}
