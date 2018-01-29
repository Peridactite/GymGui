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
public abstract class Payment {
    
        private boolean approved;

    /**
     * Get the value of approved
     *
     * @return the value of approved
     */
    public boolean isApproved() {
        return approved;
    }

    /**
     * Set the value of approved
     *
     * @param approved new value of approved
     */
    public void setApproval(boolean approved) {
        //Pcode set approval
        this.approved = approved;
    }

}
