/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW17
The purpose of this assignment is to help us understand the concepts of Graphs and BFS, implement BFS and 
use it to solve a problem.
*/
package homework;

import java.util.Set;
import java.util.HashSet;

public class Vertex<T> {
    private T value;

    // set of vertices that are connected to this vertex
    private Set<Vertex<T>> neighbors;

    // Constructor
    Vertex(T value) {
        this.value = value;
        neighbors = new HashSet<>();
    }

    T getValue() {
        return value;
    }

    // Add neighbor to my Set of neighbors
    void addNeighbor(Vertex<T> neighbor) {
        neighbors.add(neighbor);
    }

    // Return the Set of neighbors, get the vertices to which this vertex is connected
    public Set<Vertex<T>> getNeighbors() {
        return neighbors;
    }
}
// end of class Vertex
