package com.techelevator.rooms;

import com.techelevator.Player;

public class DoNotEnterThisRoom {

    private static final String INTRO = "You should not have entered this room! You can try to leave or proceed further at your own risk.";
    private static final String OPTION_TRAP_DOOR = "Open the trap door";
    private static final String OPTION_LEAVE = "Leave room";
    private static final String[] OPTIONS = {OPTION_TRAP_DOOR, OPTION_LEAVE};

    public void onEnterRoom(Player player) {

        while(true) {
            System.out.println(INTRO);

            String selectedOption = MenuDisplay.prompt(OPTIONS);
            if(selectedOption.equals(OPTION_TRAP_DOOR){
                //METHOD FOR DEATH
                // trap door = death, game start over
            }else if(selectedOption.equals(OPTION_LEAVE)){
                System.out.println("You cannot leave");
                //do we need a break here?
                //we want to stay in the room and the only real option is trapdoor
            }

        }

    }



}
