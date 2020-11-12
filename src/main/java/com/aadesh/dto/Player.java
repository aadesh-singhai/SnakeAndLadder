package com.aadesh.dto;

/**
 * Description - This a data class, representing a Player object having  - 
 *                  1.Constructor of class with params.
 *                  2.Params of the Ladder objects.
 * 
 * @param id - Id of Player
 * @param playerName - Name of Player
 * @param currentPos - Current Block Position of the player
 * 
 * @author Aadesh Singhai
 * @version 0.0.1
 */

public class Player {
    private String id;
    private String playerName;
    private int currentPos;

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getCurrentPos() {
        return currentPos;
    }

    public void setCurrentPos(int currentPos) {
        this.currentPos = currentPos;
    }

    public Player(String _id,String playerName) {
        this.id = _id;
        this.playerName = playerName;
        this.currentPos = 0;
    }

}
