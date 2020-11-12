package com.aadesh.utils;

import java.util.Random;
/**
 * 
 * Description - Class implementing DiceRoller and writing rollDice functionality
 * 
 */
public class AutoDiceRoller implements DiceRoller {

    /**
     * Description - using random utility to give a no from range [1-6]
     */
    @Override
    public int roll() {
        int num = new Random().nextInt(6) + 1;
        return num;
    }
    
}
