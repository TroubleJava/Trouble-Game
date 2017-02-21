/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplechat;

import java.io.Serializable;

/**
 *
 * @author scherr3143
 */
public class Envelope implements Serializable{
    
    private String r1;
    private String r2;
    private String r3;
    private Object contents;

    
    public Envelope(){}
    
    public Envelope(String r1, Object contents){
        setRecipient1(r1);
        setContents(contents);
    }
    public Envelope(String r1, String r2, Object contents){
        setRecipient1(r1);
        setRecipient2(r2);
        setContents(contents);
    }
    public Envelope(String r1, String r2, String r3, Object contents){
        setRecipient1(r1);
        setRecipient2(r2);
        setRecipient3(r3);
        setContents(contents);
    }
    /**
     * @return the recipient1
     */
    public String getRecipient1() {
        return r1;
    }

    /**
     * @param recipient the recipient1 to set
     */
    public void setRecipient1(String recipient) {
        this.r1 = recipient;
    }

        /**
     * @return the recipient2
     */
    public String getRecipient2() {
        return r2;
    }

    /**
     * @param recipient the recipient2 to set
     */
    public void setRecipient2(String recipient) {
        this.r2 = recipient;
    }
    
        /**
     * @return the recipient3
     */
    public String getRecipient3() {
        return r3;
    }

    /**
     * @param recipient the recipient3 to set
     */
    public void setRecipient3(String recipient) {
        this.r3 = recipient;
    }
    
    /**
     * @return the contents
     */
    public Object getContents() {
        return contents;
    }

    /**
     * @param contents the contents to set
     */
    public void setContents(Object contents) {
        this.contents = contents;
    }
    
    
    
    
}
