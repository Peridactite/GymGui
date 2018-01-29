/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymassignmentthree;

/**
 *
 * @author davwo
 */
public class BitCoin extends Payment{
    
    private String serial;

    /**
     * Builds a bitcoin Payment type
     * @param amount Amount user pays
     * @param serial Serial code
     */
    public BitCoin(double amount, String serial) {
        //Pcode
        /*
        access and store serial code
        check account approval based on amount
        */
        
        this.serial = serial;
    }
    
    /**
     * Get the value of serial
     *
     * @return the value of serial
     */
    public String getSerial() {
        return serial;
    }

}
