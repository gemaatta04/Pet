package com.example.user.virtualpet;

public class LevelOne extends Pet {
    /** Happiness points needed to level up. */
    private static final int MAX_HAPPY = 30;
    /** Health points needed to level up. */
    private static final int MAX_HEALTH = 30;
    public LevelOne() {
        // There should be an image change here.
        // Image change should also maintain on the screen until it levels up again.
    }

    /**
     * Check if the maximum happiness and health points have been met.
     * Called by the levelUp() method in Pet parent class.
     * Also resets the happiness and health points so that it never goes over the maximum.
     *
     * @param pet the pet that is passed.
     */
    private boolean meter(LevelOne pet) {
        if (pet.getHealth() > MAX_HEALTH) {
            pet.setHealth(MAX_HEALTH);
        }
        if (pet.getHappy() > MAX_HAPPY) {
            pet.setHappy(MAX_HAPPY);
        }
        if (pet.getHappy() >= MAX_HAPPY && pet.getHealth() >= MAX_HEALTH) {
            return true;
        }
        return false;
    }
}
