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
public class Cash extends Payment{

    /**
     * Build Cash object user usees to pay
     * @param amount Amount user pays
     */
    public Cash(double amount) {
        //Pcode
        //If they have enough cash with them, approved!
        this.setApproval(true);
    }
    
}
