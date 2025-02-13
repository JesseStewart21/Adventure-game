package com.techelevator.rooms;

import com.techelevator.menu.MenuDisplay;
import com.techelevator.Player;

public class GreenRoom {

    private static final String INTRO = "Welcome to the green room! There is a robot powered by ChatGPT and it wants to fight you. What do you do?";

    private static final String OPTION_FIGHT = "Fight the robot";
    private static final String OPTION_LEAVE = "Leave room";
    private static final String[] OPTIONS = {OPTION_FIGHT, OPTION_LEAVE};

    private final int MAX_HEALTH = 100;
    private final int MIN_HEALTH = 0;

    public void onEnterRoom(Player player) {

        while(true) {

            System.out.println(INTRO);

            String selectedOption = MenuDisplay.prompt(OPTIONS);
            if(selectedOption.equals(OPTION_FIGHT)){
                onFightRobot(player);
            }else if(selectedOption.equals(OPTION_LEAVE)){
                System.out.println("You exit the room");
                break;
            }


        }

    }

    private void onFightRobot(Player player) {

        boolean robotWins = ((int)(Math.random() * 10)) <= 5;

        if(robotWins) {
            //math.random returns a value between 0 and 1, randomly
            int healthDeduction = (int) (Math.random() * 20);
            player.setHealth(player.getHealth() - healthDeduction);
            System.out.println("Oh no! The robot is too fast. Your health is down to " + player.getHealth());
                if(player.getHealth() == MIN_HEALTH) {
                    System.out.println("You have died! :(");
                    System.exit(0);
                }
        } else {
            System.out.println("You damaged the robot!");
        }
    }
}
