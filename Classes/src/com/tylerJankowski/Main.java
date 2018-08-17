package com.tylerJankowski;

public class Main {

    public static void main(String[] args) {
	    // classes have state and behavior as characteristics
        // stores state as fields (variables)
        // behavior is described as its methods

        Car porsche = new Car();
        Car holden = new Car();

        porsche.setColor("gold");
        porsche.setWheels(4);
        porsche.setEngine("v8");

        System.out.println(porsche.getEngine());

    }
}
