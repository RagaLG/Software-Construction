/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW18
The purpose of this assignment is to help us understand Dijkstra's algorithm and implement it.
*/
package session;

import java.util.Map;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
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

    @Override
    public boolean depthFirstSearch(T start, T end) {
        //create an empty set
        Set<Vertex<T>> visited = new HashSet<>();
        //Add the start vertex to it
        Vertex<T> startVertex = vertices.get(start);
        Vertex<T> endVertex = vertices.get(end);
        visited.add(startVertex);
        //Call visit DFS with the start vertex and the set
        visitDFS(startVertex,visited);
        //return true if the end vertex is in the
        return visited.contains(endVertex);
    }

    private void visitDFS(Vertex<T> vertex, Set<Vertex<T>> visited){
        //Iterate over the neighbors of the vertex
        for(Vertex<T> neighbor : vertex.getNeighbors()){
            // For each neighbor, if it's not already in the set
            if(!visited.contains(neighbor)){
                //Add it and make a recurcive call to visitDFS with the neighbor
                visited.add(neighbor);
                visitDFS(neighbor,visited);
            }
        }
    }

    @Override
    public List<T> depthFirstPath(T start, T end){
        Vertex<T> startVertex = vertices.get(start);
        Set<Vertex<T>> visited = new HashSet<>();
        visited.add(startVertex);
        Vertex<T> endVertex = vertices.get(end);
        return visitDFSPath(startVertex, endVertex, visited);
    }

    private List<T> visitDFSPath(Vertex<T> vertex, Vertex<T> end, Set<Vertex<T>> visited){
        //If the vertex is the goal. We're going to add it to the path and return the path
        if(vertex == end){
            List<T> path = new LinkedList<>();
            path.add(vertex.getValue());
            return path;
        } else {
            //If the vertex is the goal. We're going to add it to the path and return the path
            for(Vertex<T> neighbor : vertex.getNeighbors()){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    List<T> path = visitDFSPath(neighbor, end, visited);
                    //If that returns a path that is not know that means we found a path to the goal somewhere down that
                    if(path != null){
                        path.add(0, vertex.getValue());
                        //the vertex will be added to the path and return the path
                        return path;
                    }
                }
            }
            return null;
        }
    }
}
// end of class AdjacencyGraph
