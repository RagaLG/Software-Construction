/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Homework 9
The purpose of this assignment is to help us learn Inheritance.
*/
package homework;

public class Pokemon {
    protected String name;
    protected String type;
    protected int attack;
    protected int health;

    /**
     * Constructs a new Pokemon with the specified name, attack, and health.
     * Initializes the Type to NORMAL
     * @param name   The name of the Pokémon.
     * @param attack The attack value of the Pokémon.
     * @param health The health value of the Pokémon.
     */
    public Pokemon(String name, int attack, int health){
        this.name = name;
        this.type = "NORMAL";
        this.attack = attack;
        this.health = health;
    }
    /**
     * Get the name of the Pokémon.
     * @return The name of the Pokémon.
     */
    public String getName(){
        return this.name;
    }
    /**
     * Set the name of the Pokémon.
     * @param name The new name for the Pokémon.
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * Get the type of the Pokémon.
     * @return The type of the Pokémon.
     */
    public String getType(){
        return this.type;
    }
    /**
     * Set the type of the Pokémon.
     * @param type The new type for the Pokémon.
     */
    public void setType(String type){
        this.type = type;
    }
    /**
     * Get the attack value of the Pokémon.
     * @return The attack value of the Pokémon.
     */
    public int getAttack(){
        return this.attack;
    }
    /**
     * Set the attack value of the Pokémon.
     * @param attack The new attack value for the Pokémon.
     */
    public void setAttack(int attack){
        this.attack = attack;
    }
    /**
     * Get the health value of the Pokémon.
     * @return The health value of the Pokémon.
     */
    public int getHealth(){
        return this.health;
    }
    /**
     * Set the health value of the Pokémon.
     * @param health The new health value for the Pokémon.
     */
    public void setHealth(int health){
        this.health = health; 
    }
    /**
     * Returns a string representation of the Pokémon.
     * @return A string containing the name, type, attack, and health of the Pokémon.
     */
    public String toString(){
        return "Pokemon -  Name: " + this.name + "\n"
        + "Type: " + this.type + "\n" +
        "Attack: " + this.attack + "\n" +
        "Health: " + this.health;
    }
    /**
     * Simulates an attack from another Pokémon on this Pokémon.
     * Deducts the attack value from the health of this Pokémon and returns the damage done.
     * @param attackingPokeman The attacking Pokémon.
     * @return The amount of damage done to this Pokémon.
     */
    public int attack(Pokemon attackingPokemon){
        int damage = attackingPokemon.getAttack();
        this.health -= damage;
        if(health < 0){
            health = 0;
        }
        return damage;
    }
    /**
     * Checks if the Pokemon is conscious (has health greater than 0).
     * @return true if the Pokemon is conscious, false otherwise.
     */
    public boolean isConscious(){
        return this.health > 0;
    }
}
// end of class Pokemon
