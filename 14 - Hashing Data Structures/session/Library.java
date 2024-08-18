/*
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW14
The purpose of this assignment is to help us learn HashMap Data Structures and implement them.
*/
package session;

import java.util.ArrayList;

public class Library {
    ArrayList<Patron> listOfPatrons = new ArrayList<Patron>();
    /**
     * Adds a patron to the library.
     *
     * @param p The patron to be added to the library.
     */
    public void addPatron(Patron p){
        listOfPatrons.add(p);
    }
    /**
     * Retrieves the name of a patron based on their ID.
     *
     * @param id The ID of the patron whose name is to be retrieved.
     * @return The name of the patron, or "Patron not found!" if the ID is not found.
     */
    public String getPatron(String id){
        for(Patron i: listOfPatrons){
            if(i.getId().equals(id)){
                return i.getName();
            }
        }
        return "Patron not found!";
    }
    /**
     * Adds a book to the book log of a patron based on their ID.
     *
     * @param id    The ID of the patron.
     * @param title The title of the book to be added to the patron's book log.
     */
    public void addBook(String id, String title){
        for(Patron i: listOfPatrons){
            if(i.getId().equals(id)){
                i.getBookLog().add(title);
                break;
            }
        }
    }
}
// end of class Library
