package com.techelevator.rooms;

import com.techelevator.Player;
import com.techelevator.menu.MenuDisplay;

public class DoNotEnterThisRoom {

    private static final String INTRO = "You should not have entered this room! You can try to leave or proceed further at your own risk.";
    private static final String OPTION_TRAP_DOOR = "Open the trap door";
    private static final String OPTION_LEAVE = "Leave room";
    private static final String[] OPTIONS = {OPTION_TRAP_DOOR, OPTION_LEAVE};
    //private final int MIN_HEALTH = 0;

    public void onEnterRoom(Player player) {

        String selectedOption;
        while (true) {
            System.out.println(INTRO);

            selectedOption = MenuDisplay.prompt(OPTIONS);
            if (selectedOption.equals(OPTION_TRAP_DOOR)) {

                onTrapDoor(player);
                //METHOD FOR DEATH

                // trap door = death, game start over


            //trap door = death, game start over



        }
        if(selectedOption.equals(OPTION_LEAVE)) {
            System.out.println("You cannot leave");

            //do we need a break here?
            //we want to stay in the room and the only real option is trapdoor
        }

    }
    }

    private void onTrapDoor(Player player) {
        boolean trapDoorOpened = true;
        if(trapDoorOpened) {
            //math.random returns a value between 0 and 1, randomly
            //player.setHealth(MIN_HEALTH);
            System.out.println("You have died! :(");
            System.exit(0);
        }
    }



}
