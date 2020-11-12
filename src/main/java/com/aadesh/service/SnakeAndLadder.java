package com.aadesh.service;

import com.aadesh.dto.Player;

/**
 * Description - An Interface that defines the contract for the game program-
 *                  1. Start game.
 *                  2. Check if player has won.
 *                  3. Display the winner.
 * 
 * @author Aadesh Singhai
 * @version 0.0.1
 */

public interface SnakeAndLadder {
    void startGame(GameRegister game) throws ClassNotFoundException;
    boolean hasWon(Player player);
    void displayWinner(Player player);
}
