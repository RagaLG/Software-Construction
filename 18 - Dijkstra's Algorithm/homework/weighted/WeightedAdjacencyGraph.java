/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW18
The purpose of this assignment is to help us understand Dijkstra's algorithm and implement it.
*/
package homework.weighted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class WeightedAdjacencyGraph<T> implements WeightedGraph<T> {
    private final Map<T,Vertex<T>> vertices;

    public Map<T, Vertex<T>> getVertices() {
        return vertices;
    }

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

    public List<T> dijkstrasShortestPath(T source, T destination) {
        // Ensure the source and destination vertices exist in the graph
        if (!vertices.containsKey(source) || !vertices.containsKey(destination)) {
            throw new IllegalArgumentException("Source or destination vertex not found in the graph");
        }

        // Initialize data structures for Dijkstra's algorithm
        Map<Vertex<T>, Integer> distances = new HashMap<>();  // Map to store the minimum distances
        Map<Vertex<T>, Vertex<T>> previousVertices = new HashMap<>();  // Map to store previous vertices in the shortest path
        PriorityQueue<Vertex<T>> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(distances::get));

        // Initialize distances and add source vertex to the priority queue
        for (Vertex<T> vertex : vertices.values()) {
            distances.put(vertex, vertex.equals(vertices.get(source)) ? 0 : Integer.MAX_VALUE);
            priorityQueue.offer(vertex);
        }

        while (!priorityQueue.isEmpty()) {
            Vertex<T> currentVertex = priorityQueue.poll();

            // Break the loop if the destination vertex is reached
            if (currentVertex.getValue().equals(destination)) {
                break;
            }

            for (Edge<T> edge : currentVertex.getEdges()) {
                Vertex<T> neighbor = edge.getTo();
                int newDistance = distances.get(currentVertex) + edge.getWeight();

                if (newDistance < distances.get(neighbor)) {
                    distances.put(neighbor, newDistance);
                    previousVertices.put(neighbor, currentVertex);
                    // Update the priority queue with the new distance
                    priorityQueue.remove(neighbor);
                    priorityQueue.offer(neighbor);
                }
            }
        }

        // Construct the shortest path from source to destination
        List<T> shortestPath = new ArrayList<>();
        for (Vertex<T> vertex = vertices.get(destination); vertex != null; vertex = previousVertices.get(vertex)) {
            shortestPath.add(vertex.getValue());
        }
        Collections.reverse(shortestPath);

        return shortestPath;
    }
}
// end of class WeightedAdjacencyGraph
