package com.tylerJankowski;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basisc", "Sausage", "White", 3.65);
	    double price = hamburger.itemizeHamburger();
	    hamburger.addHambergerAddition2("tomatoe", .50);
	    hamburger.addHambergerAddition3("Lettuce", .12);
	    hamburger.addHambergerAddition4("Cheese", .50);
        System.out.println("Total burger price is: " + hamburger.itemizeHamburger());

		HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
		healthyBurger.itemizeHamburger();
		System.out.println("Total for healthy burger with bacon is: " + healthyBurger.itemizeHamburger());

    }
}
