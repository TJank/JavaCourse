package com.tylerJankowski;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Tim", 500);
        System.out.println("New score is "+ newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(5,6);
        calcFeetAndInchesToCentimeters(6,-10);
        calcFeetAndInchesToCentimeters(32);
        calcFeetAndInchesToCentimeters(12);
        calcFeetAndInchesToCentimeters(6,0);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player namae, no player score.");
        return 0;
    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        double totalInches = 0d;
        double centimeters = 0d;

        if ((feet <= 0) || ((inches < 0) || (inches > 12))) {
            System.out.println(-1);
            return -1d;
        } else {
           totalInches = (feet * 12) + inches;
           centimeters = totalInches * 2.54;
           System.out.println(feet + " Feet " + inches + " Inches = "
                   +  centimeters + " Centimeters");
           return centimeters;

        }

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        double centimeters = 0d;

        if (inches <= 0) {
            System.out.println(-1);
            return -1d;
        } else {
            double numFeet = (int) inches / 12;
            double parsedInches = (int) inches % 12;
            calcFeetAndInchesToCentimeters(numFeet, parsedInches);
            return 1;


        }

    }


}
