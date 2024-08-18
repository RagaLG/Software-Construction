/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW05
The purpose of this assignment is to help us learn Recursion.
*/
package homework05;

public class Multiplication {

    public static int product(int x, int y){
        /*
        This method takes in two integer values and returns the product of the two integers.
         */
        // Base case: if either x or y is 0, return 0. 
        if(x==0 || y==0){
            return 0;
        } else {
            // Recursice case: calculate the product by adding x to itself by y-1 times.
            return (x + product(x, y-1));
        }
    }
    /**
     * Main method calls product() and prints the result by passing parameters.
     * @param args
     */
    public static void main(String[] args){
        System.out.println(product(7,4));
    }
}
// end of class Multiplication
