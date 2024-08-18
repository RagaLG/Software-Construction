/*
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
The purpose of the assignment is to learn and use boolean expressions and conditionals to
implement a variety of programs.
*/
package homework;

import java.util.Scanner;

public class AgeExperience {
    public static void main(String[] args){
        /*
        The main method asks the user for their age
        and prints a comment according to their age!
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age<10) {
            System.out.println("Is this your first program?");
        } else if (age<13) {
            System.out.println("A tween!");
        } else if (age<20) {
            System.out.println("A teen!");
        } else if (age<30) {
            System.out.println("A twenty-something!");
        } else {
            System.out.println("With age comes experience");
        }
    }
}
// end of class AgeExperience
