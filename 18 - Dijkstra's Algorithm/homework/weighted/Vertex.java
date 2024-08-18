package homework.weighted;

import java.util.Set;
import java.util.HashSet;

public class Vertex<T> {
    private T value;
    private Set<Edge<T>> edges;

    // Constructor
    Vertex(T value) {
        this.value = value;
        edges = new HashSet<>();
    }

    T getValue() {
        return value;
    }

    // Add neighbor to my Set of neighbors
    void addNeighbor(Vertex<T> neighbor, int weight) {
        Edge<T> edge = new Edge<>(this, neighbor, weight);
        edges.add(edge);
    }

    // Return the Set of neighbors, get the vertices to which this vertx is connected
    public Set<Vertex<T>> getNeighbors() {
        Set<Vertex<T>> neighbors = new HashSet<>();
        for(Edge<T> edge : edges){
            neighbors.add(edge.getTo());
        }
        return neighbors;
    }

    Set<Edge<T>> getEdges(){
        return edges;
    }
}
