package com.aadesh.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.aadesh.dto.Ladder;
import com.aadesh.dto.Player;
import com.aadesh.dto.Snake;
import com.aadesh.utils.DiceRoller;
import com.aadesh.utils.DiceRollerFactory;

/**
 * Description - A class that implements the SnakeAndLadder class, responsible for - 
 *                  1. Starting the game.
 *                  2. Check if player has won.
 *                  3. Display the winner.
 * 
 * @author Aadesh Singhai
 * @version 0.0.1
 */

public class SnakeAndLadderImpl implements SnakeAndLadder {

    private static final int WINNING_POS = 100;
    public int movesCount;
    boolean game_ended;
    

    /**
     * Description - Main driver method to start the game and play the chances of player roundwise.
     */
    @Override
    public void startGame(GameRegister game) throws ClassNotFoundException {
        ArrayList<Player> players = game.getPlayerList();
        ArrayList<Snake> snakes = game.getSnakesList();
        ArrayList<Ladder> ladders = game.getLaddersList();
        HashMap<Integer,Snake> snakeMap= new HashMap<>();
        HashMap<Integer,Ladder> ladderMap= new HashMap<>();
        for( Snake snake : snakes )
            snakeMap.put(snake.getStartingPos(), snake);
        for( Ladder ladder : ladders)
            ladderMap.put(ladder.getStartingPos(), ladder);

        DiceRoller diceRoller = DiceRollerFactory.INSTANCE.getDiceRoller("AUTO");
        movesCount = 0;
        game_ended = false;
        while(!game_ended)
        {
            movesCount++;
            for(Player currentPlayer : players)
            {
                int oldPos = currentPlayer.getCurrentPos();
                String name = currentPlayer.getPlayerName();
                int diceRoll = diceRoller.roll();
                System.out.println(name+" ROLLING DICE - GOT : "+ diceRoll);
                if(diceRoll == 6)
                {
                    while(true)
                    {
                        int temproll = diceRoller.roll();
                        System.out.println(name+" ROLLING DICE AGAIN - GOT : "+ temproll);
                        diceRoll+=temproll;
                        if(temproll != 6)
                            break;
                    }
                }
                int newPos = oldPos + diceRoll;
                if( snakeMap.containsKey(newPos) )
                {
                    Snake temp = snakeMap.get(newPos);
                    int endPoint = temp.getDestinationPos();
                    currentPlayer.setCurrentPos(endPoint);
                    System.out.println(name+ " BIT BY SNAKE AT POSITION "+newPos+" AND MOVED TO POSITION "+ endPoint);
                }
                else if( ladderMap.containsKey(newPos) )
                {
                    Ladder temp = ladderMap.get(newPos);
                    int endPoint = temp.getDestinationPos();
                    currentPlayer.setCurrentPos(endPoint);
                    System.out.println(name+ " CLIMBED STAIRS AT POSITION "+newPos+" AND MOVED TO POSITION "+ endPoint);
                }
                else if( newPos <= WINNING_POS) 
                {
                    currentPlayer.setCurrentPos(newPos);
                    System.out.println(name+ " MOVED TO POSITION "+newPos);
                    if(hasWon(currentPlayer))
                    {
                        game_ended = true;
                        displayWinner(currentPlayer);
                        break;
                    }
                }
            }
        }

    }

    /**
     * 
     * Description - Function to check if thte player has won by going to winning position.
     */
    @Override
    public boolean hasWon(Player player) {
        boolean ans = (player.getCurrentPos() == WINNING_POS) ;
        return ans;
    }

    /**
     * 
     * Description - Function to display the winner with the no. of chances played by the player.
     */
    @Override
    public void displayWinner(Player player) {
        String name = player.getPlayerName().toUpperCase();
        System.out.println("*************************** GAME ENDED ***************************");
        System.out.println("******************* "+name+" WON IN "+movesCount+" CHANCES *******************");
    }
}
