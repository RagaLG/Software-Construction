/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
The purpose of this assignment is to help us understand the concept of Objects(individual instance 
of a class) and define methods to modify or use them.
*/
package homework;

import java.util.ArrayList;

public class Telephone {
    private String type;
    private int myNumber;
    private static int myIdentfier = 5550001;
    private boolean callInProgress = false;
    private String recentNum;
    private static int callsMade = 0;
    private ArrayList<String> dialedNumbers = new ArrayList<>();

    /**
     * Constructs a new Telephone instance with the given type
     * @param type The type of the telephone.(land line, mobile or satellite)
     */
    public Telephone(String type){
        this.type = type;
        this.myNumber = myIdentfier++;
        this.callInProgress = false;
        this.recentNum = null;
    }
    /**
     * Constructs a new Telephone instance with the given type and custom phone number.
     * @param type     The type of the telephone.(land line, mobile or satellite)
     * @param myNumber The custom phone number.
     */
    public Telephone(String type, int myNumber){
        this.type = type;
        this.myNumber = myNumber;
        this.callInProgress = false;
        this.recentNum = null;
    }
    /**
     * Checks if two Telephone objects are equal based on their phone numbers.
     * @param t The object to compare with this Telephone.
     * @return True if the objects are equal, false otherwise.
     */
    public boolean equals(Object t){
        if(t instanceof Telephone){
            Telephone telephone = (Telephone) t;
            return this.myNumber == telephone.myNumber;
        }
        return false;
    }
     /**
     * Dials a phone number. If a call is in progress, it displays an error message.
     * If the number is the same as the dialer, displays an error message.
     * @param number The phone number to dial.
     */
    public void dial(String number){
        if(number.equals(Integer.toString(this.myNumber))==true){
            System.out.println("Error: this is your number, please enter another number!");
        } else if(this.callInProgress == true){
            System.out.println("Error: The person you want to speak to is in another call");
        } else {
            this.recentNum = number;
            this.callInProgress = true;
            callsMade++;
            this.dialedNumbers.add(0,number);
            if(dialedNumbers.size()>10){
                dialedNumbers.remove(10);
            }
            System.out.println("Starting a call to " + number);
        }
    }
    /**
     * Disconnects the current call if one is in progress; if no call is in progress,
     * displays an error message.
     */
    public void disconnectCall(){
        if(this.callInProgress==false){
            System.out.println("Error: No call in progress");
        } else if(this.callInProgress == true){
            this.callInProgress = false;
            System.out.println("Ending call to " + this.recentNum);
        }
    }
    /**
     * Redials the most recent number dialed from this telephone.
     */
    public void redial(){
        if(this.recentNum == null){
            System.out.println("Error: No calls have been made so far");
        } else {
            dial(this.recentNum);
        }
    }
    /**
     * Displays a list of last 10 recent calls made from this telephone.
     */
    public void recentCalls(){
        System.out.println("Recent calls made from phone: " + this.myNumber);
        for(String num : this.dialedNumbers){
            System.out.println(num);
        }
    }
    /**
     * Returns the total number of calls made from all Telephone instances.
     * @return The total number of calls made.
     */
    public static int getTotalCallsMade(){
        return callsMade;
    }
     /**
     * Returns a string representation of the Telephone object.
     * @return A string containing details about the telephone.(Phone Number, type and the most recently dialed number)
     */
    public String toString(){
        if(this.recentNum == null){
            return "Telephone Details: \n" + "Phone Number - " + this.myNumber +
            "\nPhone Type - " + this.type +
            "\nLast Dialed Number - No calls made";
        } else {
            return "Telephone Details: \n" + "Phone Number - " + this.myNumber +
            "\nPhone Type - " + this.type +
            "\nLast Dialed Number - " + this.recentNum;
        }
    }

}
// end of class Telephone
