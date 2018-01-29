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
public class Member {
    
    private double balance;
    private int days;
    Gym gym;
    Membership type;
    Payment paymentType;
    private String name;
    ArrayList<String> interests = new ArrayList<String>();
    Boolean payMonthly;
    Boolean newMember;
    Boolean overdue = false;
    Boolean currentMember;
    
    /**
     * This is your member building constructor. Member object can hold name, balance, interests, number of days, and other important facts.
     * @param gym Pass in a Gym object
     * @param name Pass in a name String
     * @param type Pass in a Membership object
     * @param interests Pass in an ArrayList of interests
     */
    public Member(Gym gym, String name, Membership type,  ArrayList<String> interests) {
        //Pcode
        /*
        initialize all variables to the parameters passed
        call the buyMembership method
        */
        
        
        //Functional Constructor
        this.gym = gym;
        this.type = type;
        this.name = name;
        this.interests = interests;
        buyMembership(type);

    }
    /**
     * adjusted for GUI
     * @param gym
     * @param name
     * @param type
     */
    public Member(Gym gym, String name, Membership type) {
        //Pcode
        /*
        initialize all variables to the parameters passed
        call the buyMembership method
        */
        
        
        //Functional Constructor
        this.gym = gym;
        this.type = type;
        this.name = name;
        this.interests = interests;
        buyMembership(type);

    }
    
    /**
     * Register a user to a Membership type. The cost is added to their balance
     * @param type Membership type
     */
    public void buyMembership(Membership type){
        //Pcode
        /*
        set currentMember to true
        add x amount of days to the days variable based on Membership length
        add x amount to balance based on Membership price
        If price is is 0 set newMember to false
        If member is old they can't get a free month
        
        A member who has gone overdue will be required to pay remaining balance
        if user is overdue
            Message: "Pay off your debt first please"
        else if user is not overdue but days is negative
            set days to 0 before adding their new membership days
        */
        
        
        //Functional Method
        if(overdue){
            System.out.println("You have not yet payed off your last subscription! Please do so before renewing your membership.");
        }else if(days < 0){
            days = 0;
            currentMember = true;
            days += type.getLength();
            balance += type.getPrice();
            if(type.getPrice() == 0){
                newMember = false;
            } 
        }else{
            currentMember = true;
            days += type.getLength();
            balance += type.getPrice();
            if(type.getPrice() == 0){
                newMember = false;
            } 
        }
    }
    
    /**
     * Pay off a Member's balance
     * @param amount Amount user wishes to pay off
     * @param type Payment type
     */
    public void payFee(double amount, Payment type){
        //Pcode
        /*
        user can pay an amount and they must choose between paying with
        Cash Card or bitcoin
        subtract amount from balance
        store payment type to paymentType
        
        If the user wishes to pay monthly they must pay with card or bitcoin
        every 30 days charge a portion of the Member's balance
            set payMonthly to true
        
        If the user's days have run up and their balance greater than 0
            Print message: "You are overdue. Please pay the remaining $<balance>"
            Print message: "There is a $10 late fee for each month overdue"
            The user will be set to overdue
            Begin counting into the negative days
        If overdue and days is -30
            add $10 fee to user balance and reset days to 0
        
        If overdue and (balance - amount) is 0 set overdue to false
        */
    }
    
    /**
     * Sign a member in. If they are not a member they can't sign in.
     */
    public void signIn(){
        //Restrict Gym access to trial users and paying customers
        //Method Functional
        
        if(days > 0 ){
            System.out.println("Welcome! Please enjoy your stay.");
        }else{
            currentMember = false;
            System.out.println("We're sorry, but your membership has expired. Would you like to renew membership?");
        }
    }
    
    /**
     * Add a single interest to the ArrayList
     * @param singleInterest String object passed in
     */
    public void addInterest(String singleInterest){
        //add a single interest to arraylist via string
    }
    
    /**
     * Return payMonthly boolean
     * @return 
     */
    public Boolean isPayMonthly() {
        return payMonthly;
    }

    /**
     * return newMember boolean
     * @return 
     */
    public Boolean isNewMember() {
        return newMember;
    }

    /**
     * Return overdue boolean
     * @return 
     */
    public Boolean isOverdue() {
        return overdue;
    }

    /**
     * Return currentMember
     * @return 
     */
    public Boolean isCurrentMember() {
        return currentMember;
    }
    
    /**
     * Get the value of balance
     *
     * @return the value of balance
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Return Membership token
     * @return 
     */
    public Membership getType(){
        return type;
    }

    /**
     * Get the value of days
     *
     * @return the value of days
     */
    public int getDays() {
        return days;
    }
    
    /**
     * Get the value of interests
     * @return 
     */
    public ArrayList<String> getInterests(){
        return interests;
    }

    /**
     * Get the value of paymentType
     * @return 
     */
    public Payment getPaymentType() {
        return paymentType;
    }
}
