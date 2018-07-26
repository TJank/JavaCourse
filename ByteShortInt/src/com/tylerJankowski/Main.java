package com.tylerJankowski;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
	    int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myByteValue = 10;
        byte minByteValue = -128;
        byte maxByteValue = 127;
        byte myNewByteValue = (byte) (minByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = -32768;
        short myMaxShortValue = 32767;
        short myNewShort = (short) (myShortValue / 2);

        // long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;



        // exercise
        byte myB = 64;
        short myS = 10;
        int myInt = 10000;
        long myLongDong = 50000L + 10L * (myB + myS + myInt);
        System.out.println("longTotal = " + myLongDong);


    }
}
