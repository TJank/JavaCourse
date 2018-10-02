package com.tylerJankowski;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basisc", "Sausage", "White", 3.65);
	    double price = hamburger.itemizeHamburger();
	    hamburger.addHambergerAddition2("tomatoe", .50);
	    hamburger.addHambergerAddition3("Lettuce", .12);
	    hamburger.addHambergerAddition4("Cheese", .50);
        System.out.println("Total burger price is: " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHambergerAddition1("Egg", 5.67);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());

    }
}
