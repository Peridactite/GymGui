/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymassignmentthree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davwo
 */
public class GymAssignmentThree {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        jGymFrame frame = new jGymFrame();
        frame.setVisible(true);
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Gym Name: ");
        String gymName = scan.nextLine();
        System.out.println("Owner Name: ");
        String owner = scan.nextLine();
        Gym myGym = new Gym(owner, gymName);
        
        addUser(scan, myGym);
                        
        startLoop(scan, myGym);
        */
    }
    
    /**
     * Offer the user a number of options. They can then choose a member 
     * and the operation will be processed.
     * @param scan Pass in Scanner System.in object
     * @param myGym Pass in Gym object
     */
    public static void startLoop(Scanner scan, Gym myGym){
        //Functional Method 1
        boolean running = true;
        while(running){
            System.out.println("What would you like to do next?");
            System.out.println("\tA: Buy a Membership");
            System.out.println("\tB: Sign in");
            System.out.println("\tC: Check a User's balance");
            System.out.println("\tD: Add a member");
            System.out.println("\tE: Exit Program");
            String choice = scan.nextLine();
            switch (Character.toLowerCase(choice.charAt(0))) {
                case 'a':
                    pickedA(scan, myGym);
                    break;
                case 'b':
                    signIn(scan, myGym);
                    break;
                case 'c':
                    System.out.println("Balance: $" + checkBalance(scan, myGym));
                    break;
                case 'd':
                    addUser(scan, myGym);  
                    break;
                case 'e':
                    System.out.println("Thank you for using Data Matters Technology.");
                    running = false;
                default:
                    break;
            }
        }
    }
    
    /**
     * Sign a member in 
     * @param scan Enter a scanner System.in
     * @param myGym Pass in a Gym object
     */
    public static void signIn(Scanner scan, Gym myGym){
        //Pcode
        /*
        Initialize a String, Member, and boolean variable
        Print: "What's your name?"
        scan name
        check gym for name's existance comparing scan against Gym's Member list using equals
        if the name exists
            sign the member in
        else
            Print: " Please choose a name that exists..."
        */
        
        //Functional Method
        String userName;
        Member user = null;
        boolean exists = false;
        System.out.println("What's your name?");
        userName = scan.nextLine();
        for(Member m : myGym.getListM()){
            if(m.getName().equals(userName) ){
                user = m;
                exists = true;
            }
        }
        if(exists){
            user.signIn();
        } else {
            System.out.println("Please choose a name that exists...");
        } 
    }
    
    /**
     * Check a member's balance
     * @param scan Pass a scanner system.in object
     * @param myGym pass a Gym object
     * @return 
     */
    public static double checkBalance(Scanner scan, Gym myGym){
        //Pcode
        /*
        Initialize a String, Member, and boolean variable
        Print: "What's your name?"
        scan name
        check gym for name's existance comparing scan against Gym's Member list using equals
        if the name exists
            return member balance
        else
            Print: " Please choose a name that exists..."
            return -9999
        */
        
        //Functional Method
        String userName;
        Member user = null;
        boolean exists = false;
        System.out.println("What's your name?");
        userName = scan.nextLine();
        for(Member m : myGym.getListM()){
            if(m.getName().equals(userName) ){
                user = m;
                exists = true;
            }
        }
        if(exists){
            return user.getBalance();
        } else {
            System.out.println("Please choose a name that exists...");
            return -9999;
        }
    }
    
    /**
     * Add member to a gym
     * @param scan Pass in a Scanner System.in object
     * @param myGym Pass in a Gym object
     */
    public static void addUser(Scanner scan, Gym myGym){
        try {
            //Pcode
            /*
            Print: "Name?"
            scan name
            Print: "Membership Length?"
            scan length
            30/90/365 are only options
            user can exit while loop with the permitted values
            buy membership based upon length chosen
            30 means trial
            90 means 3 months
            365 means a year
            Print: "Interests?"
            scan interests
            Print: "Thank you for registering"
            add member to gym using variables scanned
            wrap block in exception handler
            */
            
            //Functional Method
            System.out.println("Name?");
            String userName = scan.nextLine();
            System.out.println("Membership Length?");
            int length = scan.nextInt();
            while((length != 30) && (length != 90) && (length != 365)){
                System.out.println("Available memberships are 30, 90, and 365 days long. Please choose a valid membership length");
                length = scan.nextInt();
                scan.nextLine();
            }
            Membership memberType = null;
            if(length == 30){
                memberType = new FreeMonth();
            } else if(length == 90){
                memberType = new ThreeMonths();
            } else if(length == 365){
                memberType = new TwelveMonths();
            }
            System.out.println("Interests?");
            String interest = scan.nextLine();
            interest = scan.nextLine();
            ArrayList<String> interestList = new ArrayList<String>();
            interestList.add(interest);
            
            while(!interest.equals("stop")){
            System.out.println("And? Say \"stop\" when you're finished");
            interest = scan.nextLine();
            interestList.add(interest);
            }
            
            System.out.println("Thank you for registering!");
            Member user = new Member(myGym, userName, memberType, interestList);
            myGym.addMember(user);
            System.out.println("Building new profile...");
            System.out.print("Loading");
            Thread.sleep(1000);
            System.out.print(" . ");
            Thread.sleep(1000);
            System.out.print(" . ");
            Thread.sleep(1000);
            System.out.println(" . ");
            Thread.sleep(1000);
            System.out.println("Thank you for waiting! Profile established. Membership valid for " + length + " days.");
        } catch (InputMismatchException exception) {
            System.out.println(exception);
        } catch (InterruptedException ex) {
            Logger.getLogger(GymAssignmentThree.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Buy a membership
     * @param scan Pass in a Scanner System.in object
     * @param myGym Pass in a Gym object
     */
    public static void pickedA(Scanner scan, Gym myGym){
        try{
            //Pcode 
            /*
            set up a String, boolean, integer, Member, and membership variable for use throughout the method
            Print: "what's your name?"
            scan name
            check gym for name's existance comparing scan against Gym's Member list using equals
            if the name exists
                Print: "Membership Length?"
                scan integer
                30/90/365 are only options
                user can exit while loop with the permitted values
                buy membership based upon length chosen
                30 means trial
                90 means 3 months
                365 means a year
            */

            //Functional Method
            String userName;
            boolean exists = false;
            Member user = null;
            int length;
            Membership memberType = null;
            System.out.println("What's your name?");
            userName = scan.nextLine();
            for(Member m : myGym.getListM()){
                if(m.getName().equals(userName) ){
                    user = m;
                    exists = true;
                }
            }
            if(exists){
                System.out.println("Membership Length?");
                length = scan.nextInt();
                scan.nextLine();
                while((length != 30) && (length != 90) && (length != 365)){
                    System.out.println("Available memberships are 30, 90, and 365 days long. Please choose a valid membership length");
                    length = scan.nextInt();
                }
                if(length == 30){
                    memberType = new FreeMonth();
                } else if(length == 90){
                    memberType = new ThreeMonths();
                } else if(length == 365){
                    memberType = new TwelveMonths();
                }
                user.buyMembership(memberType);
            } else {
                System.out.println("Please choose a name that exists...");
            }
        } catch (InputMismatchException exception){
            System.out.println(exception);
        }
    }
    
    /**
     * Print all members of a Gym
     * @param listM Pass in the arrayList of members
     */
    public static void loopMembers(ArrayList<Member> listM){
        //Pcode loop array list and print each member
        
        //Functional Method
        for(Member m : listM){
            System.out.println(m.getName());
        }
    }
}

