/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Homework 9
The purpose of this assignment is to help us learn Inheritance.
*/
package homework;

import java.util.Random;
import java.util.Scanner;

public class TestClass {
    /**
     * Generates a random Pokémon with random attack and health values.
     * @param random The random number generator to use for generating random values.
     * @return A randomly generated Pokémon.
     */
    public static Pokemon getPokemon(Random random){
        int randomAttack = random.nextInt(51) + 50;
        int randomHealth = random.nextInt(501) + 500;
        Pokemon[] types = {new Pokemon("randomNormalPokemon", randomAttack, randomHealth),
                        new Fire("randomFirePokemon", randomAttack, randomHealth),
                        new Water("randomWaterPokemon", randomAttack, randomHealth),
                        new Grass("randomGrassPokemon", randomAttack, randomHealth)};
        Pokemon randomPoke = types[random.nextInt(types.length)];
        return randomPoke;
    }
    /**
     * The main method, which starts the Pokémon battle simulation program.
     * @param args
     */
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean battling = true;
        while(battling==true){
            Arena.pitPokemon(getPokemon(random), getPokemon(random));
            System.out.println("Would you like to watch another battle?(yes/quit)");
            String answer = scanner.nextLine();
            if(answer.equals("quit")){
                System.out.println("Game Over!");
                battling = false;
                break;
            } else if(answer.equals("yes")){
                battling = true;
                System.out.println("Next Battle-------------");
            }
        }
    }
}
// end of class TestClass
