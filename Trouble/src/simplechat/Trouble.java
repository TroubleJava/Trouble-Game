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
    private objPlayer player1;
    private objPlayer player2;
    private objPlayer player3;
    private objPlayer player4;
    private String strCurrentPlayer;
    private objPlayer[] board;

    /**
     *
     */
    public Trouble(){}
    
    public Trouble(String p1, String p2){
        numOfPlayers = 2;
        objPlayer player1 = new objPlayer('R',p1);
        objPlayer player2 = new objPlayer('B',p2);
    }
    
    public Trouble(String p1, String p2, String p3){
        numOfPlayers = 3;
        objPlayer player1 = new objPlayer('R',p1);
        objPlayer player2 = new objPlayer('B',p2);
        objPlayer player3 = new objPlayer('Y',p3);
    }
    
    public Trouble(String p1, String p2, String p3, String p4){
        numOfPlayers = 4;
        objPlayer player1 = new objPlayer('R',p1);
        objPlayer player2 = new objPlayer('B',p2);
        objPlayer player3 = new objPlayer('Y',p3);
        objPlayer player4 = new objPlayer('G',p4);
    }

    public void switchActivePlayer(){
        switch(numOfPlayers){
            case 2:
                if(strCurrentPlayer.equals(player1.getStrUserName())){
                    setCurrentPlayer(player2.getStrUserName());
                    break;
                }
                else{
                    setCurrentPlayer(player1.getStrUserName());
                    break;
                }
            case 3:
                if(strCurrentPlayer.equals(player1.getStrUserName())){
                    setCurrentPlayer(player2.getStrUserName());
                    break;
                }
                else if(strCurrentPlayer.equals(player2.getStrUserName())){
                    setCurrentPlayer(player3.getStrUserName());
                    break;
                }
                else{
                    setCurrentPlayer(player1.getStrUserName());
                    break;
                }
            case 4:
                if(strCurrentPlayer.equals(player1.getStrUserName())){
                    setCurrentPlayer(player2.getStrUserName());
                    break;
                }
                else if(strCurrentPlayer.equals(player2.getStrUserName())){
                    setCurrentPlayer(player3.getStrUserName());
                    break;
                }
                else if(strCurrentPlayer.equals(player3.getStrUserName())){
                    setCurrentPlayer(player4.getStrUserName());
                    break;
                }
                else{
                    setCurrentPlayer(player1.getStrUserName());
                    break;
                }
        }
    }
    /**
     * @return the intCurrentPlayer
     */
    public String getCurrentPlayer() {
        return strCurrentPlayer;
    }

    /**
     * @param intCurrentPlayer the intCurrentPlayer to set
     */
    public void setCurrentPlayer(String strCurrentPlayer) {
        this.strCurrentPlayer = strCurrentPlayer;
    }

    /**
     * @return the objTHEGame
     */
    public objPlayer[] getBoard() {
        return board;
    }

    /**
     * @param objTHEGame the objTHEGame to set
     */
    public void setBoard(objPlayer[] board) {
        this.board = board;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    Trouble tr = new Trouble();
    private objPlayer objBoard[] = tr.getBoard();
    objPlayer op = new objPlayer();
    public int currentRoll;
    private boolean moveFromStart = false;

    public void objTHEGame() {}
    
    

    //starts a new game with players that are available
    public void StartGame() {}

    //returns the random die roll
    public int rollDie() {
        return ThreadLocalRandom.current().nextInt(1, 6);
    }

    //Find position by searching array
    public int piecePosition(Object[] piece) {
        int position = 0; //Initialize varibale
        char player = (char) piece[0]; //MAYBE
        for (int j = 0; j < 3; j++) { //Loop through home and start
            if (op.objInStart[j] == piece) {
                position = op.getHomeIndex(player);
            } else if (op.objInHome[j] == piece) {
                position = op.getHomeIndex(player);
            } else if (op.objInStart[j] != piece) {
                for (int i = 0; i <= objBoard.length; i++) { //Loop through array of board
                    if (objBoard[i] == op) {
                        position = i;
                    }
                }
            } else if (op.objInHome[j] != piece) {
                for (int i = 0; i <= objBoard.length; i++) { //Loop through array of board
                    if (objBoard[i] == op) {
                        position = i;
                    }
                }
            }
        }
        return position; //Returns position of piece
    }

    //When a player's turn is started, this should be the first method that runs
    public void onTurnStart() {
        Object[] piece = op.objPiece;
        char currentPlayer = op.getColour(); //Current Player
        int position = piecePosition(piece); //Position of the selected piece
        int roll = rollDie(); //Get roll
        currentRoll = roll; //Set the global variable for other classes
        //Does the player want to move a character from start?
            //If yes, check if there is something in the start
        if (moveFromStart == true && checkStart() == true) {
            if (roll == 6) { //Exit the start zone                                
                objBoard[position] = op; //Sets the piece position to the start position 
            } else { //Don't move                
                checkWin(); //Calling checkWin because this will always end the turn                
            }
        } 
        //If you roll a six and choose not to move out of home
        else if (roll == 6) {            
            move(position, roll, currentPlayer, piece); //Move
            //New turn      
            
            checkWin(); //Calling checkWin because this will always end the turn
        } 
        //They don't want to move a piece from start
        else {            
            move(position, roll, currentPlayer, piece); //Move selected piece
            checkWin(); //Calling checkWin because this will always end the turn
        }
    }
    //Check start to see if there are still pieces in it
    public boolean checkStart() {
        boolean isSomeoneInStart = false;
        if (op.getNumInStart() != 0) {
            isSomeoneInStart = true;
        }
        return isSomeoneInStart;
    }
    //Player movement
    //Takes player's piece and their roll
    //Handles landing on another piece or not
    public void move(int pos, int n, char currentPlayer, Object[] piece) {
        
        //Check if landing on another piece
        if (objBoard[pos + n] != null) {
            //Check if the landed on piece is a different players
            if (op.getColour() != op.getColour()) {
                //Bounce the landed on piece back to its start square
                char landedOnPiece = objBoard[pos + n].getColour(); //The char player colour of the landed on piece
                int bounceToHome = op.getHomeIndex(landedOnPiece); //The index of their start                
                objBoard[pos + n] = null; //Clearing the position
                objBoard[pos + n] = op; //The players piece is set to that position
                objBoard[bounceToHome] = op; //The bounced players piece is sent back
            }            
        } 
        //Check if landing in home
        else if (Integer.parseInt(objBoard[pos + n].toString()) == op.getHomeIndex(currentPlayer)) {
            //Check to see if it can enter home
            if(op.getHomeCount() != 4){
                objBoard[pos] = null; //Destroy old piece before move 
                op.setObjAtHome(piece);
                
                
                
            }
            
            
            
            
        } 
        else {            
                       
            objBoard[pos + n] = op; //Move
        }
    }
    //Last thing to do on a turn
        //Check to see if the home counter = 4
        //If someone wins, shut down!
    public void checkWin() {
        //Check amount of pieces in home
        if (op.getHomeCount() == 4) {
            //YOU WIN!!!    
            
        }
        //Continue with game
        else { 
            
            
        }

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
