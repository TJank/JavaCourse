package com.tylerJankowski;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {

        System.out.println(getDurationString(200, 45));
        System.out.println(getDurationString(3645));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65,9));

    }

    private static String getDurationString(int minutes, int seconds) {

        if ((minutes < 0 ) || ((seconds < 0) || (seconds > 59))) {
            System.out.println("Invalid Value");
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int remainingMin = minutes % 60;

        String hoursString = hours + "h";
        if(hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMin + "m";
        if(remainingMin < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if(seconds < 10) {
            secondsString = "0" + secondsString;
        }


        return hoursString + " " + minutesString + " " + secondsString;


    }

    private static String getDurationString(int seconds) {

        if (seconds < 0) {
            System.out.println("Invalid Value");
            return INVALID_VALUE_MESSAGE;
        } else {
            int minutes = seconds / 60;
            int remainingSec = seconds % 60;

            return getDurationString(minutes, remainingSec);
        }

    }



}
