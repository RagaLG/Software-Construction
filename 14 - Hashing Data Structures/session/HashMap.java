/*
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW14
The purpose of this assignment is to help us learn HashMap Data Structures and implement them.
*/
package session;

public class HashMap <K, V> implements Map <K, V>{
    Entry[] entries;
    int size;
    /**
     * Constructs an empty hash map with an initial capacity of 100.
     */
    public HashMap(){
        this.entries = new Entry[100];
        this.size = 0;
    }
    /**
     * Returns the index in the array for the given key.
     *
     * @param key The key for which the index is calculated.
     * @return The index in the array for the given key.
     */
    int getIndex(K key){
        return Math.abs(key.hashCode()% entries.length);
    }
    /**
     * Associates the specified value with the specified key in this map.
     *
     * @param key   The key with which the specified value is to be associated.
     * @param value The value to be associated with the specified key.
     */
    @Override
    public void put(K key, V value) {  
        //int hashcode = key.hashCode();
        int index = getIndex(key);
        Entry <K, V> entry = new Entry<>(key, value);
        entries[index] = entry;
        size++;  
    }
    /**
     * Returns the value to which the specified key is mapped, or null if this map
     * contains no mapping for the key.
     *
     * @param key The key whose associated value is to be returned.
     * @return The value to which the specified key is mapped, or null if this map
     *         contains no mapping for the key.
     */
    @Override
    public V get(K key) {
        //int hashcode = key.hashCode();
        int index = getIndex(key);
        Entry <K, V> entry = (Entry<K, V>)entries[index];
        return entry.getValue();
    }
    /**
     * Returns the number of key-value mappings in this map.
     *
     * @return The number of key-value mappings in this map.
     */
    @Override
    public int size() {
        return 0;
    }
}
// end of class HashMap
