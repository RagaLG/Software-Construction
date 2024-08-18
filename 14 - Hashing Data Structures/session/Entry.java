/*
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW14
The purpose of this assignment is to help us learn HashMap Data Structures and implement them.
*/
package session;

public class Entry <K, V>{
    private K key;
    private V value;
    /**
     * Constructs an Entry with the specified key and value.
     *
     * @param key   The key of the key-value pair.
     * @param value The value of the key-value pair.
     */
    public Entry(K key, V value){
        this.key = key;
        this.value = value;
    }
    /**
     * Gets the key of the key-value pair.
     *
     * @return The key of the key-value pair.
     */
    public K getKey(){
        return key;
    }
    /**
     * Gets the value of the key-value pair.
     *
     * @return The value of the key-value pair.
     */
    public V getValue(){
        return value;
    }
    /**
     * Sets the key of the key-value pair.
     *
     * @param key The new key for the key-value pair.
     */
    public void setKey(K key){
        this.key = key;
    }
    /**
     * Sets the value of the key-value pair.
     *
     * @param value The new value for the key-value pair.
     */
    public void setValue(V value){
        this.value = value;
    }
}
// end of class Entry
