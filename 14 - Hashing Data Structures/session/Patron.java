/*
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW14
The purpose of this assignment is to help us learn HashMap Data Structures and implement them.
*/
package session;

import java.util.ArrayList;

public class Patron {
    String Id;
    String Name;
    ArrayList<String> BookLog;
    double fines;
    /**
     * Gets the ID of the patron.
     * @return The ID of the patron.
     */
    public String getId() {
        return Id;
    }
    /**
     * Gets the name of the patron.
     * @return The name of the patron.
     */
    public String getName() {
        return Name;
    }
     /**
     * Gets the book log associated with the patron.
     * @return The book log of the patron.
     */
    public ArrayList<String> getBookLog() {
        return BookLog;
    }
    /**
     * Gets the fines associated with the patron.
     * @return The fines of the patron.
     */
    public double getFines() {
        return fines;
    }
    /**
     * Sets the ID of the patron.
     * @param id The new ID for the patron.
     */
    public void setId(String id) {
        Id = id;
    }
    /**
     * Sets the name of the patron.
     * @param name The new name for the patron.
     */
    public void setName(String name) {
        Name = name;
    }
    /**
     * Sets the book log for the patron.
     * @param bookLog The new book log for the patron.
     */
    public void setBookLog(ArrayList<String> bookLog) {
        BookLog = bookLog;
    }
    /**
     * Sets the fines for the patron.
     * @param fines The new fines for the patron.
     */
    public void setFines(double fines) {
        this.fines = fines;
    }
    /**
     * Adds a book to the patron's book log.
     * @param bookName The name of the book to be added.
     */
    public void addBook(String Name){
        this.BookLog.add(Name);
    }
    /**
     * Removes a book from the patron's book log.
     * @param bookName The name of the book to be removed.
     */
    public void removeBook(String Name){
        this.BookLog.remove(Name);
    }
    /**
     * Returns a string representation of the patron.
     * @return A string containing the ID and name of the patron.
     */
    @Override
    public String toString(){
        return "The patron with id: " + getId() + ", the name: " + getName();
    }
    /**
     * Generates a hash code for the patron based on its ID.
     * @return The hash code for the patron.
     */
    @Override
    public int hashCode(){
        int hash = 0;
        char[] chars = this.getId().toUpperCase().toCharArray();
        for(int i=0; i<3; i++){
            hash = hash * 26 + (chars[i] - 65);
        }
        for(int i = 3; i<chars.length; i++){
            hash = hash * 10 + (chars[i] - 48);
        }
        return hash;
    }
}
// end of class Patron