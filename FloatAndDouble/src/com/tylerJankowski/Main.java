package com.tylerJankowski;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
	    int myIntValue = 5 / 2;
	    // width of a float = 32 (4 bytes)
	    float myFloat = 5f / 3f;
	    // width of double = 64 (8 bytes)
	    double myDouble = 5d / 3d;

        System.out.println("myInt = " + myIntValue);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myDouble = " + myDouble);

        int pounds = 135;
        double poundToKiloG = 0.45359237d;
        double weight = (double) pounds * poundToKiloG;

        System.out.println("Weight in Kilograms: " + weight);

    }
}
