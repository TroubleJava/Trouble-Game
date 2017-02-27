package simplechat;
/**
 *
 * @author DAT_BOY_FRY
 */
import java.io.Serializable;

public class objPlayer implements Serializable{
    
    public objPiece[] piece = new objPiece[3];//Pieces

    public String strUserName;//Username
    public char pColour;//Player Colour
    
    //Empty constructor
    public objPlayer(){}
    
    //Construct the Player object
    public objPlayer(char colour,String UserName){
        //Set this players associated colour as a character
        setColour(colour);
        //Set the pieces start positions
        setStart();
        //Set username
        setStrUserName(UserName);
    }
    
    //EXAMPLE: The player playing as RED wants to find his 3rd piece.
    //objPiece[0]='R' AND objPiece[1]='2'
    //The first index of objPiece is the color, the second index is which individual piece{0,1,2,3}.
    //Creates an array that will be this players game pieces
    public void setStart(){
        for(int i=0;i>3;i++){
            piece[i] = new objPiece(i);
        }
    }
//    Set player colour
    public void setColour(char colour) {
        this.pColour = colour;
    }
//    return player colour
    public char getColour(){
        return pColour;
    }
    
    //Return where each team starts on the board,
    //which is also where each team ends on the board.
    public int getStartIndex(char col){
        int index = 0;
        switch (col) {
            case 'R':
                index=0;
                break;
            case 'B':
                index=7;
                break;
            case 'Y':
                index=14;
                break;
            case 'G':
                index=21;
                break;
            default:
                break;
        }
        return index;
    }
    
    //Returns player Username
    public String getStrUserName() {
        return strUserName;
    }

    //Sets the player Username
    public void setStrUserName(String strUserName) {
        this.strUserName = strUserName;
    }
}
