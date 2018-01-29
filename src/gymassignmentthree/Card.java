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
public class Card {
    
    private int id;
    private String expiration;

    /**
     * Build a Card object for user payments
     * @param amount Amount user is paying
     * @param id Id
     * @param expiration Expiration
     */
    public Card(double amount, int id, String expiration) {
        //Pcode
        /*
        access id and exp date
        store values
        check card approval with amount
        */
        this.id = id;
        this.expiration = expiration;
    }

    /**
     * Get the value of expiration
     *
     * @return the value of expiration
     */
    public String getExpiration() {
        return expiration;
    }
    
    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

}
