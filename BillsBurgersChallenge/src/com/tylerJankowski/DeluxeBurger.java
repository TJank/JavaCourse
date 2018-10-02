package com.tylerJankowski;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", "White", 14.54);
        super.addHambergerAddition1("Chips", 2.75);
        super.addHambergerAddition2("Drink", 1.81);
    }

    @Override
    public void addHambergerAddition1(String name, double price) {
        System.out.println("Can not addd additional items to deluxe burger");
    }

    @Override
    public void addHambergerAddition2(String name, double price) {
        System.out.println("Can not addd additional items to deluxe burger");
    }

    @Override
    public void addHambergerAddition3(String name, double price) {
        System.out.println("Can not addd additional items to deluxe burger");
    }

    @Override
    public void addHambergerAddition4(String name, double price) {
        System.out.println("Can not addd additional items to deluxe burger");
    }
}
