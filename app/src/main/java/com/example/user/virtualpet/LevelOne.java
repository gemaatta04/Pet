package com.example.user.virtualpet;

import java.io.Serializable;

public class LevelOne extends Pet implements Serializable {
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
     */
    public boolean meter() {
        if (this.getHealth() > MAX_HEALTH) {
            this.setHealth(MAX_HEALTH);
        }
        if (this.getHappy() > MAX_HAPPY) {
            this.setHappy(MAX_HAPPY);
        }
        if (this.getHappy() >= MAX_HAPPY && this.getHealth() >= MAX_HEALTH) {
            return true;
        }
        return false;
    }
}
