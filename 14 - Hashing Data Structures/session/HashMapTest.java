/*
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW14
The purpose of this assignment is to help us learn HashMap Data Structures and implement them.
*/
package session;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(10);
        map.put("ABC1234", "Raga");
        map.put("DFT589", "Alex");
        map.put("LK0946", "John");
        map.put("FHT258", "kate");
        for(String key : map.keySet()){
            System.out.println(key + " is " + map.get(key));
        }
    }
}
// end of class HashMapTest
