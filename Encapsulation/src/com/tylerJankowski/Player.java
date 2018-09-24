package com.tylerJankowski;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            // reduce number of lives remaining for the player
        } else {
            this.healthRemaining();
        }
    }

    public int healthRemaining() {
        return this.health;
    }

}
