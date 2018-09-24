package com.tylerJankowski;

class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(int cylinders, String name) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> acclerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean hasEngine() {
        return engine;
    }


}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders,String name ) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> acclerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

class Ford extends Car {

    public Ford(int cylinders,String name ) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}



public class Main {

    public static void main(String[] args) {
        Car car = new Car(8,"Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car car2 = new Mitsubishi(8,"Eclipse");
        System.out.println(car2.startEngine());
        System.out.println(car2.accelerate());
        System.out.println(car2.brake());

        Car car3 = new Ford(8,"Exploder");
        System.out.println(car3.startEngine());
        System.out.println(car3.accelerate());
        System.out.println(car3.brake());

    }
}
