/*
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
The purpose of the assignment is to learn and use boolean expressions and conditionals to
implement a variety of programs.
*/
package homework;
import java.util.Scanner;

public class MusicAndMovies {
    public static void main(String[] args){
        /*
        The main method ask the user to enter 1 to discuss music and 2 to
        discuss movies.
        If the entry is 1, a question regarding a band is asked and the user must enter
        their reply as "yes" or "no". The program prints a comment accordingly.
        If the entry is 2, a question about starwars is asked and the user must enter
        their reply. The program prints a comment accordingly.
         */
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1 for music or 2 for movies: ");
        int number = scanner.nextInt();
        if (number == 1){
            System.out.println("My favourite band is Maroon 5. Do you like Maroon 5?(Answer: yes or no )");
            String answer = scan.nextLine();
            switch(answer){
                case "yes":
                    System.out.println("Good taste!");
                    break;
                case "no":
                    System.out.println("There is no accounting for taste!");
            }
        } else if (number == 2){
            System.out.println("which Star Wars episode was the best?");
            int episode = scanner.nextInt();
            switch(episode){
                case 1:
                case 2:
                case 3:
                    System.out.println("Um, no.");
                    break;
                case 4:
                case 5:
                    System.out.println("I agree!");
                    break;
                case 6:
                case 7:
                    System.out.println("I like those, too!");
                    break;
            }
        }
    }
}
// end of class MusicAndMovies
