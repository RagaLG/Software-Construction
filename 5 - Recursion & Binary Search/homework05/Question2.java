/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW05
The purpose of this assignment is to help us learn Recursion.
*/
package homework05;

public class Question2 {
    public static void sign(int n){
        /*
        This method prints "No Parking" n times using recursion.
         */
        // Check if n is greater than 0.
        if(n>0){
            // Recursively call the sign method with n-1.
            System.out.println("No Parking");
            sign(n-1);
        }
    }
    /**
     * The main method calls the method sign() and prints the result.
     * @param args
     */
    public static void main(String[] args){
        sign(5);
    }
}
// end of class Question2
