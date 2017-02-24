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
    private objPlayer objCurrentPlayer;
    private objPiece[] board = new objPiece[27];   
       
    
    public int currentRoll;
    private boolean moveFromStart = false;

    /**
     *
     */
    public Trouble(){System.out.println("made it in");}
    
    public Trouble(String p1, String p2){
        
        numOfPlayers = 2;
        objPlayer player1 = new objPlayer('R',p1);
        objPlayer player2 = new objPlayer('B',p2);
        board = null;
    }
    
    public Trouble(String p1, String p2, String p3){
        numOfPlayers = 3;
        objPlayer player1 = new objPlayer('R',p1);
        objPlayer player2 = new objPlayer('B',p2);
        objPlayer player3 = new objPlayer('Y',p3);
        board = null;
    }
    
    public Trouble(String p1, String p2, String p3, String p4){
        numOfPlayers = 4;
        objPlayer player1 = new objPlayer('R',p1);
        objPlayer player2 = new objPlayer('B',p2);
        objPlayer player3 = new objPlayer('Y',p3);
        objPlayer player4 = new objPlayer('G',p4);
        board = null;
    }

    public void switchActivePlayer(){
        switch(numOfPlayers){
            case 2:
                if(objCurrentPlayer.equals(player1)){
                    setCurrentPlayer(player2);
                    break;
                }
                else{
                    setCurrentPlayer(player1);
                    break;
                }
            case 3:
                if(objCurrentPlayer.equals(player1)){
                    setCurrentPlayer(player2);
                    break;
                }
                else if(objCurrentPlayer.equals(player2)){
                    setCurrentPlayer(player3);
                    break;
                }
                else{
                    setCurrentPlayer(player1);
                    break;
                }
            case 4:
                if(objCurrentPlayer.equals(player1)){
                    setCurrentPlayer(player2);
                    break;
                }
                else if(objCurrentPlayer.equals(player2)){
                    setCurrentPlayer(player3);
                    break;
                }
                else if(objCurrentPlayer.equals(player3)){
                    setCurrentPlayer(player4);
                    break;
                }
                else{
                    setCurrentPlayer(player1);
                    break;
                }
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

    /**
     * @return the objTHEGame
     */
    public objPiece[] getBoard() {
        return board;
    }

    /**
     * @param objTHEGame the objTHEGame to set
     */
    public void setBoard(objPiece[] board) {
        this.board = board;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    //starts a new game with players that are available
    public void StartGame() {}

    //returns the random die roll
    public int rollDie() {
        return ThreadLocalRandom.current().nextInt(1, 6);
    }     
    
    
    //When a player's turn is started, this should be the first method that runs
    public void onTurnStart() {
         currentRoll = rollDie(); //Set the global variable for other classea
        
        
        
        
        Object[] piece = op.objPiece;
        
        int position = piecePosition(piece); //Position of the selected piece
        
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
        for(int i = 0; i < 3; i++){
            if (objCurrentPlayer.piece[i].getPosition() == -1) {
                isSomeoneInStart = true;
            }        
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
                op.gotHome(); //It got home
            }           
        }
        //Missed home
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