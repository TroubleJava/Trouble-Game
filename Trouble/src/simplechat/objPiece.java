/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplechat;

/**
 *
 * @author fryklund4766
 */
public class objPiece {

    private int index;
    private char colour;
    private int position;
    
    objPiece(int num, char colour){
    setIndex(num);
    setColour(colour);
    setPosition(-1);
   
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * @return the colour
     */
    public char getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(char colour) {
        this.colour = colour;
    }

    /**
     * @return the position
     */
    public int getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(int position) {
        this.position = position;
    }
    
    
    
}
