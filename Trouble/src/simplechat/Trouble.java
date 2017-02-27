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
    //public objPiece[] board = new objPiece[27];
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
                    break;
                } else {
                    setCurrentPlayer(player1);
                    break;
                }
            case 3:
                if (objCurrentPlayer.equals(player1)) {
                    setCurrentPlayer(player2);
                    break;
                } else if (objCurrentPlayer.equals(player2)) {
                    setCurrentPlayer(player3);
                    break;
                } else {
                    setCurrentPlayer(player1);
                    break;
                }
            case 4:
                if (objCurrentPlayer.equals(player1)) {
                    setCurrentPlayer(player2);
                    break;
                } else if (objCurrentPlayer.equals(player2)) {
                    setCurrentPlayer(player3);
                    break;
                } else if (objCurrentPlayer.equals(player3)) {
                    setCurrentPlayer(player4);
                    break;
                } else {
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

    
    
    
    
    
    //returns the random die roll
    public void rollDie() {
        currentRoll = ThreadLocalRandom.current().nextInt(1, 7);
    }

    //Player movement
    public void move(int position) {
        int indexSelectedPiece = 1;
        for (int k = 0; k < 4; k++) {
            if (objCurrentPlayer.piece[k].getPosition() == position) {
                indexSelectedPiece = objCurrentPlayer.piece[k].getIndex();
            }
        }
        //Moving from start
        if ((position == -1) && (currentRoll == 6)) {
            char cplayer = objCurrentPlayer.getColour();
            objCurrentPlayer.piece[indexSelectedPiece].setPosition(objCurrentPlayer.getStartIndex(cplayer));
        } else {
            //Check if the landed on piece is a different players
            for (int i = 0; i < numOfPlayers; i++) {
                for (int j = 0; j < 4; j++) {
                    if (players[i].piece[j].getPosition() == (position + currentRoll)) {
                        if (objCurrentPlayer.getColour() != players[i].getColour()) { //Send to home
                            players[i].piece[j].setPosition(-1);
                            //Check if roll is outside of bounds
                            if ((position + currentRoll) > 27) {
                                int something = (position + currentRoll) - 27;
                                objCurrentPlayer.piece[indexSelectedPiece].setPosition(something);
                            } else {
                                objCurrentPlayer.piece[indexSelectedPiece].setPosition(position + currentRoll);
                            }
                        } else if (objCurrentPlayer.getColour() == players[i].getColour()) { //Same colour piece                            
                            break;
                        }
                    } //Landing on home
                    else if ((position + currentRoll) >= objCurrentPlayer.getHomeIndex(objCurrentPlayer.getColour())) {
                        objCurrentPlayer.piece[indexSelectedPiece].setPosition(28);
                    } else //Nothing on the spot                    
                    //Check if roll is outside of bounds
                     if ((position + currentRoll) > 27) {
                            int something = (position + currentRoll) - 27;
                            objCurrentPlayer.piece[indexSelectedPiece].setPosition(something);
                        } else {
                            objCurrentPlayer.piece[indexSelectedPiece].setPosition(position + currentRoll);
                        }
                }
            }
        }
        checkWin();
    }

    //Last thing to do on a turn
    public void checkWin() {
        //Check amount of pieces in home
        int homeCount = 0;
        for (int l = 0; l < 4; l++) {
            if (objCurrentPlayer.piece[l].getPosition() == 28) {
                homeCount++;
            }
        }
        if (homeCount == 4) {
            //YOU WIN!!!
            playerWin = true;
        } //Continue with game
        else if (currentRoll == 6) { //Do another turn
            hasExtraTurn = true;
        } else { //End turn
            turnOver = true;
        }
    }

}
