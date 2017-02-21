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
    private objTHEGame[] board;

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
    public objTHEGame[] getBoard() {
        return board;
    }

    /**
     * @param objTHEGame the objTHEGame to set
     */
    public void setBoard(objTHEGame[] board) {
        this.board = board;
    }
}
