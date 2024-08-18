/*
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
The purpose of the assignment is to learn and use boolean expressions and conditionals to
implement a variety of programs.
*/
package homework;
import java.util.Scanner;
import java.util.Random;

public class ThreeGuesses {
    public static boolean guessNumber(int number, int guess){
        /*
        This method takes in a number and another number which the user is guessing
        and returns a boolean value true if the guess is correct and prints "Correct!"
        If the number and guess didn't match, the method return false and prints
        if the guess is "Too loo!" or "Too high!".
         */
        if(guess == number){
            System.out.println("Correct!");
            return true;
        } else if(guess < number){
            System.out.println("Too low!");
            return false;
        } else if(guess > number){
            System.out.println("Too high!");
            return false;
        }
        return false;
    }

    public static boolean userEntry(int guessNum, int number){
        /*
        This method asks the user to enter a number between to 1 to 10.
        It uses the method guessNumber to verify if the number and guess match or don't
        and returns a boolean value from calling the method guessNumber().
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess any number from (1-10), You have total three guesses!\n" + "Guess " + guessNum + ": ");
        int guess = scanner.nextInt();
        boolean value = guessNumber(number, guess);
        return value;
    }
    public static void main(String[] args){
        /*
        The main method generates a random number, uses the method userEntry
        to ask for a guess and lets the user know if their guess is correct or if they
        have run out of their three guesses.
         */
        Random random = new Random();
        int number = random.nextInt(10);
        number = number + 1;
        int guessNum = 1;
        if(guessNum<=3){
            boolean value1 = userEntry(guessNum, number);
            if(value1 == true){
                //System.out.println("Win!");
                guessNum = 10;
            } else {
                guessNum++;
            }
        }
        if(guessNum<=3){
            boolean value1 = userEntry(guessNum, number);
            if(value1 == true){
                //System.out.println("Win!");
                guessNum = 10;
            } else {
                guessNum++;
            }
        }
        if(guessNum<=3){
            boolean value1 = userEntry(guessNum, number);
            if(value1 == true){
                //System.out.println("Win!");
                guessNum = 10;
            } else {
                guessNum++;
                System.out.println();
                System.out.println("Three guesses done, sorry! - Correct Number: " + number); 
            }
        }       
    }
}
// end of class ThreeGuesses
