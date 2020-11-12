# BlackHawk Hiring challenge(machine-coding)
[![Generic badge](https://img.shields.io/badge/build-passing-any.svg)](https://shields.io/)
[![Generic badge](https://img.shields.io/badge/version-v0.0.1-blue.svg)](https://shields.io/)
[![Generic badge](https://img.shields.io/badge/built%20wth-gradle-red.svg)](https://shields.io/)
## Problem Context - Snakes and Ladders Game.
Coding challenge is to replicate the Snake and Ladder Board game,where the game is getting played automatically between the given number of Players.
* Rules of the game 
    * The board will have 100 blocks
    * Used regular dice which always give a random number[1-6] on rolling it.
    * Starting position of each player is 0.
    * Player moves on the outcome of dice.
    * If outcome of Dice is 6, dice is rolled again.
    * Winning Position is 100.
    * Player doesn't move above position 100.
    * If a player reaches a block where snake/ladder is present,player will get bit/climb the ladder.

* Assumptions
    * It is possible to win the game.
    * No infinite loop is formed by snake & ladder.
    * Snake is not present at block 100.

## Input/Output
* I/P - Text File with format - \
    Player_Count(n) \
    No. of n lines denoting player no. and player name \
    Snake_count(s) \
    No. of s lines denoting mouth position and tail position of snake \
    Ladder_count(l) \
    No. of l lines denoting the foot position and top position of ladder 
* O/P - Console Winner
### SAMPLE INPUT/OUTPUT 
* INPUT \
     2 \
     1 Player1 \
     2 Player2 \
     4 \
     98 7 \
     94 78 \
     34 6 \
     62 18 \
     4 \
     4 14 \
     1 38 \
     77 99 \
     71 92 
* OUTPUT \
    *************************** GAME ENDED *************************** \
    ******************* PLAYER1 WON IN 14 CHANCES ******************* 


## System Requirments
1. Java 1.8 or above
2. Gradle v5.1.1 or above
## Steps to build
1. Clone the repository ```$ git clone https://github.com/aadesh-singhai/SnakeAndLadder.git```
2. Go to the root directory and install dependencies```$ .\gradlew build```
3. Go to the root directory and run the program```$ java -jar <pathToJar/addesh.jar <path-to-input-file>```
