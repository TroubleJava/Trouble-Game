/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplechat;

import java.io.Serializable;

/**
 *
 * @author fryklund4766
 */
public class objPiece implements Serializable{

    private int index;
    private int position;
    
    objPiece(int num){
        setIndex(num);
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
