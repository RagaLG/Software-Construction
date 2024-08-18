/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Homework 9
The purpose of this assignment is to help us learn Inheritance.
*/
package homework;

public class Grass extends Pokemon {
    private String type;
    /**
     * Constructs a new Grass type Pokémon with the specified name, attack, and health.
     * @param name   The name of the Grass type Pokémon.
     * @param attack The attack value of the Grass type Pokémon.
     * @param health The health value of the Grass type Pokémon.
     */
    public Grass(String name, int attack, int health){
        super(name, attack, health);
        this.type = "GRASS";
    }
    /**
     * Returns a string representation of the Grass type Pokémon.
     * This method overrides the parent class's toString method to provide specific details
     * about the Grass type Pokémon, including its name, type, attack, and health.
     * @return A string containing the name, type (GRASS), attack, and health of the Grass type Pokémon.
     */
    @Override
    public String toString(){
        return "Pokeman -  Name: " + name + "\n"
        + "Type: " + this.type + "\n" +
        "Attack: " + attack + "\n" +
        "Health: " + health;
    }
    /**
     * Simulates an attack from another Pokemon on this Grass type Pokemon.
     * Deducts the attack value from the health of this Pokemon and returns the damage done.
     * Overrides the Pokemon class attack method to apply specific damage calculations based on the attacker's type.
     * @param attackingPokemon The attacking Pokemon.
     * @return The amount of damage done to this Grass type Pokémon.
     */
    @Override
    public int attack(Pokemon attackingPokemon){
        String pokemonType = attackingPokemon.getType();
        int damage = attackingPokemon.getAttack();
        if(pokemonType == "FIRE"){
            damage = 2*damage;
        }
        if(pokemonType == "WATER"){
            damage = damage/2;
        }
        this.health -= damage;
        if(health < 0){
            health = 0;
        }
        return damage;
    }
}
// end of class Grass
