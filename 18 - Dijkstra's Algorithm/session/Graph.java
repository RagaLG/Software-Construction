package session;

import java.util.LinkedList;
import java.util.List;

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

    boolean depthFirstSearch(T start, T end);
    
    List<T> depthFirstPath(T start, T end);

    int size();
}
