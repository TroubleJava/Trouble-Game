/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplechat;

import java.io.Serializable;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author scherr3143
 */
public class Trouble implements Serializable {

    public int numOfPlayers;
    public objPlayer player1;
    public objPlayer player2;
    public objPlayer player3;
    public objPlayer player4;
    public objPlayer objCurrentPlayer;
    public objPlayer[] players;
    public int currentRoll;
    private boolean moveFromStart = false;
    public boolean playerWin = false;
    public boolean hasExtraTurn = false;
    public boolean turnOver = false;

    /**
     *
     */
    public Trouble() {
        //board = null;
    }

    public Trouble(String p1, String p2) {

        numOfPlayers = 2;
        player1 = new objPlayer('R', p1);
        player2 = new objPlayer('B', p2);
        players = new objPlayer[]{player1, player2};
        setCurrentPlayer(player2);
        //board = null;
    }

    public Trouble(String p1, String p2, String p3) {
        numOfPlayers = 3;
        player1 = new objPlayer('R', p1);
        player2 = new objPlayer('B', p2);
        player3 = new objPlayer('Y', p3);
        players = new objPlayer[]{player1, player2, player3};
        setCurrentPlayer(player3);
        //board = null;
    }

    public Trouble(String p1, String p2, String p3, String p4) {
        numOfPlayers = 4;
        player1 = new objPlayer('R', p1);
        player2 = new objPlayer('B', p2);
        player3 = new objPlayer('Y', p3);
        player4 = new objPlayer('G', p4);
        players = new objPlayer[]{player1, player2, player3, player4};
        setCurrentPlayer(player4);
        //board = null;
    }

    public void switchActivePlayer() {
        switch (numOfPlayers) {
            case 2:
                if (objCurrentPlayer.equals(player1)) {
                    setCurrentPlayer(player2);
                } else {
                    setCurrentPlayer(player1);
                }
                break;
            case 3:
                if (objCurrentPlayer.equals(player1)) {
                    setCurrentPlayer(player2);
                } else if (objCurrentPlayer.equals(player2)) {
                    setCurrentPlayer(player3);
                } else {
                    setCurrentPlayer(player1);
                }
                break;
            case 4:
                if (objCurrentPlayer.equals(player1)) {
                    setCurrentPlayer(player2);
                } else if (objCurrentPlayer.equals(player2)) {
                    setCurrentPlayer(player3);
                } else if (objCurrentPlayer.equals(player3)) {
                    setCurrentPlayer(player4);
                } else {
                    setCurrentPlayer(player1);
                }
                break;
        }
    }

    /**
     * @return the intCurrentPlayer
     */
    public objPlayer getCurrentPlayer() {
        return objCurrentPlayer;
    }

    /**
     * @param intCurrentPlayer the intCurrentPlayer to set
     */
    public void setCurrentPlayer(objPlayer objCurrentPlayer) {
        this.objCurrentPlayer = objCurrentPlayer;
    }
    //returns the random die roll
    public void setRollDie(int roll) {
        currentRoll = roll;
    }
    //Player movement
    public void move(int positionOfCurrentPiece) {
        // Set variable for index of current piece out of bounds
        int indexOfCurrentPiece = -1;
        // Loop through current players pieces
        for (int k = 0; k < 4; k++) {
            // Locate a piece where the position matches that of selected piece
            if (objCurrentPlayer.piece[k].getPosition() == positionOfCurrentPiece) {
                // Change variable for index to the selected piece
                indexOfCurrentPiece = objCurrentPlayer.piece[k].getIndex();
                // Since piece index found exit loop
                k = 5;
            }
        }
        // If the selected piece is from start
        if (positionOfCurrentPiece == -1){
            // Check the roll to make sure it's a six, or else the piece cannot move
            if(currentRoll == 6){
                // Roll was a six piece might be able to move from start
                char colourOfCurrentPiece = objCurrentPlayer.getColour();
                // Before moving need to check if player already has piece at location
                boolean bolDidILandOnMe = checkLandingOnPlayer(objCurrentPlayer.getStartIndex(colourOfCurrentPiece));
                // False I did not land on me
                if(!bolDidILandOnMe){
                    // Set piece in the correct colors start
                    objCurrentPlayer.piece[indexOfCurrentPiece].setPosition(objCurrentPlayer.getStartIndex(colourOfCurrentPiece));
                }
                // True I landed on me, need to select another piece
                else{
                    // Break out??
                }
            }
        }
        else{
            // Obtain the new position piece wants to move to
            int newPOB = checkCycleOfBoard(positionOfCurrentPiece);
            // Piece can move, check to see if it will enter it's home location
            boolean bolAmIAtHome = checkForEntryToHome(positionOfCurrentPiece, newPOB);
            // False not at home, continue regular movement
            if(!bolAmIAtHome){
                // Before moving need to check if player already has piece at location
                boolean bolDidILandOnMe = checkLandingOnPlayer(newPOB);
                // False I did not land on me
                if(!bolDidILandOnMe){
                    // Sets new location
                    objCurrentPlayer.piece[indexOfCurrentPiece].setPosition(newPOB);
                }
                // True I landed on me, need to select another piece
                else{
                    //break out??
                }
            }
            // True I am at home, enter the end spots
            else{
                // Sets location to Home
                objCurrentPlayer.piece[indexOfCurrentPiece].setPosition(28);
            }
        }
        // Check for a win condition
        checkWin();
    }
    
