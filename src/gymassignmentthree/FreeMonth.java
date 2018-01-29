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
public class FreeMonth extends Membership {
    FreeMonth(){
        //Pcode
        /*
        this month is the free 30 day trial
        set price to FREE and length to 30 days
        */
        
        //Functional Method
        this.setLength(30);
        this.setPrice(0.0);
    }
}
