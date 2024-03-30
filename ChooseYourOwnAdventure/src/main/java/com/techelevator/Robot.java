package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    private final int ROBOT_MAX_HEALTH = 100;
    private final int ROBOT_MIN_HEALTH = 0;
    private int robotHealth = ROBOT_MAX_HEALTH;
    public int getHealth() {
        return robotHealth;
    }
    public void setHealth(int health) {
        if(health > ROBOT_MAX_HEALTH) {
            this.robotHealth = ROBOT_MAX_HEALTH;
        } else if (robotHealth < ROBOT_MIN_HEALTH) {
            this.robotHealth = ROBOT_MIN_HEALTH;


        } else {
            this.robotHealth = robotHealth;
        }
    }

}
