package session.weighted;

import java.util.List;

public interface WeightedGraph<T> {
    void addValue(T value);
    void connect(T value, T neighbor, int weight);
    List<T> dijkstrasShortestPath();
}
