/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
The purpose of this assignment is to help us get started with creating and using functions
in Java and learn to use git and github.
*/
package homework;
import java.util.Scanner;

public class EnergyConvertor {

    public static double equivalentEnergy(double grams){
        /*
        This function takes mass in grams as a parameter and converts it to its equivalent
        energy in Joules using E = mc^2 where c is the speed of light in m/s.
         */
        double c = 299792458;
        double energy = grams*c*c;
        return energy;
    }

    public static void main(String[] args){
        /*
        The main function prompts the user to enter the mass in grams and prints out the
        equivalent energy using equivalentEnergy() function.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of grams: ");
        double inGrams = scanner.nextDouble();
        double converted = equivalentEnergy(inGrams);
        System.out.println(converted + " Joules");
    }
}
// end of class EnergyConvertor
