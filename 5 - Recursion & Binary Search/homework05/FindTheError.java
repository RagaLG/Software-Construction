/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW05
The purpose of this assignment is to help us learn Recursion.
*/
package homework05;

public class FindTheError {
    // Error: No base case to stop the recursion
    public static void main(String [] args){ 
        myMethod(0);
    }

    public static void myMethod(int num){ 
        System.out.println(num + " "); 
        myMethod(num+1);
    }
}
// end of class FindTheError
