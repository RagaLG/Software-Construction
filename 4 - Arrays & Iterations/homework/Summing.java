/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW04
The purpose of this assignment is to help us learn how to use loops and conditionals.
*/
package homework;
import java.util.Scanner;

public class Summing {
    /**
     * The main method prompts the user to input two integers and it displays the sum
        of the two integers. 
        The program asks the user if they wish to perform the operation again(yes/no)
        'yes' : loop repeats
        'no' : programs ends
     * @param args
     */
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        String answer = ""; 
        boolean val = false;
        do{
            System.out.print("Enter two numbers: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println("Sum: " + (num1 + num2)); // Calculates and displays the sum
            System.out.println("Do you wish to perform the operation again?(yes/no)");
            answer = scan.nextLine().toLowerCase(); //Convert to lowercase
            if(answer.equals("yes")){
                val = true;
            } else if(answer.equals("no")){
                val = false;
            }
        } while(val!=false);
    }
}
// end of class Summing
