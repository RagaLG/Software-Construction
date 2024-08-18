/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW05
The purpose of this assignment is to help us learn Recursion.
*/
package homework05;

public class RaisedTo {
    public static int raise(int n, int e){
        /*
        This method calculates the result of raising an integer 'n' to the power of 'e' using recursion.
         */
        // Base case 1: If the exponent 'e' is 0, the result is 1.
        if(e==0){
            return 1;
        } else if(e==1){
            // Base case 2: If the exponent 'e' is 1, the result is 'n'.
            return n;
        } else {
            // Recursive case: Calculate the result by multiplying 'n' with raise(n, e-1) to reduce the exponent by 1.
            return (n*raise(n, e-1));
        }
    }
    /**
     * The main method calls the method raise() and prints the result.
     * @param args
     */
    public static void main(String[] args){
        System.out.println(raise(2, 0));
        System.out.println(raise(2, 1));
        System.out.println(raise(2, 2));
    }
}
// end of class RaisedTo
