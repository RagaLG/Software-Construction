/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW05
The purpose of this assignment is to help us learn Recursion.
*/
package homework05;

public class Summing {
    public static int total(int n){
        // Base case: If 'n' is less than or equal to 0, the sum is 0.
        if(n<=0){
            return 0;
        } else {
            // Recursive case: Calculates the sum by adding 'n' to total(n-1), which 
            // sums all integers from 1 to 'n-1'
            return (n + total(n-1));
        }
    }
    /**
     * The main method calls the method total() and prints the result.
     * @param args
     */
    public static void main(String[] args){
        System.out.println(total(10));
    }
}
// end of class Summing
