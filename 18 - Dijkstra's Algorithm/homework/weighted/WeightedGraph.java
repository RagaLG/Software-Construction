/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW18
The purpose of this assignment is to help us understand Dijkstra's algorithm and implement it.
*/
package homework.weighted;

import java.util.List;

public interface WeightedGraph<T> {
    void addValue(T value);
    void connect(T value, T neighbor, int weight);
    List<T> dijkstrasShortestPath(T source, T destination);
}
// end of interface WeightedGraph
