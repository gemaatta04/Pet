package com.example.user.virtualpet;

import java.io.Serializable;

public class Pet implements Serializable {
    /** Name of the Pet. */
    private String name;
    /** Type of Pet. */
    private Pet type;
    /** Health points. */
    private int health;
    /** Happiness points. */
    private int happy;
    /** Default constructor. */
    public Pet() {  }
    /** A new pet is made upon start up. */
    public Pet(String setName) {
        // Name is set by the user.
        this.name = setName;
        // New pets start at level one.
        this.type = new LevelOne();
        this.health = 0;
        this. happy = 0;
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
    public void feed() {
        // something interactive should happen here...
        // like the image changes to it eating for 3 seconds
        happy += 2;
        health += 2;
        levelUp(type);
    }
    public void clean() {
        // image changes to it being washed for 3 seconds
        health += 5;
        levelUp(type);
    }
    public void play() {
        // not sure what will happen in play yet but image changes too
        happy += 5;
        levelUp(type);
    }
    private void levelUp(Pet type) {
        /* 1. downcast to the appropriate Pet level.
         * 2. check if the happy and health meters have been reached.
         *      >> This is a separate boolean function in each level class.
         * 3. If true, the type is a new instance of the next level.
         * 4. happiness and health are reset.
         */
        if (type instanceof LevelOne) {
            LevelOne pet = (LevelOne) type;
            if (pet.meter()) {
                this.type = new LevelTwo();
                this.health = 0;
                this.happy = 0;
            }
        }
        if (type instanceof LevelTwo) {
            LevelTwo pet = (LevelTwo) type;
            if (pet.meter()) {
                this.type = new LevelTwo();
                this.health = 0;
                this.happy = 0;
            }
        }
    }
}
