package com.tylerJankowski;

// constructor challenge!

public class Main {

    public static void main(String[] args) {
	    // classes have state and behavior as characteristics
        // stores state as fields (variables)
        // behavior is described as its methods

//        Car porsche = new Car();
//        Car holden = new Car();
//
//        porsche.setColor("gold");
//        porsche.setWheels(4);
//        porsche.setEngine("v8");
//
//        System.out.println(porsche.getEngine());

//        BankAccount defaultAccount = new BankAccount();
//
//        BankAccount savings = new BankAccount("123456", 0.00, "Tyler",
//                "tyler@hotmail.com", "507-226-3553");
//
//        savings.depositFunds(500);
//        savings.withdrawFunds(250);

        VipCustomer tyler = new VipCustomer("Tyler",
                "tyler@gmail.com");
        System.out.println(tyler.getCreditLimit());

    }
}
