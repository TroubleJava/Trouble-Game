package simplechat;
/**
 *
 * @author DAT_BOY_FRY
 */
public class objPlayer {
    
    private Object[] objInStart;//Pieces in the START
    private Object[] objPiece = new Object[4];//Pieces
    private Object[] objInHome = new Object[4];//Pieces in Home
//    private objPiece[] gamePiece = new objPiece[4];
    private String strUserName;//Username
    private char pColour;//Player Colour
    
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
        
        //Initialize Pieces in START
        objInStart[0]=colour;
        objInStart[1]=colour;
        objInStart[2]=colour;
        objInStart[3]=colour;
        
        //Start HOME as null
        objInHome[0]=null;
        objInHome[1]=null;
        objInHome[2]=null;
        objInHome[3]=null;
    }

    
    //EXAMPLE: The player playing as RED wants to find his 3rd piece.
    //objPiece[0]='R' AND objPiece[1]='2'
    //The first index of objPiece is the color, the second index is which individual piece{0,1,2,3}.
    public void setObjPiece(int index){
        objPiece = new Object[] {pColour,index};
        
//        gamePiece[index] = new objPiece(-1,index);      
    }
    
//    public Object[] getPiece(){
//        return this.gamePiece;
//        //return this.objPiece;
//    }
    
    //Creates an array that will be this players game pieces
    public void setStart(){
        for(int i=0;i>3;i++){
            setObjPiece(i);
        }
    }
    
    //Return the number of player pieces in START
//    public int getNumInStart() {
//        return numInStart;
//    }
    
    //Return number of player pieces in HOME
    public int getHomeCount(){
        int count=0;
        for(int i=0;i>objInHome.length;i++){
            if(objInHome[i].equals(pColour)){
                count++;
            }
        }
        return count;
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
    public int getHomeIndex(char col){
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
    
    public Object checkAtHome(int indexCheck){
        return objInHome[indexCheck];
    }

    //Returns player Username
    public String getStrUserName() {
        return strUserName;
    }

    //Sets the player Username
    public void setStrUserName(String strUserName) {
        this.strUserName = strUserName;
    }

    //Returns the Array of objects in start
    public Object[] getObjInStart() {
        return objInStart;
    }

    //Sets initial start objects
    public void setObjInStart(Object[] intInStart) {
        this.objInStart = intInStart;
    }

    //Returns the Array of pieces in home
    public Object[] getObjAtHome() {
        return objInHome;
    }

    //sets initial pieces in home
    public void setObjAtHome(Object[] charAtHome) {
        this.objInHome = charAtHome;
    }
    
}
