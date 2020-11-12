package com.aadesh.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.aadesh.dto.Ladder;
import com.aadesh.dto.Player;
import com.aadesh.dto.Snake;

/**
 * Description - This a class, initializing the game object having  - 
 *                  1.Constructor of class .
 *                  2.Params of the Game objects.
 * 
 * @param playerList - List of Players playing the game
 * @param snakesList - List of snakes on the game board
 * @param ladderList - List of ladders on the game board
 * 
 * @author Aadesh Singhai
 * @version 0.0.1
 */

public class GameRegister {
    private ArrayList<Player> playerList = new ArrayList<>();
    private ArrayList<Snake> snakesList = new ArrayList<>();
    private ArrayList<Ladder> laddersList = new ArrayList<>();

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public ArrayList<Snake> getSnakesList() {
        return snakesList;
    }

    public ArrayList<Ladder> getLaddersList() {
        return laddersList;
    }


    public GameRegister(ArrayList<HashMap<String,String>> input) {
        Map<String,String> players = input.get(0);
        for(Map.Entry<String,String> entry : players.entrySet())
        {
            String id = entry.getKey();
            String name = entry.getValue();
            playerList.add(new Player(id,name));
        }
        Map<String,String> snakes = input.get(1);
        for(Map.Entry<String,String> entry : snakes.entrySet())
        {
            int a  = Integer.parseInt(entry.getKey());
            int b = Integer.parseInt(entry.getValue());
            this.snakesList.add(new Snake(a,b));
        }
        Map<String,String> ladders = input.get(2);
        for(Map.Entry<String,String> entry : ladders.entrySet())
        {
            int a  = Integer.parseInt(entry.getKey());
            int b = Integer.parseInt(entry.getValue());
            this.laddersList.add(new Ladder(a,b));
        }
    }
}