    //Check to see if piece must pass through the 27 & 0 corner of board
    public int checkCycleOfBoard(int positionOfCurrentPiece){
        // Using current position and the die roll total new location
        int newPositionOnBoard = positionOfCurrentPiece + currentRoll;
        // If new location is outside board bounds it is rounding the corner
        if (newPositionOnBoard > 27) {
            // Subtract the board length to obtain the new position
            newPositionOnBoard = newPositionOnBoard - 28;
        }
        // Return new position of piece
        return newPositionOnBoard;
    }
    
    //Check to see if the player is landing on another player or themselves
    public boolean checkLandingOnPlayer(int newPOB){
        // Set condition to false
        boolean bolLanded = false;
        // Loop through each player
        for (int i = 0; i < numOfPlayers; i++) {
            // Loop through each players piece
            for (int j = 0; j < 4; j++) {
                // If a piece holds the same position as the new position
                if (players[i].piece[j].getPosition() == newPOB) {
                    // Is the piece the same as the current players
                    if (objCurrentPlayer.getColour() != players[i].getColour()) { 
                        // Piece is another players, send it back to it's start
                        players[i].piece[j].setPosition(-1);
                    }
                    // Piece is the same colour as the current players
                    else{
                        // Landed on own piece, invalid move
                        bolLanded = true;
                    }
                }
            }
        }
        // Return condition
        return bolLanded;
    }
    // Check piece for movement into it's home
    public boolean checkForEntryToHome(int positionOfCurrentPiece, int newPOB){
        // Set condition to false
        boolean bolAtHome = false;
        // Red has to follow seperate rules for location if piece can go home
        if(objCurrentPlayer.getColour() == 'R'){
            if((positionOfCurrentPiece+currentRoll) > objCurrentPlayer.getHomeIndex(objCurrentPlayer.getColour())){
                bolAtHome = true;
            }
        }
        // Check home rules for all other colours
        else{
            // Check current position of piece, is it less than players home index
            if(positionOfCurrentPiece <= objCurrentPlayer.getHomeIndex(objCurrentPlayer.getColour())){
                // Check new position of piece, is it equal to or greater than it's start index
                if(newPOB >= objCurrentPlayer.getStartIndex(objCurrentPlayer.getColour())){
                    // Both conditions are true meaning piece is moving past home, instead send it home
                    bolAtHome = true;
                }
            }
        }
        // Return condition
        return bolAtHome;
    }
    //Last thing to do on a turn
    public void checkWin() {
        //Check amount of pieces in home
        int homeCount = 0;
        // Loop through a players pieces
        for(int j = 0; j < 4; j++){
            // Check to see if the position of piece is home
            if(objCurrentPlayer.piece[j].getPosition() == 28){
                // Piece is in home increase the home count
                homeCount++;
            }
        }
        // Check to see if home count equals all player pieces
        if (homeCount == 4) {
            //YOU WIN!!!
            playerWin = true;   
        }
        //Continue with game
        //Player gets another turn
        else if (currentRoll == 6) {
            hasExtraTurn = true;
            // Loop through all players
            for(int i = 0; i < numOfPlayers; i++){
                // Locate the player in array that is also the current player 
                if(players[i] == objCurrentPlayer){
                    // Is the current player the first player in the array
                    if(i == 0){
                        // Set current player to the previous player
                        //setCurrentPlayer(players[numOfPlayers]);
                        // With this now set to previous when switching players
                        // The current player will again be the player who took this turn
                    }
                    // Current player is any other player in the array
                    else{
                        // Set current player to the previous player
                        setCurrentPlayer(players[i - 1]);
                        // With this now set to previous when switching players
                        // The current player will again be the player who took this turn
                    }
                }
            }
        }
    }
}
