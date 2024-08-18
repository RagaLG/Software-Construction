/*
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW14
The purpose of this assignment is to help us learn HashMap Data Structures and implement them.
*/
package session;

public interface Map <K, V>{
    void put(K key, V value);
    V get(K key);
    int size();
}
// end of interface Map
