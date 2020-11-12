package com.aadesh.utils;

/**
 * 
 * Description - Dice Roller Factory, responsible for returning instance of diceRoller required.
 * 
 */

public enum DiceRollerFactory {
    INSTANCE;
    public DiceRoller getDiceRoller(String type) throws ClassNotFoundException
    {
        switch (type.toLowerCase()) {
            case "auto":
              return new AutoDiceRoller();
            default:
              throw new ClassNotFoundException("Dice Rolling type not supported");
          }
    }
}
