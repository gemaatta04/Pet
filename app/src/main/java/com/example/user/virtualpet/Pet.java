package com.example.user.virtualpet;

import java.io.Serializable;

public class Pet implements Serializable {
    /** Name of the Pet. */
    private String name;
    /** Type of Pet. */
    private String type;
    /** Health points. */
    private int health;
    /** Happiness points. */
    private int happy;
    /** Maximum happy points to level up. */
    private int maxHappy;
    /** Maximum health points to level up. */
    private int maxHealth;
    /** Default constructor. */
    public Pet() {  }
    /** A new pet is made upon start up. */
    public Pet(String setName) {
        // Name is set by the user.
        this.name = setName;
        // New pets start at level one.
        this.type = "Level One";
        this.health = 0;
        this.happy = 0;
        this.maxHappy = 30;
        this.maxHealth = 30;
    }

    public int getHealth() {
        return this.health;
    }
    public int getHappy() {
        return this.happy;
    }
    public void setHealth(int setHealth) {
        this.health = setHealth;
    }
    public void setHappy(int setHappy) {
        this.happy = setHappy;
    }
    public String getType() { return this.type; }

    public void feed() {
        happy += 2;
        health += 2;
        meter();
        //levelUp(type);
    }
    public void clean() {
        health += 5;
        meter();
        //levelUp(type);
    }
    public void play() {
        happy += 5;
        meter();
        //levelUp(type);
    }
    public boolean levelUp(String type) {
        /*
         * 2. check if the happy and health meters have been reached.
         *      >> This is a separate boolean function in each level class.
         * 3. If true, the type is a new instance of the next level.
         * 4. happiness and health are reset.
         */
        if (type.equals("Level One")) {
            if (meter()) {
                this.type = "Level Two";
                this.health = 0;
                this.happy = 0;
                this.maxHappy = 50;
                this.maxHealth = 50;
                return true;
            }
        }
        if (type.equals("Level Two")) {
            if (meter()) {
                this.type = "Level Three";
                this.health = 0;
                this.happy = 0;
                this.maxHappy = 100;
                this.maxHealth = 100;
                return true;
            }
        }
        return false;
    }
    /**
     * Check if the maximum happiness and health points have been met.
     * Called by the levelUp() method in Pet parent class.
     * Also resets the happiness and health points so that it never goes over the maximum.
     */
    private boolean meter() {
        if (!(this.type.equals("Level Three")) && this.getHealth() > maxHealth) {
            this.setHealth(maxHealth);
        }
        if (!(this.type.equals("Level Three")) && this.getHappy() > maxHappy) {
            this.setHappy(maxHappy);
        }
        if (this.getHappy() >= maxHappy && this.getHealth() >= maxHealth) {
            return true;
        }
        return false;
    }
}
