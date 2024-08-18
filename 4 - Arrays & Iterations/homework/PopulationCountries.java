/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW04
The purpose of this assignment is to help us learn how to use loops and conditionals.
*/
package homework;
import java.util.Scanner;

public class PopulationCountries {
    /**
     * The main method prompts the user to enter the names of 5 countries and their population.
        After the user completes entering 5 countries and their population, it displays the 
        name and population of each country.
        Program calculates and displays the average population of the 5 countries in the end.
     * @param args
     */
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        String[] countries = new String[5];
        int[] population = new int[5];
        int total = 0; double average;
        System.out.println("Enter 5 countries and their population");
        for(int i = 0; i < countries.length; i++){
            System.out.print("Enter country " + (i+1) + ": ");
            countries[i] = scan.nextLine();
            System.out.print("Enter population of country " + (i+1) + ": ");
            population[i] = scanner.nextInt();
        }
        System.out.println();

        for(int i=0; i<countries.length; i++){
            // System.out.print("Country: " + countries[i] + "     Population: " + population[i]);
            System.out.println("Population of " + countries[i] + ": " + population[i]);
        }

        for(int i=0; i<population.length; i++){
            total += population[i];
        }
        System.out.println();
        average = (1.0*total)/population.length;
        System.out.println("Average population of 5 countries: " + average);
    }
}
// end of class PopulationCountries
