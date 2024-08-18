/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Homework 9
The purpose of this assignment is to help us learn Inheritance.
*/
package homework;

public class Fire extends Pokemon {
    private String type;
    /**
     * Constructs a new Fire type Pokémon with the specified name, attack, and health.
     * @param name   The name of the Fire type Pokémon.
     * @param attack The attack value of the Fire type Pokémon.
     * @param health The health value of the Fire type Pokémon.
     */
    public Fire(String name, int attack, int health){
        super(name, attack, health);
        this.type = "FIRE";
    }
    /**
     * Returns a string representation of the Fire type Pokémon.
     * This method overrides the parent class's toString method to provide specific details
     * about the Fire type Pokémon, including its name, type, attack, and health.
     * @return A string containing the name, type (FIRE), attack, and health of the Fire type Pokémon.
     */
    @Override
    public String toString(){
        return "Pokemon -  Name: " + name + "\n"
        + "Type: " + this.type + "\n" +
        "Attack: " + attack + "\n" +
        "Health: " + health;
    }
    /**
     * Simulates an attack from another Pokémon on this Fire type Pokémon.
     * Deducts the attack value from the health of this Pokémon and returns the damage done.
     * Overrides the Pokemon class attack method to apply specific damage calculations based on the attacker's type.
     * @param attackingPokemon The attacking Pokémon.
     * @return The amount of damage done to this Fire type Pokémon.
     */
    @Override
    public int attack(Pokemon attackingPokemon){
        String pokemonType = attackingPokemon.getType();
        int damage = attackingPokemon.getAttack();
        if(pokemonType == "GRASS"){
            damage = damage/2;
        }
        if(pokemonType == "WATER"){
            damage = 2*damage;
        }
        this.health -= damage;
        if(health < 0){
            health = 0;
        }
        return damage;
    }
}
// end of class Fire
