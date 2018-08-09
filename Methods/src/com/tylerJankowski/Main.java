package com.tylerJankowski;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePositoin("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePositoin("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePositoin("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePositoin("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePositoin("Ty", highScorePosition);


        printMegaBytesAndKiloBytes(5000);



    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return  finalScore;
        } else {
            return -1;
        }

    }

    public static void displayHighScorePositoin(String playerName, int playerPosition ) {
        System.out.println(playerName + " managed to get into position " + playerPosition
                + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        }
//        else if (playerScore >= 500) {
//            return 2;
//        }
//        else if (playerScore > 100) {
//            return 3;
//        }
//
//        return 4;

        int position = 4;


        return position;

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int kiloByteToMegaByte = 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / kiloByteToMegaByte;
            int remainingKiloBytes = kiloBytes % kiloByteToMegaByte;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and "
                    + remainingKiloBytes + " KB");
        }


    }


}























