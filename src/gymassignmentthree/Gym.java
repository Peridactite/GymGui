/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymassignmentthree;

import java.util.ArrayList;

/**
 *
 * @author davwo
 */
public class Gym {
    
    private String gymOwner;
    private String gymName;
    ArrayList<Member> listM = new ArrayList<Member>();
    private int numMembers = 0;

    public Gym(){

    }
    
    /**
     * Add a new Member to the ArrayList
     * @param guy The Member object
     */
    public void addMember(Member guy){
        //Pcode
        /*
        add passed in member to ArrayList listM
        increment number of members
        */
        
        //Functional Method
        listM.add(guy);
        numMembers++;
    }
    
    /**
     * Get the value of numMembers
     *
     * @return the value of numMembers
     */
    public int getNumMembers() {
        return numMembers;
    }

    /**
     * Get the value of gymName
     *
     * @return the value of gymName
     */
    public String getName() {
        return gymName;
    }

    /**
     * Get the value of gymOwner
     *
     * @return the value of gymOwner
     */
    public String getOwner() {
        return gymOwner;
    }
    
    /**
     * Get the value of listM
     * @return ArrayList of members
     */
    public ArrayList<Member> getListM() {
        return listM;
    }

    public void setGymOwner(String gymOwner) {
        this.gymOwner = gymOwner;
    }

    public void setGymName(String gymName) {
        this.gymName = gymName;
    }
    

}
