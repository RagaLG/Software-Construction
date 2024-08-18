/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Homework 9
The purpose of this assignment is to help us learn Inheritance.
*/
package homework;

public class Arena {
    /**
     * Simulates a battle between two Pokémon.
     * @param p1 The first Pokémon participating in the battle.
     * @param p2 The second Pokémon participating in the battle.
     */
    public static void pitPokemon(Pokemon p1, Pokemon p2){
        System.out.println("Initial Status: ");
        System.out.println("Pokemon 1> " + p1);
        System.out.println("Pokemon 2> " + p2);
        System.out.println("............................");
        while(p1.isConscious() && p2.isConscious()){
            int damage1 = p1.attack(p2);
            int damage2 = p2.attack(p1);
            System.out.println(p1.getName() + " attacked " + p2.getName() + "- Damage done: " + damage2 + ", Remaining Health: " + p2.getHealth());
            System.out.println(p2.getName() + " attacked " + p1.getName() + "- Damage done: " + damage1 + ", Remaining Health: " + p1.getHealth());
            if(!p1.isConscious() && !p2.isConscious()){
                System.out.println("It's a draw, both the Pokemons are knocked out!");
            } else if(!p1.isConscious()){
                System.out.println(p1.getName() + " has been knocked out, " + p2.getName() + " wins!");
            } else if(!p2.isConscious()){
                System.out.println(p2.getName() + " has been knocked out, " + p1.getName() + " wins!");
            }
        }
    }
    /**
     * Declares two pokemon instances and uses pitPokemon() to simulate a battles between them.
     * @param args
     */
    public static void main(String[] args){
        Pokemon p1 = new Pokemon("Pikachu", 20, 80);
        Pokemon p2 = new Fire("Charmander", 15, 95);
        pitPokemon(p1, p2);
    }
}
// end of class Arena
