/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplechat;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author scherr3143
 */
public class objTHEGame {

    Trouble tr = new Trouble();
    private Object objBoard[] = tr.getBoard();
    objPlayer op = new objPlayer();
    public int currentRoll;
    private boolean moveFromStart = false;

    public void objTHEGame() {
    }

    //starts a new game with players that are available
    public void StartGame() {

    }

    //returns the random die roll
    public int rollDie() {
        return ThreadLocalRandom.current().nextInt(1, 6);
    }

    //Find position by searching array
    public int piecePosition(Object[] piece) {
        int position = 0; //Initialize varibale
        char player = piece[0];
        for (int j = 0; j < 3; j++) { //Loop through home and start
            if (op.objInStart[j] == piece) {
                position = op.getHomeIndex(player);
            } else if (op.objInHome[j] == piece) {
                position = op.getHomeIndex(player);
            } else if (op.objInStart[j] != piece) {
                for (int i = 0; i <= objBoard.length; i++) { //Loop through array of board
                    if (objBoard[i] == piece) {
                        position = i;
                    }
                }
            } else if (op.objInHome[j] != piece) {
                for (int i = 0; i <= objBoard.length; i++) { //Loop through array of board
                    if (objBoard[i] == piece) {
                        position = i;
                    }
                }
            }
        }
        return position; //Returns position of piece
    }

    //When a player's turn is started, this should be the first method that runs
    public void onTurnStart() {
        Object[] piece = new Object[4];
        char currentPlayer = op.getColour(); //Current Player
        int position = piecePosition(currentPlayer, piece);
        int roll = rollDie(); //Get roll
        currentRoll = roll; //Set the global variable for other classes
        //Does the player want to move a character from start?
        //If yes, check if there is something in the start
        if (moveFromStart == true && checkStart() == true) {
            if (roll == 6) { //Exit the start zone    
                //Sets the piece position to the start position             
                objBoard[position] = piece;
            } else {
                //Don't move
                checkWin(); //Calling checkWin because this will always end the turn                
            }
        } //If you roll a six and choose not to move out of home
        else if (roll == 6) {
            //Move
            move(position, roll, currentPlayer, piece);
            //New turn      

            checkWin(); //Calling checkWin because this will always end the turn
        } //They don't want to move a piece from start
        else {
            //Move selected piece
            move(position, roll, currentPlayer, piece);
            checkWin(); //Calling checkWin because this will always end the turn
        }
    }

    //Check start to see if there are still pieces in it
    public boolean checkStart() {
        boolean isSomeoneHome = false;
        if (op.getNumInStart() != 0) {
            isSomeoneHome = true;
        }
        return isSomeoneHome;
    }
    //Player movement
    //Takes player's piece and their roll
    //Handles landing on another piece or not
    public void move(int pos, int n, char currentPlayer, Object[] piece) {
        
        //Check if landing on another piece
        if (objBoard[pos + n] != null) {
            //Check if the landed on piece is a different players
            if (op.getColour() != op.getColour()) {
                //Bounce
                char landedOnPiece = 
                int bounceToHome = op.getHomeIndex(landedOnPiece);
                //Maybe change so that I pass in a variable
                    //that sets the position
                objBoard[pos + n] = null;
                objBoard[pos + n] = piece;
                objBoard[bounceToHome] = bounceToHome;
            //Landed on your own piece which is INVALID
            } else {
                //Select new piece?
                
            }
        } //Check if landing in home
        else if (Integer.parseInt(objBoard[pos + n].toString()) == op.getHomeIndex(currentPlayer)) {
            //Check to see if it can enter home! :D 
            
        } else {
            //Destroy old piece before move
            objBoard[pos] = null;
            //Move
            objBoard[pos + n] = piece;
        }
    }
    //Last thing to do on a turn
    //Check to see if the home counter = 4
    //If someone wins, shut down!
    public void checkWin() {
        //Check amount of pieces in home
        if (op.getHomeCount() == 4) {
            //YOU WIN!!!            
        } else {
            //Continue with game
        }

    }
}
