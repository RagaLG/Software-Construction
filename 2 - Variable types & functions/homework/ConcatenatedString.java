/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
The purpose of this assignment is to help us get started with creating and using functions
in Java and learn to use git and github.
*/
package homework;
import java.util.Scanner;

public class ConcatenatedString {
    public static String together(String word, int number, double deci){
        /*
        This function takes a String, an integer(int) and a decimal(double) and returns
        a string with all the parameter values concatenated together.
         */
        return "" + word + number + deci;
    }

    public static void main(String[] args){
        /*
        The main method prompts the user for String value, an integer value and a decimal value
        and returns the concatenated string using the together() function.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String word1 = scanner.nextLine();
        System.out.print("Enter an Integer: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter a Double: ");
        double deci1 = scanner.nextDouble();
        String result = together(word1, number1, deci1);
        System.out.println(result);
    }
}
// end of class ConcatenatedString
