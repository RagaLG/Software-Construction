/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW17
The purpose of this assignment is to help us understand the concepts of Graphs and BFS, implement BFS and 
use it to solve a problem.
*/
package homework;

import java.util.LinkedList;

public interface Graph<T> {
    void addValue(T value);
    
    boolean contains(T value);
    //void connect(T value1, T value2);
    //void connectDirected(T value1, T value2);
    void connectDirected(T value1, T ...values);

    //void connectUndirected(T value1, T value2);
    void connectUndirected(T value1, T ...values);

    boolean breadthFirstSearch(T startValue, T endValue);

    LinkedList<T> breadthFirstPath(T startValue, T endValue);

    int size();
}
// end of class Graph
