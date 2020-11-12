package com.aadesh.dto;

/**
 * Description - This a data class, representing a Snake object having  - 
 *                  1.Constructor of class with params.
 *                  2.Params of the Ladder objects.
 * 
 * @param startingPos - Block no. of mouth of snake
 * @param destinationPos - Block No. of tail of snake
 * 
 * @author Aadesh Singhai
 * @version 0.0.1
 */

public class Snake {
    private int startingPos;
    private int destinationPos;

    public int getStartingPos() {
        return startingPos;
    }

    public void setStartingPos(int startingPos) {
        this.startingPos = startingPos;
    }

    public int getDestinationPos() {
        return destinationPos;
    }

    public void setDestinationPos(int destinationPos) {
        this.destinationPos = destinationPos;
    }

    public Snake(int startingPos, int destinationPos) {
        this.startingPos = startingPos;
        this.destinationPos = destinationPos;
    }
    
}
