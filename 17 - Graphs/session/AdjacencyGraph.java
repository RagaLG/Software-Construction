package session;

import java.util.Map;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class AdjacencyGraph<T> implements Graph<T> {
    private final Map<T, Vertex<T>> vertices;

    public AdjacencyGraph() {
        vertices = new HashMap<>();
    }

    @Override
    public void addValue(T value){
        vertices.put(value, new Vertex<T>(value));
    }

    
    public void connect(T first, T second){
        Vertex<T> vertex1 = vertices.get(first);
        Vertex<T> vertex2 = vertices.get(second);
        vertex1.addNeighbor(vertex2);
        vertex2.addNeighbor(vertex1);
    }

    @Override
    public boolean contains(T value){
        return vertices.containsKey(value);
    }

    @Override
    public void connectDirected(T value, T ...values){
        Vertex<T> vertex = vertices.get(value);
        for (T neighborValue : values) {
            Vertex<T> neighbor = vertices.get(neighborValue);
            vertex.addNeighbor(neighbor);
        }
    }

    @Override
    public void connectUndirected(T value, T ...values){
        Vertex<T> vertex = vertices.get(value);
        for (T neighborValue : values) {
            Vertex<T> neighbor = vertices.get(neighborValue);
            vertex.addNeighbor(neighbor);
            neighbor.addNeighbor(vertex);
        }
    }

    @Override
    public int size(){
        return vertices.size();
    }

    @Override
    public boolean breadthFirstSearch(T startValue, T endValue) {
        Vertex<T> start = vertices.get(startValue);
        Vertex<T> end = vertices.get(endValue);

        Queue<Vertex<T>> queue = new LinkedList<>();
        Set<Vertex<T>> seen = new HashSet<>();

        queue.add(start);
        seen.add(start);

        while(queue.size() > 0) {
            Vertex<T> next = queue.poll();
            if(next==end){
                return true;
            } else {
                for(Vertex<T> neighbor : next.getNeighbors()) {
                    if(!seen.contains(neighbor)) {
                        queue.add(neighbor);
                        seen.add(neighbor);
                    }
                }
            }
        }
        return false;
    }

    @Override
    public LinkedList<T> breadthFirstPath(T startValue, T endValue) {
        Vertex<T> start = vertices.get(startValue);
        Vertex<T> end = vertices.get(endValue);

        Queue<Vertex<T>> queue = new LinkedList<>();
        Map<Vertex<T>, Vertex<T>> visited = new HashMap<>();

        queue.add(start);
        visited.put(start, null);

        while(queue.size() > 0) {
            Vertex<T> v = queue.poll();
            if(v==end){
                LinkedList<T> path = new LinkedList<>();
                Vertex<T> p = end;
                while(p != null){
                    path.add(0, p.getValue());
                    p = visited.get(p);
                }
                return path;
            } else {
                for(Vertex<T> neighbor : v.getNeighbors()) {
                    if(!visited.containsKey(neighbor)) {
                        queue.add(neighbor);
                        visited.put(neighbor, v);
                    }
                }
            }       
        }
        return null;    
    }
}
