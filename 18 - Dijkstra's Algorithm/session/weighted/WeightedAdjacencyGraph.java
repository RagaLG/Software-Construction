package session.weighted;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedAdjacencyGraph<T> implements WeightedGraph<T> {
    private final Map<T,Vertex<T>> vertices;

    public WeightedAdjacencyGraph() {
        vertices = new HashMap<>();
    }

    @Override
    public void addValue(T value) {
        Vertex<T> vertex = new Vertex<>(value);
        vertices.put(value, vertex);
    }
    
    @Override
    public void connect(T value1, T value2, int weight) {
        Vertex<T> from = vertices.get(value1);
        Vertex<T> to = vertices.get(value2);
        from.addNeighbor(to, weight);
    }

    @Override
    public List<T> dijkstrasShortestPath() {
        return null;
    }
}
