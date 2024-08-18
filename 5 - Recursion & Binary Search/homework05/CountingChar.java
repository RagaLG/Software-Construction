/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW05
The purpose of this assignment is to help us learn Recursion.
*/
package homework05;

public class CountingChar {

    public static int countChar(char[] array, char c) {
        /*
        This method calls the countChar method with an additional parameter of index passed
        to it.
         */
        return countChar(array, c, 0);
    }

    public static int countChar(char[] array, char c, int index){
        // Base case: if index has reached end of array, then return 0.
        if (index == array.length) {
            return 0;
        }
        // Recursive case: if the current character matches target character(c), then increment count
        // by 1.
        int count;
        if(array[index]==c){
            count = 1;
        } else {
            count = 0;
        }
        return count + countChar(array, c, index + 1);
    }
    /**
     * Demonstration of the countChar method. An array and a target character is declared.
     * Main method calls the method countChar and prints the result.
     * @param args
     */
    public static void main(String[] args){
        char[] array = {'a', 'b', 'c', 'd', 'e', 'a', 'f', 'a', 'd', 'f', 'a'};
        char target = 'a';
        int count = countChar(array, target);
        System.out.println(count);
    }
}
// end of class CountingChar
