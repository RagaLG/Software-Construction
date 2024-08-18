/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
The purpose of this assignment is to help us get started with creating and using functions
in Java and learn to use git and github.
*/
package homework;
import java.util.Scanner;

public class TemperatureConvertor {
    
    public static double toKelvin(double temp){ 
        /*
        This function takes temperature in Fahrenheit as a parameter and converts it to Kelvin
        using the formula - (5/9)*(temp - 32) + 273
         */   
        double kelvin = (1.0*5/9)*(temp - 32) + 273;
        return kelvin;
    }

    public static void main(String[] args){
        /*
        The main function prompts the user to enter a temperature in Fahrenheit of their choice
        and prints out the temperature in Kelvin using the function toKelvin().
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();
        double converted = toKelvin(temperature);
        System.out.println(temperature + " degrees Fahrenheit is " +converted + " degrees Kelvin");
        
    }
}
// end of class TemperatureConvertor
