package com.aadesh.dto;

/**
 * Description - This a data class, representing a Ladder object having  - 
 *                  1.Constructor of class with params.
 *                  2.Params of the Ladder objects.
 * 
 * @param startingPos - Block no. of foot of ladder
 * @param destinationPos - Block No. of top of ladder
 * 
 * @author Aadesh Singhai
 * @version 0.0.1
 */

public class Ladder {
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

    public Ladder(int startingPos, int destinationPos) {
        this.startingPos = startingPos;
        this.destinationPos = destinationPos;
    }
}
